package hr.algebra.catan;

import hr.algebra.catan.Controller.GameController;
import hr.algebra.catan.Model.GameBoard;
import hr.algebra.catan.Model.UserRole;
import hr.algebra.catan.Networking.NetworkConfiguration;
import hr.algebra.catan.Networking.PlayerType;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MainApplication extends Application {

    private static Scene mainScene;

    public static UserRole activeUserRole;
    public static PlayerType playerLoggedIn;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1525, 745);
        stage.setTitle(activeUserRole.name());
        stage.setScene(scene);
        stage.show();
        mainScene = scene;
    }
    public static void startServer(){
        acceptRequestsOnServer();
    }

    private static void acceptRequestsOnServer() {
        Integer serverPort = ConfigurationReader.readIntegerConfigurationValue(ConfigurationKey.SERVER_PORT);

        try (ServerSocket serverSocket =
                     new ServerSocket(serverPort)) {
            System.err.println("Server listening on port: " + serverSocket.getLocalPort());

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.err.println("Client connected from port: " + clientSocket.getPort());
                Platform.runLater(() -> processSerializableClient(clientSocket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String playerName = args[0];

        if(PlayerType.SERVER.name().equals(playerName)){
            playerLoggedIn = PlayerType.SERVER;
            new Thread(MainApplication::startServer).start();
        }
        else {
            playerLoggedIn = PlayerType.CLIENT;
            new Thread(MainApplication::startClient).start();
        }

        System.out.println("the player name is: " + playerLoggedIn);

        launch();

    }

    public static void startClient(){
        acceptRequestsOnPort(NetworkConfiguration.CLIENT_PORT);
    }


    private static void processSerializableClient(Socket clientSocket) {
        try (ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
             ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());){
            GameBoard gameBoard = (GameBoard)ois.readObject();
            Platform.runLater(() -> GameController.restoreGameboard(gameBoard));
            System.out.println("Gameboard recieved from the client");
            oos.writeObject("confirmation the gameboard has been revieced");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
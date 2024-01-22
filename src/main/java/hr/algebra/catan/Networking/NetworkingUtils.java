package hr.algebra.catan.Networking;

import hr.algebra.catan.Model.GameBoard;
import hr.algebra.catan.Controller.GameController;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkingUtils {

    public static void sendGameBoardToServer(GameBoard gameBoard) {
        try (Socket clientSocket = new Socket(NetworkConfiguration.HOST, NetworkConfiguration.SERVER_PORT)){
            System.err.printf("Client is connecting to %s:%d%n", clientSocket.getInetAddress(), clientSocket.getPort());
            //sendPrimitiveRequest(clientSocket);
            sendSerializableRequest(clientSocket, gameBoard);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void sendGameBoardToClient(GameBoard gameBoard) {
        try (Socket clientSocket = new Socket(NetworkConfiguration.HOST, NetworkConfiguration.CLIENT_PORT)){
            System.err.printf("Server is connecting to %s: %d%n", clientSocket.getInetAddress(), clientSocket.getPort());
            //sendPrimitiveRequest(clientSocket);
            sendSerializableRequest(clientSocket, gameBoard);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void sendSerializableRequest(Socket client, GameBoard gameBoard) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
        oos.writeObject(gameBoard);
        System.out.println("GameBoard sent to the server");
    }
}

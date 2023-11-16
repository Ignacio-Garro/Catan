package hr.algebra.catan;

import hr.algebra.catan.Model.PlayerType;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 740);
        stage.setTitle("CATAN");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        /*
        String playerName = args[0];

        if(PlayerType.SERVER.name().equals(playerName)){
            playerLoggedIn = PlayerType.SERVER;
            //new Thread(MainApplication::StartServer).start();
        }
        else {
            playerLoggedIn = PlayerType.CLIENT;
        }

        System.out.println("the player name is: " + playerLoggedIn);
        */
        launch();

    }
}
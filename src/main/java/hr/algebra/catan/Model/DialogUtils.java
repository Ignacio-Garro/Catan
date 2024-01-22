package hr.algebra.catan.Model;

import javafx.scene.control.Alert;

public class DialogUtils {

    public static boolean CheckWinner(GameBoard gameBoard, Integer POINTS_TO_WIN) {
        if (gameBoard.getBluePlayer().getNumPoints() >= POINTS_TO_WIN) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("WINNER!!!");
            alert.setHeaderText("BLUE PLAYER HAS WON THE GAME");
            alert.showAndWait();
            return true;
        } else if (gameBoard.getRedPlayer().getNumPoints() >= POINTS_TO_WIN) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("WINNER!!!");
            alert.setHeaderText("RED PLAYER HAS WON THE GAME");
            alert.showAndWait();
            return true;
        }
        return false;
    }

    public static void ShowSaveDialog(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Save game successful!");
        alert.setHeaderText(null);
        alert.setContentText("You have successfully saved the game!");

        alert.showAndWait();
    }
    public static void ShowLoadDialog(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Load game successful!");
        alert.setHeaderText(null);
        alert.setContentText("You have successfully loaded the game!");

        alert.showAndWait();
    }
}

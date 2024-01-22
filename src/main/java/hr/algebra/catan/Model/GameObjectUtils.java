package hr.algebra.catan.Model;

import hr.algebra.catan.Controller.GameController;
import hr.algebra.catan.Model.Objects.Road;
import hr.algebra.catan.Model.Objects.Town;
import hr.algebra.catan.Networking.GameBoardUtils;
import javafx.scene.paint.Color;

public class GameObjectUtils {
    public static boolean isTownConnectedByRoad(int row, int col, Color playerColor, Tile[][] tileGameBoard) {
        int yAxis = -1;
        int xAxis = -1;
        while (yAxis < 2) {
            while (xAxis < 2) {
                //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                if ((row + yAxis) >= 0 && (row + yAxis) < GameBoardUtils.NUM_OF_ROWS && (col + xAxis) >= 0 && (col + xAxis) < GameBoardUtils.NUM_OF_COLS &&
                        tileGameBoard[row + yAxis][col + xAxis] != null &&
                        tileGameBoard[row + yAxis][col + xAxis].getGameObject() != null &&
                        tileGameBoard[row + yAxis][col + xAxis].getGameObject().getClass().equals(Road.class) &&
                        GameController.stringToColor(tileGameBoard[row + yAxis][col + xAxis].getGameObject().getStringColor()) == playerColor) {
                    return true;
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }
    public static boolean isRoadConnectedByTownOrRoad(int row, int col, Color playerColor, Tile[][] tileGameBoard) {
        int yAxis = -1;
        int xAxis = -1;
        while (yAxis <= 1) {
            while (xAxis <= 1) {
                //THERE IS A TOWN HERE
                if ((row + yAxis) >= 0 && (row + yAxis) < GameBoardUtils.NUM_OF_ROWS && (col + xAxis) >= 0 && (col + xAxis) < GameBoardUtils.NUM_OF_COLS &&
                        tileGameBoard[row + yAxis][col + xAxis] != null && tileGameBoard[row + yAxis][col + xAxis].getButton() != null) {
                    //TOWN IS PLACED
                    if (tileGameBoard[row + yAxis][col + xAxis].getGameObject() != null) {
                        //TOWN IS OF THE PLAYER
                        if (GameController.stringToColor(tileGameBoard[row + yAxis][col + xAxis].getGameObject().getStringColor()) == playerColor) {
                            return true;
                        }
                    }
                    //TOWN NOT PLACED
                    else {
                        //TRY TO SEE IF THERE IS A ROAD THAT CONNECTS
                        int yAxis2 = -1;
                        int xAxis2 = -1;
                        while (yAxis2 < 2) {
                            while (xAxis2 < 2) {
                                //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                                if ((row + yAxis + yAxis2) >= 0 && (row + yAxis + yAxis2) < GameBoardUtils.NUM_OF_ROWS && (col + xAxis + xAxis2) >= 0 && (col + xAxis + xAxis2) < GameBoardUtils.NUM_OF_COLS &&
                                        tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2] != null &&
                                        tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject() != null &&
                                        tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject().getClass().equals(Road.class) &&
                                        GameController.stringToColor(tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject().getStringColor()) == playerColor) {
                                    return true;
                                }
                                xAxis2++;
                            }
                            yAxis2++;
                            xAxis2 = -1;
                        }
                    }
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }
    public static boolean TownProximityRule(int row, int col, Tile[][] tileGameBoard) {
        for (int r = -2; r < 4; r = r + 2) { // -2 0 2
            for (int c = -2; c < 4; c = c + 2) {
                if ((row + r) >= 0 && (row + r) < GameBoardUtils.NUM_OF_ROWS && (col + c) >= 0 && (col + c) < GameBoardUtils.NUM_OF_COLS &&
                        tileGameBoard[row + r][col + c] != null &&
                        tileGameBoard[row + r][col + c].getGameObject() != null &&
                        tileGameBoard[row + r][col + c].getGameObject().getClass().equals(Town.class)) {
                    return false;
                }
            }
        }

        return true;
    }
}

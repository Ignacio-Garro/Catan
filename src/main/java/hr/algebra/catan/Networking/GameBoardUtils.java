package hr.algebra.catan.Networking;

import hr.algebra.catan.Controller.GameController;
import hr.algebra.catan.Model.DialogUtils;
import hr.algebra.catan.Model.GameBoard;
import hr.algebra.catan.Model.Objects.ResourceTile;
import hr.algebra.catan.Model.Tile;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class GameBoardUtils {

    public static final Integer NUM_OF_ROWS = 23;
    public static final Integer NUM_OF_COLS = 21;

    public static GameBoard CreateGameState(GameBoard gameBoard, boolean winnerExists){
        //MAKE GAME BOARD TO SAVE
        Tile[][] gameBoardTiles = new Tile[NUM_OF_ROWS][NUM_OF_COLS];

        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j < NUM_OF_COLS; j++) {
                //There is something in that tile
                if (gameBoard.getGameBoardTiles()[i][j] != null) {
                    gameBoardTiles[i][j] = gameBoard.getGameBoardTiles()[i][j];
                }
            }
        }

        return new GameBoard(gameBoard.getPlayerTurn(), gameBoard.getBluePlayer(), gameBoard.getRedPlayer(), gameBoard.getNumberOfMoves(), gameBoardTiles,
                gameBoard.isCHEATS(), gameBoard.isSetUpDone(),winnerExists, gameBoard.getIntDice1(), gameBoard.getIntDice2());
    }

    public static void restoreGameBoard(GameBoard gameBoardThatWasSent, GameBoard gameBoard){
        for (int i = 0; i < GameBoardUtils.NUM_OF_ROWS; i++) {
            for (int j = 0; j < GameBoardUtils.NUM_OF_COLS; j++) {
                //RESOURCE TILES
                if(gameBoard.getGameBoardTiles()[i][j] != null){
                    if(gameBoardThatWasSent.getGameBoardTiles()[i][j] != null){
                        gameBoard.getGameBoardTiles()[i][j].setImageViewInt(gameBoardThatWasSent.getGameBoardTiles()[i][j].getImageViewInt());
                        gameBoard.getGameBoardTiles()[i][j].setResourceNumber(gameBoardThatWasSent.getGameBoardTiles()[i][j].getResourceNumber());
                        gameBoard.getGameBoardTiles()[i][j].setResourceTile(gameBoardThatWasSent.getGameBoardTiles()[i][j].getResourceTile());
                        gameBoard.getGameBoardTiles()[i][j].setRow(gameBoardThatWasSent.getGameBoardTiles()[i][j].getRow());
                        gameBoard.getGameBoardTiles()[i][j].setCol(gameBoardThatWasSent.getGameBoardTiles()[i][j].getCol());
                    }
                }
                //GAME OBJECTS
                if (gameBoardThatWasSent.getGameBoardTiles()[i][j] != null) {
                    //PLACE TILES
                    if (gameBoardThatWasSent.getGameBoardTiles()[i][j].getGameObject() != null) {
                        //PLACE GAME OBJECT
                        gameBoard.getGameBoardTiles()[i][j].setGameObject(gameBoardThatWasSent.getGameBoardTiles()[i][j].getGameObject());
                        //CHANGE BUTTON VIEW
                        gameBoard.getGameBoardTiles()[i][j].getButton().setTextFill(GameController.stringToColor(gameBoardThatWasSent.getGameBoardTiles()[i][j].getGameObject().getStringColor()));
                        gameBoard.getGameBoardTiles()[i][j].getButton().setText(gameBoardThatWasSent.getGameBoardTiles()[i][j].getGameObject().getIcon());
                    }
                }
            }
        }

        if(gameBoardThatWasSent.getWinnerExists()){
            DialogUtils.CheckWinner(gameBoardThatWasSent, GameController.POINTS_TO_WIN);
            //ADD CLEAR BOARD HERE
        }
    }
    public static void changeBoardState(GameBoard gameBoard, boolean enable){
        for (int i = 0; i < GameBoardUtils.NUM_OF_ROWS; i++) {
            for (int j = 0; j < GameBoardUtils.NUM_OF_COLS; j++) {
                if (gameBoard.getGameBoardTiles()[i][j] != null && gameBoard.getGameBoardTiles()[i][j].getButton() != null) {
                    gameBoard.getGameBoardTiles()[i][j].getButton().setDisable(!enable);
                }
            }
        }
        gameBoard.getBtnNextTurn().setDisable(!enable);
    }

    public static void checkEndOfSetup(GameBoard gameBoard, TextArea textAreaError){
        //check end of setup
        if (!gameBoard.isSetUpDone() && gameBoard.getBluePlayer().getNumTowns() == 2 && gameBoard.getRedPlayer().getNumTowns() == 2 && gameBoard.getBluePlayer().getNumRoads() == 2 && gameBoard.getRedPlayer().getNumRoads() == 2) {
            textAreaError.setText("The board has been setup properly");
            gameBoard.setSetUpDone(true);
        } else if (!gameBoard.isSetUpDone())
            textAreaError.setText("you must set up the board by placing 2 towns and roads per player");
    }

    public static int tryRollDice(GameBoard gameBoard, int diceTotal){
        if (gameBoard.isSetUpDone()) {
            //get dice roles
            Random random = new Random();
            int dice1 = random.nextInt(6) + 1;
            random = new Random();
            int dice2 = random.nextInt(6) + 1;
            gameBoard.setIntDice1(dice1);
            gameBoard.setIntDice2(dice2);
            diceTotal = dice1 + dice2;
            //display dice roll
            Image image;
            image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\" + dice1 + ".png");
            gameBoard.getImgDice1().setImage(image);
            image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\" + dice2 + ".png");
            gameBoard.getImgDice2().setImage(image);
        }
        return diceTotal;
    }
    public static Image intToImageDice(int imgInt){
        Image image = null;
        switch (imgInt) {
            case 1:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\1.png");
                break;
            case 2:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\2.png");
                break;
            case 3:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\3.png");
                break;
            case 4:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\4.png");
                break;
            case 5:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\5.png");
                break;
            case 6:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\6.png");
                break;
            default:
                System.out.println("Invalid dice number");
        }
        return image;
    }

    public static void placeTiles(GameBoard gameBoard,Tile [][]tileGameBoard) {
        //TOWNS
        tileGameBoard[0][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 0, 6, -1);
        tileGameBoard[0][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 0, 10, -1);
        tileGameBoard[0][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 0, 14, -1);
        tileGameBoard[2][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 2, 4, -1);
        tileGameBoard[2][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 2, 8, -1);
        tileGameBoard[2][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 2, 12, -1);
        tileGameBoard[2][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 2, 16, -1);
        tileGameBoard[4][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 4, 4, -1);
        tileGameBoard[4][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 4, 8, -1);
        tileGameBoard[4][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 4, 12, -1);
        tileGameBoard[4][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 4, 16, -1);
        tileGameBoard[6][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 6, 2, -1);
        tileGameBoard[6][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 6, 6, -1);
        tileGameBoard[6][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 6, 10, -1);
        tileGameBoard[6][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 6, 14, -1);
        tileGameBoard[6][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 6, 18, -1);
        tileGameBoard[8][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 8, 2, -1);
        tileGameBoard[8][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 8, 6, -1);
        tileGameBoard[8][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 8, 10, -1);
        tileGameBoard[8][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 8, 14, -1);
        tileGameBoard[8][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 8, 18, -1);
        tileGameBoard[10][0] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 10, 0, -1);
        tileGameBoard[10][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 10, 4, -1);
        tileGameBoard[10][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 10, 8, -1);
        tileGameBoard[10][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 10, 12, -1);
        tileGameBoard[10][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 10, 16, -1);
        tileGameBoard[10][20] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 10, 20, -1);
        tileGameBoard[12][0] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 12, 0, -1);
        tileGameBoard[12][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 12, 4, -1);
        tileGameBoard[12][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 12, 8, -1);
        tileGameBoard[12][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 12, 12, -1);
        tileGameBoard[12][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 12, 16, -1);
        tileGameBoard[12][20] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 12, 20, -1);
        tileGameBoard[14][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 14, 2, -1);
        tileGameBoard[14][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 14, 6, -1);
        tileGameBoard[14][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 14, 10, -1);
        tileGameBoard[14][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 14, 14, -1);
        tileGameBoard[14][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 14, 18, -1);
        tileGameBoard[16][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 16, 2, -1);
        tileGameBoard[16][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 16, 6, -1);
        tileGameBoard[16][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 16, 10, -1);
        tileGameBoard[16][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 16, 14, -1);
        tileGameBoard[16][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 16, 18, -1);
        tileGameBoard[18][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 18, 4, -1);
        tileGameBoard[18][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 18, 8, -1);
        tileGameBoard[18][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 18, 12, -1);
        tileGameBoard[18][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 18, 16, -1);
        tileGameBoard[20][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 20, 4, -1);
        tileGameBoard[20][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 20, 8, -1);
        tileGameBoard[20][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 20, 12, -1);
        tileGameBoard[20][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 20, 16, -1);
        tileGameBoard[22][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 22, 6, -1);
        tileGameBoard[22][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 22, 10, -1);
        tileGameBoard[22][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 22, 10, -1);
        //ROADS
        tileGameBoard[1][5] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 1, 5, -1);
        tileGameBoard[1][7] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 1, 7, -1);
        tileGameBoard[1][9] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 1, 9, -1);
        tileGameBoard[1][11] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 1, 11, -1);
        tileGameBoard[1][13] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 1, 13, -1);
        tileGameBoard[1][15] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 1, 15, -1);
        tileGameBoard[3][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 4, -1);
        tileGameBoard[3][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 8, -1);
        tileGameBoard[3][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 12, -1);
        tileGameBoard[3][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 16, -1);
        tileGameBoard[5][3] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 3, -1);
        tileGameBoard[5][5] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 5, -1);
        tileGameBoard[5][7] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 7, -1);
        tileGameBoard[5][9] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 9, -1);
        tileGameBoard[5][11] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 11, -1);
        tileGameBoard[5][13] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 13, -1);
        tileGameBoard[5][15] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 15, -1);
        tileGameBoard[5][17] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 5, 17, -1);
        tileGameBoard[7][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 2, -1);
        tileGameBoard[7][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 6, -1);
        tileGameBoard[7][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 10, -1);
        tileGameBoard[7][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 14, -1);
        tileGameBoard[7][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 18, -1);
        tileGameBoard[9][1] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 1, -1);
        tileGameBoard[9][3] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 3, -1);
        tileGameBoard[9][5] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 5, -1);
        tileGameBoard[9][7] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 7, -1);
        tileGameBoard[9][9] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 9, -1);
        tileGameBoard[9][11] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 11, -1);
        tileGameBoard[9][13] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 13, -1);
        tileGameBoard[9][15] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 15, -1);
        tileGameBoard[9][17] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 17, -1);
        tileGameBoard[9][19] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 9, 19, -1);
        tileGameBoard[11][0] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 0, -1);
        tileGameBoard[11][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 4, -1);
        tileGameBoard[11][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 8, -1);
        tileGameBoard[11][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 12, -1);
        tileGameBoard[11][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 16, -1);
        tileGameBoard[11][20] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 20, -1);
        tileGameBoard[13][1] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 1, -1);
        tileGameBoard[13][3] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 3, -1);
        tileGameBoard[13][5] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 5, -1);
        tileGameBoard[13][7] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 7, -1);
        tileGameBoard[13][9] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 9, -1);
        tileGameBoard[13][11] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 11, -1);
        tileGameBoard[13][13] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 13, -1);
        tileGameBoard[13][15] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 15, -1);
        tileGameBoard[13][17] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 17, -1);
        tileGameBoard[13][19] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 13, 19, -1);
        tileGameBoard[15][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 2, -1);
        tileGameBoard[15][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 6, -1);
        tileGameBoard[15][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 10, -1);
        tileGameBoard[15][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 14, -1);
        tileGameBoard[15][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 18, -1);
        tileGameBoard[17][3] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 3, -1);
        tileGameBoard[17][5] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 5, -1);
        tileGameBoard[17][7] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 5, -1);
        tileGameBoard[17][9] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 9, -1);
        tileGameBoard[17][11] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 11, -1);
        tileGameBoard[17][13] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 13, -1);
        tileGameBoard[17][15] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 15, -1);
        tileGameBoard[17][17] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 17, 17, -1);
        tileGameBoard[19][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 4, -1);
        tileGameBoard[19][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 8, -1);
        tileGameBoard[19][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 12, -1);
        tileGameBoard[19][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 16, -1);
        tileGameBoard[21][5] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 21, 5, -1);
        tileGameBoard[21][7] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 21, 7, -1);
        tileGameBoard[21][9] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 21, 9, -1);
        tileGameBoard[21][11] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 21, 11, -1);
        tileGameBoard[21][13] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 21, 13, -1);
        tileGameBoard[21][15] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 21, 15, -1);
        //RESOURCES
        tileGameBoard[3][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 6, -1);
        tileGameBoard[3][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 10, -1);
        tileGameBoard[3][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 3, 14, -1);
        tileGameBoard[7][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 4, -1);
        tileGameBoard[7][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 8, -1);
        tileGameBoard[7][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 12, -1);
        tileGameBoard[7][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 7, 16, -1);
        tileGameBoard[11][2] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 2, -1);
        tileGameBoard[11][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 6, -1);
        tileGameBoard[11][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 10, -1);
        tileGameBoard[11][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 14, -1);
        tileGameBoard[11][18] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 11, 18, -1);
        tileGameBoard[15][4] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 4, -1);
        tileGameBoard[15][8] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 8, -1);
        tileGameBoard[15][12] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 12, -1);
        tileGameBoard[15][16] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 15, 16, -1);
        tileGameBoard[19][6] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 6, -1);
        tileGameBoard[19][10] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 10, -1);
        tileGameBoard[19][14] = new Tile(null, null, null, -1, null, gameBoard.getPlayerTurn(), 19, 14, -1);
        //SET RESOURCETILE IN TILES
        tileGameBoard[3][6].setResourceTile(new ResourceTile(3, 6, null, null, null, -1));
        tileGameBoard[3][10].setResourceTile(new ResourceTile(3, 10, null, null, null, -1));
        tileGameBoard[3][14].setResourceTile(new ResourceTile(3, 14, null, null, null, -1));
        tileGameBoard[7][4].setResourceTile(new ResourceTile(7, 4, null, null, null, -1));
        tileGameBoard[7][8].setResourceTile(new ResourceTile(7, 8, null, null, null, -1));
        tileGameBoard[7][12].setResourceTile(new ResourceTile(7, 12, null, null, null, -1));
        tileGameBoard[7][16].setResourceTile(new ResourceTile(7, 16, null, null, null, -1));
        tileGameBoard[11][2].setResourceTile(new ResourceTile(11, 2, null, null, null, -1));
        tileGameBoard[11][6].setResourceTile(new ResourceTile(11, 6, null, null, null, -1));
        tileGameBoard[11][10].setResourceTile(new ResourceTile(11, 10, null, null, null, -1));
        tileGameBoard[11][14].setResourceTile(new ResourceTile(11, 14, null, null, null, -1));
        tileGameBoard[11][18].setResourceTile(new ResourceTile(11, 18, null, null, null, -1));
        tileGameBoard[15][4].setResourceTile(new ResourceTile(15, 4, null, null, null, -1));
        tileGameBoard[15][8].setResourceTile(new ResourceTile(15, 8, null, null, null, -1));
        tileGameBoard[15][12].setResourceTile(new ResourceTile(15, 12, null, null, null, -1));
        tileGameBoard[15][16].setResourceTile(new ResourceTile(15, 16, null, null, null, -1));
        tileGameBoard[19][6].setResourceTile(new ResourceTile(19, 6, null, null, null, -1));
        tileGameBoard[19][10].setResourceTile(new ResourceTile(19, 10, null, null, null, -1));
        tileGameBoard[19][14].setResourceTile(new ResourceTile(19, 14, null, null, null, -1));

    }

}

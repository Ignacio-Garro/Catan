package hr.algebra.catan.Model;

import hr.algebra.catan.Model.Objects.Player;
import hr.algebra.catan.Model.Objects.Town;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.io.Serializable;
import java.util.ArrayList;

public class GameBoard implements Serializable {
    private boolean CHEATS;
    private boolean setUpDone;
    private Player playerTurn;
    private int numberOfMoves;
    private Player bluePlayer;
    private Player redPlayer;
    private Tile[][] gameBoardTiles;
    private boolean winnerExists;
    private transient Circle circlePlayerTurn;
    private transient TextArea textAreaError;
    private transient Button btnNextTurn;
    private transient ImageView imgDice1;
    private transient ImageView imgDice2;
    private int intDice1;
    private int intDice2;


    public GameBoard(Player playerTurn, Player bluePlayer, Player redPlayer, int numberOfMoves, Tile[][] gameBoard, boolean cheats,
                     boolean setupDone, boolean winnerExists, int intDice1, int intDice2) {
        this.playerTurn = playerTurn;
        this.bluePlayer = bluePlayer;
        this.redPlayer = redPlayer;
        this.numberOfMoves = numberOfMoves;
        this.gameBoardTiles = gameBoard;
        this.CHEATS = cheats;
        this.setUpDone = setupDone;
        this.winnerExists = winnerExists;
        this.intDice1 = intDice1;
        this.intDice2 = intDice2;
    }

    public Player getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(Player playerTurn) {
        this.playerTurn = playerTurn;
    }

    public Integer getNumberOfMoves() {
        return numberOfMoves;
    }

    public void setNumberOfMoves(Integer numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }

    public Tile[][] getGameBoardTiles() {
        return gameBoardTiles;
    }

    public void setGameBoardTiles(Tile[][] gameBoardTiles) {
        this.gameBoardTiles = gameBoardTiles;
    }

    public Player getBluePlayer() {
        return bluePlayer;
    }

    public void setBluePlayer(Player bluePlayerCopy) {
        Text wood = this.bluePlayer.getNumWoodText();
        Text brick = this.bluePlayer.getNumBrickText();
        Text wheat = this.bluePlayer.getNumWheatText();
        Text sheep = this.bluePlayer.getNumSheepText();
        Text stone = this.bluePlayer.getNumStoneText();
        Text numPoints = this.bluePlayer.getNumPointsText();

        this.bluePlayer = bluePlayerCopy;

        this.bluePlayer.setNumWoodText(wood);
        this.bluePlayer.setNumBrickText(brick);
        this.bluePlayer.setNumWheatText(wheat);
        this.bluePlayer.setNumSheepText(sheep);
        this.bluePlayer.setNumStoneText(stone);
        this.bluePlayer.setNumPointsText(numPoints);
    }

    public Player getRedPlayer() {
        return redPlayer;
    }

    public void setRedPlayer(Player redPlayerCopy) {
        Text wood = this.redPlayer.getNumWoodText();
        Text brick = this.redPlayer.getNumBrickText();
        Text wheat = this.redPlayer.getNumWheatText();
        Text sheep = this.redPlayer.getNumSheepText();
        Text stone = this.redPlayer.getNumStoneText();
        Text numPoints = this.redPlayer.getNumPointsText();

        this.redPlayer = redPlayerCopy;

        this.redPlayer.setNumWoodText(wood);
        this.redPlayer.setNumBrickText(brick);
        this.redPlayer.setNumWheatText(wheat);
        this.redPlayer.setNumSheepText(sheep);
        this.redPlayer.setNumStoneText(stone);
        this.redPlayer.setNumPointsText(numPoints);

    }

    public boolean isCHEATS() {
        return CHEATS;
    }

    public void setCHEATS(boolean CHEATS) {
        this.CHEATS = CHEATS;
    }

    public boolean isSetUpDone() {
        return setUpDone;
    }

    public void setSetUpDone(boolean setUpDone) {
        this.setUpDone = setUpDone;
    }

    public void setWinnerExists(Boolean winnerExists) {
        this.winnerExists = winnerExists;
    }
    public boolean getWinnerExists() { return winnerExists;}

    public Circle getCirclePlayerTurn() {
        return circlePlayerTurn;
    }

    public void setCirclePlayerTurn(Circle circlePlayerTurn) {
        this.circlePlayerTurn = circlePlayerTurn;
    }

    public TextArea getTextAreaError() {
        return textAreaError;
    }

    public void setTextAreaError(TextArea textAreaError) {
        this.textAreaError = textAreaError;
    }

    public Button getBtnNextTurn() {
        return btnNextTurn;
    }

    public void setBtnNextTurn(Button btnNextTurn) {
        this.btnNextTurn = btnNextTurn;
    }

    public ImageView getImgDice1() {
        return imgDice1;
    }

    public void setImgDice1(ImageView imgDices1) {
        this.imgDice1 = imgDices1;
    }
    public ImageView getImgDice2() {
        return imgDice2;
    }

    public void setImgDice2(ImageView imgDices2) {
        this.imgDice2 = imgDices2;
    }

    public int getIntDice1() {
        return intDice1;
    }

    public void setIntDice1(int intDice1) {
        this.intDice1 = intDice1;
    }

    public int getIntDice2() {
        return intDice2;
    }

    public void setIntDice2(int intDice2) {
        this.intDice2 = intDice2;
    }
}

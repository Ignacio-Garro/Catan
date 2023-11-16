package hr.algebra.catan.Model;

import hr.algebra.catan.Model.Objects.Player;

import java.io.Serializable;

public class GameBoard implements Serializable {
    private boolean CHEATS;
    private boolean setUpDone;
    private Player playerTurn;
    private int numberOfMoves;
    private Player bluePlayer;
    private Player redPlayer;
    private Tile[][] gameBoardTiles;

    public GameBoard(Player playerTurn, Player bluePlayer, Player redPlayer, int numberOfMoves, Tile[][] gameBoard, boolean cheats, boolean setupDone) {
        this.playerTurn = playerTurn;
        this.bluePlayer = bluePlayer;
        this.redPlayer = redPlayer;
        this.numberOfMoves = numberOfMoves;
        this.gameBoardTiles = gameBoard;
        this.CHEATS = cheats;
        this.setUpDone = setupDone;
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

    public void setBluePlayer(Player bluePlayer) {
        this.bluePlayer = bluePlayer;
    }

    public Player getRedPlayer() {
        return redPlayer;
    }

    public void setRedPlayer(Player redPlayer) {
        this.redPlayer = redPlayer;
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
}

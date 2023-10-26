package hr.algebra.catan.Objects;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Player {

    private final Color playerColor;
    private int numPoints;
    private int numTowns;
    private int numCities;
    private int numRoads;
    private int numBrick;
    private int numSheep;
    private int numStone;
    private int numWheat;
    private int numWood;

    private boolean placedStartingPosition;
    private ArrayList<Town> townList;

    public Player(Color playerColor, int numPoints, int numTowns, int numCities, int numRoads, int numBrick, int numSheep, int numStone, int numWheat, int numWood){
        this.placedStartingPosition = false;
        this.townList = new ArrayList<>();
        this.playerColor = playerColor;
        this.numPoints = numPoints;
        this.numTowns = numTowns;
        this.numCities = numCities;
        this.numRoads = numRoads;
        this.numBrick = numBrick;
        this.numSheep = numSheep;
        this.numStone = numStone;
        this.numWheat = numWheat;
        this.numWood = numWood;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }

    public int getNumTowns() {
        return numTowns;
    }

    public void setNumTowns(int numTowns) {
        this.numTowns = numTowns;
    }

    public int getNumCities() {
        return numCities;
    }

    public void setNumCities(int numCities) {
        this.numCities = numCities;
    }

    public int getNumRoads() {
        return numRoads;
    }

    public void setNumRoads(int numRoads) {
        this.numRoads = numRoads;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public int getNumBrick() {
        return numBrick;
    }

    public void setNumBrick(int numBrick) {
        this.numBrick = numBrick;
    }

    public int getNumSheep() {
        return numSheep;
    }

    public void setNumSheep(int numSheep) {
        this.numSheep = numSheep;
    }

    public int getNumStone() {
        return numStone;
    }

    public void setNumStone(int numStone) {
        this.numStone = numStone;
    }

    public int getNumWheat() {
        return numWheat;
    }

    public void setNumWheat(int numWheat) {
        this.numWheat = numWheat;
    }

    public int getNumWood() {
        return numWood;
    }

    public void setNumWood(int numWood) {
        this.numWood = numWood;
    }

    public ArrayList<Town> getTownList() {
        return townList;
    }

    public void addTownList(Town town) {
        this.townList.add(town);
    }
    public void removeTownList(Town town) {
        this.townList.remove(town);
    }

    public boolean getPlacedStartingPosition() {
        return placedStartingPosition;
    }

    public void setPlacedStartingPosition(boolean placedStartingPosition) {
        this.placedStartingPosition = placedStartingPosition;
    }

}

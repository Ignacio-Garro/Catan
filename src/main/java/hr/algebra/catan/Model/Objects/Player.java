package hr.algebra.catan.Model.Objects;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {

    private final String stringPlayerColor; // Color is not serializable

    private int numPoints;
    private int numTowns;
    private int numCities;
    private int numRoads;
    private int numBrick;
    private int numSheep;
    private int numStone;
    private int numWheat;
    private int numWood;
    private ArrayList<Town> townList;

    public Player(String playerColor, int numPoints, int numTowns, int numCities, int numRoads, int numBrick, int numSheep, int numStone, int numWheat, int numWood){
        this.townList = new ArrayList<>();
        this.stringPlayerColor = playerColor;
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

    public String getStringPlayerColor() {
        return stringPlayerColor;
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
    public void resetValues(){
        this.townList.clear();
        this.numPoints = 0;
        this.numTowns = 0;
        this.numCities = 0;
        this.numRoads = 0;
        this.numBrick = 0;
        this.numSheep = 0;
        this.numStone = 0;
        this.numWheat = 0;
        this.numWood = 0;
    }

}

package hr.algebra.catan.Model;

public enum ResourcesType {
    WOOD(4),
    BRICK(3),
    WHEAT(4),
    SHEEP(4),
    STONE(3),
    DESSERT(1);

    private int numTilesInBoard;

    ResourcesType (int numTilesInBoard){
        this.numTilesInBoard = numTilesInBoard;
    }

    public int getNumTilesInBoard() {
        return numTilesInBoard;
    }

    public void setNumTilesInBoard(int numTilesInBoard) {
        this.numTilesInBoard = numTilesInBoard;
    }
}

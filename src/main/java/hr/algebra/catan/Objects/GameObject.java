package hr.algebra.catan.Objects;

public class GameObject {

    private int row;
    private int col;

    public GameObject(int row, int col){
        this.row = row;
        this.col = col;
    }

    public void setPosition(int row, int col){
        setRow(row);
        setCol(col);
    }
    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}

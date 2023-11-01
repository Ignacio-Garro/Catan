package hr.algebra.catan.Objects;

import javafx.scene.paint.Color;

public class GameObject {

    private int row;
    private int col;
    private Color color;

    public GameObject(int row, int col, Color color){
        this.row = row;
        this.col = col;
        this.color = color;
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

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}

package hr.algebra.catan.Model.Objects;

import java.io.Serializable;

public class GameObject implements Serializable {

    private int row;
    private int col;
    private String stringColor;
    private String icon;

    public GameObject(int row, int col, String stringColor, String icon){
        this.row = row;
        this.col = col;
        this.stringColor = stringColor;
        this.icon = icon;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStringColor() {
        return stringColor;
    }

    public void setStringColor(String stringColor) {
        this.stringColor = stringColor;
    }
}

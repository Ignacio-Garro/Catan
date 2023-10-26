package hr.algebra.catan.Objects;

import javafx.scene.paint.Color;

public class Road extends GameObject{
    private final Color roadColor;
    public Road(int row, int col, Color townColor) {
        super(row, col);
        this.roadColor = townColor;
    }
}

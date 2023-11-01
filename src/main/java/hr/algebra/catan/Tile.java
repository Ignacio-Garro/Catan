package hr.algebra.catan;

import hr.algebra.catan.Objects.GameObject;
import hr.algebra.catan.Objects.ResourceTile;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Tile {
    private GameObject gameObject;
    private Button button;
    private ImageView imageView;
    private Text resourceNumber;
    private ResourceTile resourceTile;
    private int row;
    private int col;

    public Tile(GameObject gameObject, Button button, ImageView imageView, Text text, ResourceTile resourceTile, int row, int col) {
        this.gameObject = gameObject;
        this.button = button;
        this.imageView = imageView;
        this.resourceNumber = text;
        this.resourceTile = resourceTile;
        this.row = row;
        this.col = col;
    }

    public GameObject getGameObject() {
        return gameObject;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Text getResourceNumber() {
        return resourceNumber;
    }

    public void setResourceNumber(Text resourceNumber) {
        this.resourceNumber = resourceNumber;
    }

    public ResourceTile getResourceTile() {
        return resourceTile;
    }

    public void setResourceTile(ResourceTile resourceTile) {
        this.resourceTile = resourceTile;
    }
}

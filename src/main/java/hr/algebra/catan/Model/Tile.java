package hr.algebra.catan.Model;

import hr.algebra.catan.Model.Objects.GameObject;
import hr.algebra.catan.Model.Objects.Player;
import hr.algebra.catan.Model.Objects.ResourceTile;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.Serializable;

public class Tile implements Serializable {
    private GameObject gameObject;
    private transient Button button; // not serilizable, but doesnt need any data to be transfered in serialization
    private transient ImageView imageView;
    private Text resourceNumber;
    private ResourceTile resourceTile;
    private int row;
    private int col;

    public Tile(GameObject gameObject, Button button, ImageView imageView, Text text, ResourceTile resourceTile, Player playerTurn, int row, int col) {
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

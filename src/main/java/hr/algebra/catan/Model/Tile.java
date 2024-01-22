package hr.algebra.catan.Model;

import hr.algebra.catan.Model.Objects.GameObject;
import hr.algebra.catan.Model.Objects.Player;
import hr.algebra.catan.Model.Objects.ResourceTile;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.Serializable;

public class Tile implements Serializable {
    private GameObject gameObject;
    private transient Button button; // not serilizable, but doesnt need any data to be transfered in serialization
    private transient ImageView imageView;
    private transient Text textResource;
    private int imageViewInt;
    private int resourceNumber;
    private ResourceTile resourceTile;
    private int row;
    private int col;

    public Tile(){}
    public Tile(GameObject gameObject, Button button, ImageView imageView, int resourceNumber, ResourceTile resourceTile, Player playerTurn, int row, int col, int imageViewInt) {
        this.gameObject = gameObject;
        this.button = button;
        this.imageView = imageView;
        this.resourceNumber = resourceNumber;
        this.resourceTile = resourceTile;
        this.row = row;
        this.col = col;
        this.imageViewInt = imageViewInt;
        this.textResource = null;
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

    public int getResourceNumber() {
        return resourceNumber;
    }

    public void setResourceNumber(int resourceNumber) {
        this.resourceNumber = resourceNumber;
    }

    public ResourceTile getResourceTile() {
        return resourceTile;
    }

    public void setResourceTile(ResourceTile resourceTile) {
        this.resourceTile = resourceTile;
    }

    public int getImageViewInt() {
        return imageViewInt;
    }

    public void setImageViewInt(int imageViewInt) {
        this.imageViewInt = imageViewInt;
    }
    public Image intToImage(int imageViewInt){
        Image image = null;
        switch (imageViewInt) {
            case 0:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\WOOD.png");
                break;
            case 1:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\BRICK.png");
                break;
            case 2:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\WHEAT.png");
                break;
            case 3:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\SHEEP.png");
                break;
            case 4:
                image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\STONE.png");
                break;
            default:
                System.out.println("Invalid tile resource");
        }
        return image;
    }

    public Text getTextResource() {
        return textResource;
    }

    public void setTextResource(Text textResource) {
        this.textResource = textResource;
    }
}

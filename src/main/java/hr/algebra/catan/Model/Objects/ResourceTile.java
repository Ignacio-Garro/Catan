package hr.algebra.catan.Model.Objects;

import hr.algebra.catan.Model.ResourcesType;
import javafx.scene.paint.Color;

import java.io.Serializable;

public class ResourceTile extends GameObject implements Serializable {

    private ResourcesType resource;
    private int numberResource;
    public ResourceTile(int row, int col, String stringColor, String icon, ResourcesType resource, int numberResource) {
        super(row, col, stringColor, icon);
        this.resource = resource;
        this.numberResource = numberResource;
    }

    public ResourcesType getResource() {
        return resource;
    }

    public void setResource(ResourcesType resource) {
        this.resource = resource;
    }

    public int getNumberResource() {
        return numberResource;
    }

    public void setNumberResource(int numberResource) {
        this.numberResource = numberResource;
    }
}

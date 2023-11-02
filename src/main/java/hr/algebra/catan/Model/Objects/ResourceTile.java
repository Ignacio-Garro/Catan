package hr.algebra.catan.Model.Objects;

import hr.algebra.catan.Model.ResourcesType;
import javafx.scene.paint.Color;

public class ResourceTile extends GameObject{

    private ResourcesType resource;
    private int numberResource;
    public ResourceTile(int row, int col, Color color, ResourcesType resource, int numberResource) {
        super(row, col, color);
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

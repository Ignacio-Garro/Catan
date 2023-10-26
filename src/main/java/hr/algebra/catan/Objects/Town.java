package hr.algebra.catan.Objects;

import hr.algebra.catan.ResourcesType;
import hr.algebra.catan.Objects.GameObject;
import javafx.scene.paint.Color;

import static hr.algebra.catan.HelloController.objectGameBoard;

public class Town extends GameObject{
    private final Color townColor;
    public Town(int row, int col, Color townColor) {
        super(row, col);
        this.townColor = townColor;
    }

    public void getResources(Player player, int diceTotal, int numSum) {
        for (int r = -3; r <= 3; r++) {
            for (int c = -2; c <= 2; c++) {
                //System.out.println((getRow() +r)+ " ! " + (getCol() + c));
                try {
                    if (objectGameBoard[getRow() + r][getCol() + c].getClass().equals(ResourceTile.class)) {
                        ResourceTile tile = (ResourceTile) objectGameBoard[getRow() + r][getCol() + c];
                        int number = tile.getNumberResource();
                        if(number == diceTotal){
                            ResourcesType type = tile.getResource();
                            System.out.println("town in "+ getRow() + " "+ getCol() + " got: " + type);
                            switch (type){
                                case WOOD:
                                    player.setNumWood(player.getNumWood() + numSum);
                                    break;
                                case BRICK:
                                    player.setNumBrick(player.getNumBrick() + numSum);
                                    break;
                                case WHEAT:
                                    player.setNumWheat(player.getNumWheat() + numSum);
                                    break;
                                case SHEEP:
                                    player.setNumSheep(player.getNumSheep() + numSum);
                                    break;
                                case STONE:
                                    player.setNumStone(player.getNumStone() + numSum);
                                    break;
                                default:
                                    System.out.println("wierd tile error");
                            }
                        }
                    }
                }
                catch (Exception e){

                }
            }
        }
    }
}

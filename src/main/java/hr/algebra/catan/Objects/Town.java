package hr.algebra.catan.Objects;

import hr.algebra.catan.ResourcesType;
import javafx.scene.paint.Color;

import static hr.algebra.catan.HelloController.tileGameBoard;

public class Town extends GameObject{

    public Town(int row, int col, Color color) {
        super(row, col, color);
    }

    public void getResources(Player player, int diceTotal, int numSum) {
        for (int r = -3; r <= 3; r++) {
            for (int c = -2; c <= 2; c++) {
                try {
                    //MAKE SURE ITS A RESOURCE TILE
                    if (tileGameBoard[getRow() + r][getCol() + c].getResourceTile().getClass().equals(ResourceTile.class)) {
                        ResourceTile tile = tileGameBoard[getRow() + r][getCol() + c].getResourceTile();
                        int number = tile.getNumberResource();
                        if(number == diceTotal){
                            ResourcesType type = tile.getResource();
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
                                    //System.out.println("wierd tile error");
                            }
                        }
                    }
                }
                catch (Exception ignore){

                }
            }
        }
    }

}

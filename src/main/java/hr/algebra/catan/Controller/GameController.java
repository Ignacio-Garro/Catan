package hr.algebra.catan.Controller;

import hr.algebra.catan.MainApplication;
import hr.algebra.catan.Model.*;
import hr.algebra.catan.Model.Objects.Player;
import hr.algebra.catan.Model.Objects.Road;
import hr.algebra.catan.Model.Objects.Town;
import hr.algebra.catan.Networking.GameBoardUtils;
import hr.algebra.catan.Networking.NetworkingUtils;
import hr.algebra.catan.Networking.PlayerType;
import hr.algebra.catan.Utils.ReflectionUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.io.*;
import java.util.Random;

public class GameController {
    @FXML
    private Button btnHouse0x6;
    @FXML
    private Button btnHouse0x10;
    @FXML
    private Button btnHouse0x14;
    @FXML
    private Button btnHouse2x4;
    @FXML
    private Button btnHouse2x8;
    @FXML
    private Button btnHouse2x12;
    @FXML
    private Button btnHouse2x16;
    @FXML
    private Button btnHouse4x4;
    @FXML
    private Button btnHouse4x8;
    @FXML
    private Button btnHouse4x12;
    @FXML
    private Button btnHouse4x16;
    @FXML
    private Button btnHouse6x2;
    @FXML
    private Button btnHouse6x6;
    @FXML
    private Button btnHouse6x10;
    @FXML
    private Button btnHouse6x14;
    @FXML
    private Button btnHouse6x18;
    @FXML
    private Button btnHouse8x2;
    @FXML
    private Button btnHouse8x6;
    @FXML
    private Button btnHouse8x10;
    @FXML
    private Button btnHouse8x14;
    @FXML
    private Button btnHouse8x18;
    @FXML
    private Button btnHouse10x0;
    @FXML
    private Button btnHouse10x4;
    @FXML
    private Button btnHouse10x8;
    @FXML
    private Button btnHouse10x12;
    @FXML
    private Button btnHouse10x16;
    @FXML
    private Button btnHouse10x20;
    @FXML
    private Button btnHouse12x0;
    @FXML
    private Button btnHouse12x4;
    @FXML
    private Button btnHouse12x8;
    @FXML
    private Button btnHouse12x12;
    @FXML
    private Button btnHouse12x16;
    @FXML
    private Button btnHouse12x20;
    @FXML
    private Button btnHouse14x2;
    @FXML
    private Button btnHouse14x6;
    @FXML
    private Button btnHouse14x10;
    @FXML
    private Button btnHouse14x14;
    @FXML
    private Button btnHouse14x18;
    @FXML
    private Button btnHouse16x2;
    @FXML
    private Button btnHouse16x6;
    @FXML
    private Button btnHouse16x10;
    @FXML
    private Button btnHouse16x14;
    @FXML
    private Button btnHouse16x18;
    @FXML
    private Button btnHouse18x4;
    @FXML
    private Button btnHouse18x8;
    @FXML
    private Button btnHouse18x12;
    @FXML
    private Button btnHouse18x16;
    @FXML
    private Button btnHouse20x4;
    @FXML
    private Button btnHouse20x8;
    @FXML
    private Button btnHouse20x12;
    @FXML
    private Button btnHouse20x16;
    @FXML
    private Button btnHouse22x6;
    @FXML
    private Button btnHouse22x10;
    @FXML
    private Button btnHouse22x14;

    @FXML
    private Button btnRoad1x5;
    @FXML
    private Button btnRoad1x7;
    @FXML
    private Button btnRoad1x9;
    @FXML
    private Button btnRoad1x11;
    @FXML
    private Button btnRoad1x13;
    @FXML
    private Button btnRoad1x15;
    @FXML
    private Button btnRoad3x4;
    @FXML
    private Button btnRoad3x8;
    @FXML
    private Button btnRoad3x12;
    @FXML
    private Button btnRoad3x16;
    @FXML
    private Button btnRoad5x3;
    @FXML
    private Button btnRoad5x5;
    @FXML
    private Button btnRoad5x7;
    @FXML
    private Button btnRoad5x9;
    @FXML
    private Button btnRoad5x11;
    @FXML
    private Button btnRoad5x13;
    @FXML
    private Button btnRoad5x15;
    @FXML
    private Button btnRoad5x17;
    @FXML
    private Button btnRoad7x2;
    @FXML
    private Button btnRoad7x6;
    @FXML
    private Button btnRoad7x10;
    @FXML
    private Button btnRoad7x14;
    @FXML
    private Button btnRoad7x18;
    @FXML
    private Button btnRoad9x1;
    @FXML
    private Button btnRoad9x3;
    @FXML
    private Button btnRoad9x5;
    @FXML
    private Button btnRoad9x7;
    @FXML
    private Button btnRoad9x9;
    @FXML
    private Button btnRoad9x11;
    @FXML
    private Button btnRoad9x13;
    @FXML
    private Button btnRoad9x15;
    @FXML
    private Button btnRoad9x17;
    @FXML
    private Button btnRoad9x19;
    @FXML
    private Button btnRoad11x0;
    @FXML
    private Button btnRoad11x4;
    @FXML
    private Button btnRoad11x8;
    @FXML
    private Button btnRoad11x12;
    @FXML
    private Button btnRoad11x16;
    @FXML
    private Button btnRoad11x20;
    @FXML
    private Button btnRoad13x1;
    @FXML
    private Button btnRoad13x3;
    @FXML
    private Button btnRoad13x5;
    @FXML
    private Button btnRoad13x7;
    @FXML
    private Button btnRoad13x9;
    @FXML
    private Button btnRoad13x11;
    @FXML
    private Button btnRoad13x13;
    @FXML
    private Button btnRoad13x15;
    @FXML
    private Button btnRoad13x17;
    @FXML
    private Button btnRoad13x19;
    @FXML
    private Button btnRoad15x2;
    @FXML
    private Button btnRoad15x6;
    @FXML
    private Button btnRoad15x10;
    @FXML
    private Button btnRoad15x14;
    @FXML
    private Button btnRoad15x18;
    @FXML
    private Button btnRoad17x3;
    @FXML
    private Button btnRoad17x5;
    @FXML
    private Button btnRoad17x7;
    @FXML
    private Button btnRoad17x9;
    @FXML
    private Button btnRoad17x11;
    @FXML
    private Button btnRoad17x13;
    @FXML
    private Button btnRoad17x15;
    @FXML
    private Button btnRoad17x17;
    @FXML
    private Button btnRoad19x4;
    @FXML
    private Button btnRoad19x8;
    @FXML
    private Button btnRoad19x12;
    @FXML
    private Button btnRoad19x16;
    @FXML
    private Button btnRoad21x5;
    @FXML
    private Button btnRoad21x7;
    @FXML
    private Button btnRoad21x9;
    @FXML
    private Button btnRoad21x11;
    @FXML
    private Button btnRoad21x13;
    @FXML
    private Button btnRoad21x15;

    @FXML
    private ImageView img3x6;
    @FXML
    private ImageView img3x10;
    @FXML
    private ImageView img3x14;
    @FXML
    private ImageView img7x4;
    @FXML
    private ImageView img7x8;
    @FXML
    private ImageView img7x12;
    @FXML
    private ImageView img7x16;
    @FXML
    private ImageView img11x2;
    @FXML
    private ImageView img11x6;
    @FXML
    private ImageView img11x10;
    @FXML
    private ImageView img11x14;
    @FXML
    private ImageView img11x18;
    @FXML
    private ImageView img15x4;
    @FXML
    private ImageView img15x8;
    @FXML
    private ImageView img15x12;
    @FXML
    private ImageView img15x16;
    @FXML
    private ImageView img19x6;
    @FXML
    private ImageView img19x10;
    @FXML
    private ImageView img19x14;
    @FXML
    public ImageView imgDice1;
    @FXML
    public ImageView imgDice2;
    @FXML
    private Circle circlePlayerTurn;

    @FXML
    private Text textResource3x6;
    @FXML
    private Text textResource3x10;
    @FXML
    private Text textResource3x14;
    @FXML
    private Text textResource7x4;
    @FXML
    private Text textResource7x8;
    @FXML
    private Text textResource7x12;
    @FXML
    private Text textResource7x16;
    @FXML
    private Text textResource11x2;
    @FXML
    private Text textResource11x6;
    @FXML
    private Text textResource11x10;
    @FXML
    private Text textResource11x14;
    @FXML
    private Text textResource11x18;
    @FXML
    private Text textResource15x4;
    @FXML
    private Text textResource15x8;
    @FXML
    private Text textResource15x12;
    @FXML
    private Text textResource15x16;
    @FXML
    private Text textResource19x6;
    @FXML
    private Text textResource19x10;
    @FXML
    private Text textResource19x14;

    @FXML
    public Text textResourceWood0;
    @FXML
    public Text textResourceBrick0;
    @FXML
    public Text textResourceWheat0;
    @FXML
    public Text textResourceSheep0;
    @FXML
    public Text textResourceStone0;
    @FXML
    public Text textResourceWood1;
    @FXML
    public Text textResourceBrick1;
    @FXML
    public Text textResourceWheat1;
    @FXML
    public Text textResourceSheep1;
    @FXML
    public Text textResourceStone1;

    @FXML
    private TextArea textAreaError;
    @FXML
    public Text textPlayerPoints0;
    @FXML
    public Text textPlayerPoints1;
    @FXML
    private Button btnNextTurn;

    @FXML
    private TextArea chatTextArea;
    @FXML
    private TextField chatMessageTextField;

    public static final Integer POINTS_TO_WIN = 10;
    public static int diceTotal;
    private static boolean gameFinished = false;
    private boolean winnerExists;

    public static final Color blueColor = Color.rgb(0, 0, 255, 1);
    public static final Color redColor = Color.rgb(255, 0, 0, 1);
    private final Color blackColor = Color.rgb(0, 0, 0, 1);
    private static final String blueString = "blue";
    private static final String redString = "red";
    private final String cityEmoji = "🏢";
    private final String townEmoji = "\uD83C\uDFE0";
    private final String roadEmoji = "\uD83D\uDEE3";
    public static GameBoard gameBoard;
    public static Tile[][] tileGameBoard;
    private ResourcesType resource;

    public void initialize() {
        Player bluePlayer = new Player(blueString, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Player redPlayer = new Player(redString, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

        tileGameBoard = new Tile[GameBoardUtils.NUM_OF_ROWS][GameBoardUtils.NUM_OF_COLS];
        gameBoard = new GameBoard(bluePlayer, bluePlayer, redPlayer, 0, tileGameBoard, false, false, false, -1,-1);

        placeTiles();
        boardResourcesIni();
    }

    public void placeTiles() {
        GameBoardUtils.placeTiles(gameBoard, gameBoard.getGameBoardTiles());

        tileGameBoard[0][6].setButton(btnHouse0x6);
        tileGameBoard[0][10].setButton(btnHouse0x10);
        tileGameBoard[0][14].setButton(btnHouse0x14);
        tileGameBoard[2][4].setButton(btnHouse2x4);
        tileGameBoard[2][8].setButton(btnHouse2x8);
        tileGameBoard[2][12].setButton(btnHouse2x12);
        tileGameBoard[2][16].setButton(btnHouse2x16);
        tileGameBoard[4][4].setButton(btnHouse4x4);
        tileGameBoard[4][8].setButton(btnHouse4x8);
        tileGameBoard[4][12].setButton(btnHouse4x12);
        tileGameBoard[4][16].setButton(btnHouse4x16);
        tileGameBoard[6][2].setButton(btnHouse6x2);
        tileGameBoard[6][6].setButton(btnHouse6x6);
        tileGameBoard[6][10].setButton(btnHouse6x10);
        tileGameBoard[6][14].setButton(btnHouse6x14);
        tileGameBoard[6][18].setButton(btnHouse6x18);
        tileGameBoard[8][2].setButton(btnHouse8x2);
        tileGameBoard[8][6].setButton(btnHouse8x6);
        tileGameBoard[8][10].setButton(btnHouse8x10);
        tileGameBoard[8][14].setButton(btnHouse8x14);
        tileGameBoard[8][18].setButton(btnHouse8x18);
        tileGameBoard[10][0].setButton(btnHouse10x0);
        tileGameBoard[10][4].setButton(btnHouse10x4);
        tileGameBoard[10][8].setButton(btnHouse10x8);
        tileGameBoard[10][12].setButton(btnHouse10x12);
        tileGameBoard[10][16].setButton(btnHouse10x16);
        tileGameBoard[10][20].setButton(btnHouse10x20);
        tileGameBoard[12][0].setButton(btnHouse12x0);
        tileGameBoard[12][4].setButton(btnHouse12x4);
        tileGameBoard[12][8].setButton(btnHouse12x8);
        tileGameBoard[12][12].setButton(btnHouse12x12);
        tileGameBoard[12][16].setButton(btnHouse12x16);
        tileGameBoard[12][20].setButton(btnHouse12x20);
        tileGameBoard[14][2].setButton(btnHouse14x2);
        tileGameBoard[14][6].setButton(btnHouse14x6);
        tileGameBoard[14][10].setButton(btnHouse14x10);
        tileGameBoard[14][14].setButton(btnHouse14x14);
        tileGameBoard[14][18].setButton(btnHouse14x18);
        tileGameBoard[16][2].setButton(btnHouse16x2);
        tileGameBoard[16][6].setButton(btnHouse16x6);
        tileGameBoard[16][10].setButton(btnHouse16x10);
        tileGameBoard[16][14].setButton(btnHouse16x14);
        tileGameBoard[16][18].setButton(btnHouse16x18);
        tileGameBoard[18][4].setButton(btnHouse18x4);
        tileGameBoard[18][8].setButton(btnHouse18x8);
        tileGameBoard[18][12].setButton(btnHouse18x12);
        tileGameBoard[18][16].setButton(btnHouse18x16);
        tileGameBoard[20][4].setButton(btnHouse20x4);
        tileGameBoard[20][8].setButton(btnHouse20x8);
        tileGameBoard[20][12].setButton(btnHouse20x12);
        tileGameBoard[20][16].setButton(btnHouse20x16);
        tileGameBoard[22][6].setButton(btnHouse22x6);
        tileGameBoard[22][10].setButton(btnHouse22x10);
        tileGameBoard[22][14].setButton(btnHouse22x14);

        tileGameBoard[1][5].setButton(btnRoad1x5);
        tileGameBoard[1][7].setButton(btnRoad1x7);
        tileGameBoard[1][9].setButton(btnRoad1x9);
        tileGameBoard[1][11].setButton(btnRoad1x11);
        tileGameBoard[1][13].setButton(btnRoad1x13);
        tileGameBoard[1][15].setButton(btnRoad1x15);
        tileGameBoard[3][4].setButton(btnRoad3x4);
        tileGameBoard[3][8].setButton(btnRoad3x8);
        tileGameBoard[3][12].setButton(btnRoad3x12);
        tileGameBoard[3][16].setButton(btnRoad3x16);
        tileGameBoard[5][3].setButton(btnRoad5x3);
        tileGameBoard[5][5].setButton(btnRoad5x5);
        tileGameBoard[5][7].setButton(btnRoad5x7);
        tileGameBoard[5][9].setButton(btnRoad5x9);
        tileGameBoard[5][11].setButton(btnRoad5x11);
        tileGameBoard[5][13].setButton(btnRoad5x13);
        tileGameBoard[5][15].setButton(btnRoad5x15);
        tileGameBoard[5][17].setButton(btnRoad5x17);
        tileGameBoard[7][2].setButton(btnRoad7x2);
        tileGameBoard[7][6].setButton(btnRoad7x6);
        tileGameBoard[7][10].setButton(btnRoad7x10);
        tileGameBoard[7][14].setButton(btnRoad7x14);
        tileGameBoard[7][18].setButton(btnRoad7x18);
        tileGameBoard[9][1].setButton(btnRoad9x1);
        tileGameBoard[9][3].setButton(btnRoad9x3);
        tileGameBoard[9][5].setButton(btnRoad9x5);
        tileGameBoard[9][7].setButton(btnRoad9x7);
        tileGameBoard[9][9].setButton(btnRoad9x9);
        tileGameBoard[9][11].setButton(btnRoad9x11);
        tileGameBoard[9][13].setButton(btnRoad9x13);
        tileGameBoard[9][15].setButton(btnRoad9x15);
        tileGameBoard[9][17].setButton(btnRoad9x17);
        tileGameBoard[9][19].setButton(btnRoad9x19);
        tileGameBoard[11][0].setButton(btnRoad11x0);
        tileGameBoard[11][4].setButton(btnRoad11x4);
        tileGameBoard[11][8].setButton(btnRoad11x8);
        tileGameBoard[11][12].setButton(btnRoad11x12);
        tileGameBoard[11][16].setButton(btnRoad11x16);
        tileGameBoard[11][20].setButton(btnRoad11x20);
        tileGameBoard[13][1].setButton(btnRoad13x1);
        tileGameBoard[13][3].setButton(btnRoad13x3);
        tileGameBoard[13][5].setButton(btnRoad13x5);
        tileGameBoard[13][7].setButton(btnRoad13x7);
        tileGameBoard[13][9].setButton(btnRoad13x9);
        tileGameBoard[13][11].setButton(btnRoad13x11);
        tileGameBoard[13][13].setButton(btnRoad13x13);
        tileGameBoard[13][15].setButton(btnRoad13x15);
        tileGameBoard[13][17].setButton(btnRoad13x17);
        tileGameBoard[13][19].setButton(btnRoad13x19);
        tileGameBoard[15][2].setButton(btnRoad15x2);
        tileGameBoard[15][6].setButton(btnRoad15x6);
        tileGameBoard[15][10].setButton(btnRoad15x10);
        tileGameBoard[15][14].setButton(btnRoad15x14);
        tileGameBoard[15][18].setButton(btnRoad15x18);
        tileGameBoard[17][3].setButton(btnRoad17x3);
        tileGameBoard[17][5].setButton(btnRoad17x5);
        tileGameBoard[17][7].setButton(btnRoad17x7);
        tileGameBoard[17][9].setButton(btnRoad17x9);
        tileGameBoard[17][11].setButton(btnRoad17x11);
        tileGameBoard[17][13].setButton(btnRoad17x13);
        tileGameBoard[17][15].setButton(btnRoad17x15);
        tileGameBoard[17][17].setButton(btnRoad17x17);
        tileGameBoard[19][4].setButton(btnRoad19x4);
        tileGameBoard[19][8].setButton(btnRoad19x8);
        tileGameBoard[19][12].setButton(btnRoad19x12);
        tileGameBoard[19][16].setButton(btnRoad19x16);
        tileGameBoard[21][5].setButton(btnRoad21x5);
        tileGameBoard[21][7].setButton(btnRoad21x7);
        tileGameBoard[21][9].setButton(btnRoad21x9);
        tileGameBoard[21][11].setButton(btnRoad21x11);
        tileGameBoard[21][13].setButton(btnRoad21x13);
        tileGameBoard[21][15].setButton(btnRoad21x15);

        tileGameBoard[3][6].setImageView(img3x6);
        tileGameBoard[3][10].setImageView(img3x10);
        tileGameBoard[3][14].setImageView(img3x14);
        tileGameBoard[7][4].setImageView(img7x4);
        tileGameBoard[7][8].setImageView(img7x8);
        tileGameBoard[7][12].setImageView(img7x12);
        tileGameBoard[7][16].setImageView(img7x16);
        tileGameBoard[11][2].setImageView(img11x2);
        tileGameBoard[11][6].setImageView(img11x6);
        tileGameBoard[11][10].setImageView(img11x10);
        tileGameBoard[11][14].setImageView(img11x14);
        tileGameBoard[11][18].setImageView(img11x18);
        tileGameBoard[15][4].setImageView(img15x4);
        tileGameBoard[15][8].setImageView(img15x8);
        tileGameBoard[15][12].setImageView(img15x12);
        tileGameBoard[15][16].setImageView(img15x16);
        tileGameBoard[19][6].setImageView(img19x6);
        tileGameBoard[19][10].setImageView(img19x10);
        tileGameBoard[19][14].setImageView(img19x14);

        tileGameBoard[3][6].setTextResource(textResource3x6);
        tileGameBoard[3][10].setTextResource(textResource3x10);
        tileGameBoard[3][14].setTextResource(textResource3x14);
        tileGameBoard[7][4].setTextResource(textResource7x4);
        tileGameBoard[7][8].setTextResource(textResource7x8);
        tileGameBoard[7][12].setTextResource(textResource7x12);
        tileGameBoard[7][16].setTextResource(textResource7x16);
        tileGameBoard[11][2].setTextResource(textResource11x2);
        tileGameBoard[11][6].setTextResource(textResource11x6);
        tileGameBoard[11][10].setTextResource(textResource11x10);
        tileGameBoard[11][14].setTextResource(textResource11x14);
        tileGameBoard[11][18].setTextResource(textResource11x18);
        tileGameBoard[15][4].setTextResource(textResource15x4);
        tileGameBoard[15][8].setTextResource(textResource15x8);
        tileGameBoard[15][12].setTextResource(textResource15x12);
        tileGameBoard[15][16].setTextResource(textResource15x16);
        tileGameBoard[19][6].setTextResource(textResource19x6);
        tileGameBoard[19][10].setTextResource(textResource19x10);
        tileGameBoard[19][14].setTextResource(textResource19x14);

        gameBoard.getBluePlayer().setNumWoodText(textResourceWood0);
        gameBoard.getBluePlayer().setNumBrickText(textResourceBrick0);
        gameBoard.getBluePlayer().setNumWheatText(textResourceWheat0);
        gameBoard.getBluePlayer().setNumSheepText(textResourceSheep0);
        gameBoard.getBluePlayer().setNumStoneText(textResourceStone0);

        gameBoard.getRedPlayer().setNumWoodText(textResourceWood1);
        gameBoard.getRedPlayer().setNumBrickText(textResourceBrick1);
        gameBoard.getRedPlayer().setNumWheatText(textResourceWheat1);
        gameBoard.getRedPlayer().setNumSheepText(textResourceSheep1);
        gameBoard.getRedPlayer().setNumStoneText(textResourceStone1);

        gameBoard.setCirclePlayerTurn(circlePlayerTurn);

        gameBoard.setTextAreaError(textAreaError);

        gameBoard.setBtnNextTurn(btnNextTurn);

        gameBoard.setImgDice1(imgDice1);
        gameBoard.setImgDice2(imgDice2);
    }

    public void boardResourcesIni() {
        refreshResources();

        Image image;
        ResourcesType[] resources;
        int randomIndex;
        Random random = new Random();

        for (int r = 3; r < GameBoardUtils.NUM_OF_ROWS; r = r + 4) {
            for (int c = 2; c < GameBoardUtils.NUM_OF_COLS - 1; c = c + 2) {
                if (tileGameBoard[r][c] != null && tileGameBoard[r][c].getResourceTile() != null && (r != 11 || c != 10)) {
                    //get resource

                    resources = ResourcesType.values();
                    randomIndex = random.nextInt(resources.length - 1);
                    resource =resources[randomIndex];

                    while (resource.getNumTilesInBoard() == 0) {
                        resources = ResourcesType.values();
                        random = new Random();
                        randomIndex = random.nextInt(resources.length - 1);
                        resource =resources[randomIndex];
                    }
                    resource.setNumTilesInBoard(resource.getNumTilesInBoard() - 1);

                    tileGameBoard[r][c].setImageViewInt(randomIndex);

                    image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\" + resource + ".png"); // You can also use a URL or an input stream
                    tileGameBoard[r][c].getImageView().setImage(image);
                    tileGameBoard[r][c].getResourceTile().setResource(resource);
                    // Generate a random number between 2 and 12 (inclusive)
                    random = new Random();
                    int lowerBound = 2;
                    int upperBound = 12;
                    int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    tileGameBoard[r][c].getResourceTile().setNumberResource(randomNumber);
                    tileGameBoard[r][c].setResourceNumber(randomNumber);
                    tileGameBoard[r][c].getTextResource().setText(String.valueOf(randomNumber));
                }
            }
        }
        //place dessert
        resource = ResourcesType.DESSERT;
        image = new Image("file:C:\\Users\\ignac\\Documents\\IntelliJProjects\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\" + resource + ".png");
        tileGameBoard[11][10].getImageView().setImage(image);
        tileGameBoard[11][10].getResourceTile().setNumberResource(-1);
        tileGameBoard[11][10].setResourceNumber(-1);

    }

    public void sendChatMessage(){
        ChatUtils.sendChatMessage(chatMessageTextField, remoteChatService, chatMessagesTextArea);
    }

    public void townButtonPressed(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();

        // GET THE POSITION OF THE clickedButton IN THE ARRAY buttonGameBoard
        int row = -1;
        int col = -1;
        for (int i = 0; i < GameBoardUtils.NUM_OF_ROWS; i++) {
            for (int j = 0; j < GameBoardUtils.NUM_OF_COLS; j++) {
                if (tileGameBoard[i][j] != null && tileGameBoard[i][j].getButton() != null && tileGameBoard[i][j].getButton() == clickedButton) {
                    row = i;
                    col = j;
                    break;
                }
            }
            if (row != -1) {
                break;
            }
        }
        //CHECK THAT THERE IS NO HOUSE THERE
        if (tileGameBoard[row][col].getGameObject() == null) {
            //SETUP TOWN
            if (!gameBoard.isSetUpDone() && gameBoard.getPlayerTurn().getNumTowns() < 2) {
                if (GameObjectUtils.TownProximityRule(row, col, gameBoard.getGameBoardTiles())) {
                    placeTown(row, col, clickedButton);
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (gameBoard.isSetUpDone()) {
                //IT IS CONNECTED TO A ROAD
                if (GameObjectUtils.isTownConnectedByRoad(row, col, stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()),gameBoard.getGameBoardTiles())) {
                    //MAKE SURE IT IS NOT NEXT TO ANOTHER TOWN
                    if (GameObjectUtils.TownProximityRule(row, col,gameBoard.getGameBoardTiles())) {
                        //COST
                        if ((gameBoard.getPlayerTurn().getNumWood() >= 1 && gameBoard.getPlayerTurn().getNumBrick() >= 1 && gameBoard.getPlayerTurn().getNumWheat() >= 1 && gameBoard.getPlayerTurn().getNumSheep() >= 1)) {
                            gameBoard.getPlayerTurn().setNumWood(gameBoard.getPlayerTurn().getNumWood() - 1);
                            gameBoard.getPlayerTurn().setNumBrick(gameBoard.getPlayerTurn().getNumBrick() - 1);
                            gameBoard.getPlayerTurn().setNumWheat(gameBoard.getPlayerTurn().getNumWheat() - 1);
                            gameBoard.getPlayerTurn().setNumSheep(gameBoard.getPlayerTurn().getNumSheep() - 1);
                            //PLACE THE TOWN AND ADD IT TO LOGIC
                            placeTown(row, col, clickedButton);
                        } else if (gameBoard.isCHEATS()) {
                            placeTown(row, col, clickedButton);
                        } else {
                            textAreaError.setText("cant afford town");
                        }
                    } else {
                        textAreaError.setText("town proximity rule");
                    }
                } else {
                    textAreaError.setText("town not connected");
                }
            }
        }
        //TRY TO UPGRADE TOWN TO CITY
        else {
            //IT IS A TOW AND IT IS THE SAME COLOR
            if (tileGameBoard[row][col].getGameObject().getClass().equals(Town.class) && tileGameBoard[row][col].getGameObject().getStringColor().equals(gameBoard.getPlayerTurn().getStringPlayerColor())) {
                //COST
                if ((gameBoard.getPlayerTurn().getNumWheat() >= 2 && gameBoard.getPlayerTurn().getNumStone() >= 3)) {
                    gameBoard.getPlayerTurn().setNumWheat(gameBoard.getPlayerTurn().getNumWheat() - 2);
                    gameBoard.getPlayerTurn().setNumSheep(gameBoard.getPlayerTurn().getNumStone() - 3);
                    //PLACE THE TOWN AND ADD IT TO LOGIC
                    placeCity(row, col, clickedButton);
                } else if (gameBoard.isCHEATS()) {
                    placeCity(row, col, clickedButton);
                } else {
                    textAreaError.setText("cant afford City upgrade");
                }
            }
        }
        //sendGameboardAndUpdate();
    }

    public void roadButtonPressed(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();

        // GET THE POSITION OF THE clickedButton IN THE ARRAY buttonGameBoard
        int row = -1;
        int col = -1;
        for (int i = 0; i < GameBoardUtils.NUM_OF_ROWS; i++) {
            for (int j = 0; j < GameBoardUtils.NUM_OF_COLS; j++) {
                if (tileGameBoard[i][j] != null && tileGameBoard[i][j].getButton() != null && tileGameBoard[i][j].getButton() == clickedButton) {
                    row = i;
                    col = j;
                    break;
                }
            }
            if (row != -1) {
                break;
            }
        }
        //check there is no ROADS there before
        if (tileGameBoard[row][col].getGameObject() == null) {
            //SETUP ROADS
            if (!gameBoard.isSetUpDone() && gameBoard.getPlayerTurn().getNumRoads() < 2) {
                if (GameObjectUtils.TownProximityRule(row, col,gameBoard.getGameBoardTiles())) {
                    if (GameObjectUtils.isRoadConnectedByTownOrRoad(row, col, stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()), gameBoard.getGameBoardTiles())) {
                        placeRoad(row, col, clickedButton);
                    } else {
                        textAreaError.setText("road not connected to town or another road");
                    }
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (gameBoard.isSetUpDone()) {
                //IS THERE A TOWN CONNECTED TO IT?
                if (GameObjectUtils.isRoadConnectedByTownOrRoad(row, col, stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()), gameBoard.getGameBoardTiles())) {
                    //COSTS
                    if ((gameBoard.getPlayerTurn().getNumWood() >= 1 && gameBoard.getPlayerTurn().getNumBrick() >= 1)) {
                        gameBoard.getPlayerTurn().setNumWood(gameBoard.getPlayerTurn().getNumWood() - 1);
                        gameBoard.getPlayerTurn().setNumBrick(gameBoard.getPlayerTurn().getNumBrick() - 1);

                        placeRoad(row, col, clickedButton);
                    } else if (gameBoard.isCHEATS()) {
                        placeRoad(row, col, clickedButton);
                    } else {
                        textAreaError.setText("cant afford road");
                    }
                } else {
                    textAreaError.setText("road not connected to town or another road or town");
                }
            }
        }
        //sendGameboardAndUpdate();
    }

    public void cheatButtonPressed() {
        gameBoard.setCHEATS(!gameBoard.isCHEATS());
    }

    private void placeTown(int row, int col, Button clickedButton) {
        clickedButton.setTextFill(stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()));
        //LOGIC
        Town town = new Town(row, col, gameBoard.getPlayerTurn().getStringPlayerColor(), townEmoji, 1);
        tileGameBoard[row][col].setGameObject(town);

        gameBoard.getPlayerTurn().setNumPoints(gameBoard.getPlayerTurn().getNumPoints() + 1);
        gameBoard.getPlayerTurn().setNumTowns(gameBoard.getPlayerTurn().getNumTowns() + 1);
        gameBoard.getPlayerTurn().addTownList(town);

        refreshResources();
        refreshPoints();
        winnerExists = checkWinner();
        textAreaError.setText("town placed in row " + row + " and column " + col);
    }

    private void placeCity(int row, int col, Button clickedButton) {
        clickedButton.setText(cityEmoji);
        //LOGIC
        gameBoard.getGameBoardTiles()[row][col].getGameObject().setIcon(cityEmoji);
        Town town = (Town) tileGameBoard[row][col].getGameObject();
        town.setNumberOfResourcesFromUpgrade(2);

        gameBoard.getPlayerTurn().setNumPoints(gameBoard.getPlayerTurn().getNumPoints() + 1);
        gameBoard.getPlayerTurn().setNumTowns(gameBoard.getPlayerTurn().getNumTowns() - 1);
        gameBoard.getPlayerTurn().setNumTowns(gameBoard.getPlayerTurn().getNumCities() + 1);

        refreshResources();
        refreshPoints();
        winnerExists = checkWinner();
        textAreaError.setText("town placed in row " + row + " and column " + col);
    }

    private void placeRoad(int row, int col, Button clickedButton) {
        //PLACE ROAD BOTH VISUAL AND LOGIC
        Road road = new Road(row, col, gameBoard.getPlayerTurn().getStringPlayerColor(), roadEmoji);
        tileGameBoard[row][col].setGameObject(road);

        clickedButton.setTextFill(stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()));
        gameBoard.getPlayerTurn().setNumRoads(gameBoard.getPlayerTurn().getNumRoads() + 1);

        refreshResources();
        refreshPoints();
        winnerExists = checkWinner();
        textAreaError.setText("road placed is in row " + row + " and column " + col);
    }

    public void nextTurn() {

        if (!gameFinished) {
            textAreaError.setText("");

            if (gameBoard.getPlayerTurn() == gameBoard.getBluePlayer()) {
                gameBoard.setPlayerTurn(gameBoard.getRedPlayer());
                circlePlayerTurn.setFill(redColor);
            } else {
                gameBoard.setPlayerTurn(gameBoard.getBluePlayer());
                circlePlayerTurn.setFill(blueColor);
            }

            GameBoardUtils.checkEndOfSetup(gameBoard, textAreaError);

            diceTotal = GameBoardUtils.tryRollDice(gameBoard, diceTotal);

            //get resources from dice role
            if(gameBoard.isSetUpDone()){
                for (Town town : gameBoard.getBluePlayer().getTownList()) {
                    town.getResources(gameBoard.getBluePlayer(), diceTotal, town.getNumberOfResourcesFromUpgrade());
                }
                for (Town town : gameBoard.getRedPlayer().getTownList()) {
                    town.getResources(gameBoard.getRedPlayer(), diceTotal, town.getNumberOfResourcesFromUpgrade());
                }
            }

            gameBoard.setNumberOfMoves(gameBoard.getNumberOfMoves() + 1);

            sendGameboardAndUpdate();
            GameBoardUtils.changeBoardState(gameBoard, false);
        }
    }

    public static void refreshVisualTiles(){
        gameBoard.getGameBoardTiles()[3][6].getImageView().setImage(gameBoard.getGameBoardTiles()[3][6].intToImage(gameBoard.getGameBoardTiles()[3][6].getImageViewInt()));
        gameBoard.getGameBoardTiles()[3][10].getImageView().setImage(gameBoard.getGameBoardTiles()[3][10].intToImage(gameBoard.getGameBoardTiles()[3][10].getImageViewInt()));
        gameBoard.getGameBoardTiles()[3][14].getImageView().setImage(gameBoard.getGameBoardTiles()[3][14].intToImage(gameBoard.getGameBoardTiles()[3][14].getImageViewInt()));
        gameBoard.getGameBoardTiles()[7][4].getImageView().setImage(gameBoard.getGameBoardTiles()[7][4].intToImage(gameBoard.getGameBoardTiles()[7][4].getImageViewInt()));
        gameBoard.getGameBoardTiles()[7][8].getImageView().setImage(gameBoard.getGameBoardTiles()[7][8].intToImage(gameBoard.getGameBoardTiles()[7][8].getImageViewInt()));
        gameBoard.getGameBoardTiles()[7][12].getImageView().setImage(gameBoard.getGameBoardTiles()[7][12].intToImage(gameBoard.getGameBoardTiles()[7][12].getImageViewInt()));
        gameBoard.getGameBoardTiles()[7][16].getImageView().setImage(gameBoard.getGameBoardTiles()[7][16].intToImage(gameBoard.getGameBoardTiles()[7][16].getImageViewInt()));
        gameBoard.getGameBoardTiles()[11][2].getImageView().setImage(gameBoard.getGameBoardTiles()[11][2].intToImage(gameBoard.getGameBoardTiles()[11][2].getImageViewInt()));
        gameBoard.getGameBoardTiles()[11][6].getImageView().setImage(gameBoard.getGameBoardTiles()[11][6].intToImage(gameBoard.getGameBoardTiles()[11][6].getImageViewInt()));
        gameBoard.getGameBoardTiles()[11][14].getImageView().setImage(gameBoard.getGameBoardTiles()[11][14].intToImage(gameBoard.getGameBoardTiles()[11][14].getImageViewInt()));
        gameBoard.getGameBoardTiles()[11][18].getImageView().setImage(gameBoard.getGameBoardTiles()[11][18].intToImage(gameBoard.getGameBoardTiles()[11][18].getImageViewInt()));
        gameBoard.getGameBoardTiles()[15][4].getImageView().setImage(gameBoard.getGameBoardTiles()[15][4].intToImage(gameBoard.getGameBoardTiles()[15][4].getImageViewInt()));
        gameBoard.getGameBoardTiles()[15][8].getImageView().setImage(gameBoard.getGameBoardTiles()[15][8].intToImage(gameBoard.getGameBoardTiles()[15][8].getImageViewInt()));
        gameBoard.getGameBoardTiles()[15][12].getImageView().setImage(gameBoard.getGameBoardTiles()[15][12].intToImage(gameBoard.getGameBoardTiles()[15][12].getImageViewInt()));
        gameBoard.getGameBoardTiles()[15][16].getImageView().setImage(gameBoard.getGameBoardTiles()[15][16].intToImage(gameBoard.getGameBoardTiles()[15][16].getImageViewInt()));
        gameBoard.getGameBoardTiles()[19][6].getImageView().setImage(gameBoard.getGameBoardTiles()[19][6].intToImage(gameBoard.getGameBoardTiles()[19][6].getImageViewInt()));
        gameBoard.getGameBoardTiles()[19][10].getImageView().setImage(gameBoard.getGameBoardTiles()[19][10].intToImage(gameBoard.getGameBoardTiles()[19][10].getImageViewInt()));
        gameBoard.getGameBoardTiles()[19][14].getImageView().setImage(gameBoard.getGameBoardTiles()[19][14].intToImage(gameBoard.getGameBoardTiles()[19][14].getImageViewInt()));

        gameBoard.getGameBoardTiles()[3][6].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[3][6].getResourceNumber())));
        gameBoard.getGameBoardTiles()[3][10].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[3][10].getResourceNumber())));
        gameBoard.getGameBoardTiles()[3][14].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[3][14].getResourceNumber())));
        gameBoard.getGameBoardTiles()[7][4].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[7][4].getResourceNumber())));
        gameBoard.getGameBoardTiles()[7][8].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[7][8].getResourceNumber())));
        gameBoard.getGameBoardTiles()[7][12].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[7][12].getResourceNumber())));
        gameBoard.getGameBoardTiles()[7][16].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[7][16].getResourceNumber())));
        gameBoard.getGameBoardTiles()[11][2].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[11][2].getResourceNumber())));
        gameBoard.getGameBoardTiles()[11][6].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[11][6].getResourceNumber())));
        gameBoard.getGameBoardTiles()[11][14].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[11][14].getResourceNumber())));
        gameBoard.getGameBoardTiles()[11][18].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[11][18].getResourceNumber())));
        gameBoard.getGameBoardTiles()[15][4].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[15][4].getResourceNumber())));
        gameBoard.getGameBoardTiles()[15][8].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[15][8].getResourceNumber())));
        gameBoard.getGameBoardTiles()[15][12].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[15][12].getResourceNumber())));
        gameBoard.getGameBoardTiles()[15][16].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[15][16].getResourceNumber())));
        gameBoard.getGameBoardTiles()[19][6].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[19][6].getResourceNumber())));
        gameBoard.getGameBoardTiles()[19][10].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[19][10].getResourceNumber())));
        gameBoard.getGameBoardTiles()[19][14].getTextResource().setText((String.valueOf(gameBoard.getGameBoardTiles()[19][14].getResourceNumber())));

        gameBoard.getBluePlayer().getNumWoodText().setText("WOOD: " + String.valueOf(gameBoard.getBluePlayer().getNumWood()));
        gameBoard.getBluePlayer().getNumBrickText().setText("BRICK: " + String.valueOf(gameBoard.getBluePlayer().getNumBrick()));
        gameBoard.getBluePlayer().getNumSheepText().setText("SHEEP: " + String.valueOf(gameBoard.getBluePlayer().getNumSheep()));
        gameBoard.getBluePlayer().getNumWheatText().setText("WHEAT: " + String.valueOf(gameBoard.getBluePlayer().getNumWheat()));
        gameBoard.getBluePlayer().getNumStoneText().setText("STONE: " + String.valueOf(gameBoard.getBluePlayer().getNumStone()));

        gameBoard.getRedPlayer().getNumWoodText().setText(String.valueOf(gameBoard.getRedPlayer().getNumWood()) + " :WOOD");
        gameBoard.getRedPlayer().getNumBrickText().setText(String.valueOf(gameBoard.getRedPlayer().getNumBrick()) + " :BRICK");
        gameBoard.getRedPlayer().getNumSheepText().setText(String.valueOf(gameBoard.getRedPlayer().getNumSheep()) + " :SHEEP");
        gameBoard.getRedPlayer().getNumWheatText().setText(String.valueOf(gameBoard.getRedPlayer().getNumWheat()) + " :WHEAT");
        gameBoard.getRedPlayer().getNumStoneText().setText(String.valueOf(gameBoard.getRedPlayer().getNumStone()) + " :STONE");

        if(gameBoard.getPlayerTurn().getStringPlayerColor().equals(blueString)){
            gameBoard.getCirclePlayerTurn().setFill(blueColor);
        }
        else gameBoard.getCirclePlayerTurn().setFill(redColor);

        gameBoard.getImgDice1().setImage(GameBoardUtils.intToImageDice(gameBoard.getIntDice1()));
        gameBoard.getImgDice2().setImage(GameBoardUtils.intToImageDice(gameBoard.getIntDice2()));
    }

    public void sendGameboardAndUpdate(){
        GameBoard createdGameBoard = GameBoardUtils.CreateGameState(gameBoard, winnerExists);

        if(MainApplication.playerLoggedIn.name().equals(PlayerType.CLIENT.name())){
            NetworkingUtils.sendGameBoardToServer(createdGameBoard);
        }
        else{
            NetworkingUtils.sendGameBoardToClient(createdGameBoard);
        }
        refreshResources();
        refreshPoints();
        refreshColorCircle();
    }
     public void refreshColorCircle(){
         if (gameBoard.getPlayerTurn() == gameBoard.getBluePlayer()) {
             circlePlayerTurn.setFill(blueColor);
         } else {
             circlePlayerTurn.setFill(redColor);
         }
     }

    public void refreshResources() {
        //refresh resources text
        textResourceWood0.setText("WOOD: " + gameBoard.getBluePlayer().getNumWood());
        textResourceBrick0.setText("BRICK: " + gameBoard.getBluePlayer().getNumBrick());
        textResourceWheat0.setText("WHEAT: " + gameBoard.getBluePlayer().getNumWheat());
        textResourceSheep0.setText("SHEEP: " + gameBoard.getBluePlayer().getNumSheep());
        textResourceStone0.setText("STONE: " + gameBoard.getBluePlayer().getNumStone());

        textResourceWood1.setText(gameBoard.getRedPlayer().getNumWood() + " :WOOD");
        textResourceBrick1.setText(gameBoard.getRedPlayer().getNumBrick() + " :BRICK");
        textResourceWheat1.setText(gameBoard.getRedPlayer().getNumWheat() + " :WHEAT");
        textResourceSheep1.setText(gameBoard.getRedPlayer().getNumSheep() + " :SHEEP");
        textResourceStone1.setText(gameBoard.getRedPlayer().getNumStone() + " :STONE");

    }

    public void refreshPoints() {
        textPlayerPoints0.setText(String.valueOf(gameBoard.getBluePlayer().getNumPoints()));
        textPlayerPoints1.setText(String.valueOf(gameBoard.getRedPlayer().getNumPoints()));
    }

    private boolean checkWinner() {
        gameFinished = DialogUtils.CheckWinner(gameBoard, POINTS_TO_WIN);
        return gameFinished;
    }

    public static Color stringToColor(String colorString) {
        if (colorString.equals("blue")) return blueColor;
        else if (colorString.equals("red")) return redColor;
        else return null;
    }

    public static void restoreGameboard(GameBoard gameBoardThatWasSent){
        gameBoard.setPlayerTurn(gameBoardThatWasSent.getPlayerTurn());
        gameBoard.setNumberOfMoves(gameBoardThatWasSent.getNumberOfMoves());
        gameBoard.setCHEATS(gameBoardThatWasSent.isCHEATS());
        gameBoard.setSetUpDone(gameBoardThatWasSent.isSetUpDone());
        gameBoard.setBluePlayer(gameBoardThatWasSent.getBluePlayer());
        gameBoard.setRedPlayer(gameBoardThatWasSent.getRedPlayer());
        gameBoard.setIntDice1((gameBoardThatWasSent.getIntDice1()));
        gameBoard.setIntDice2((gameBoardThatWasSent.getIntDice2()));


        GameBoardUtils.restoreGameBoard(gameBoardThatWasSent, gameBoard);

        GameBoardUtils.changeBoardState(gameBoard, true);

        GameBoardUtils.checkEndOfSetup(gameBoard, gameBoard.getTextAreaError());

        refreshVisualTiles();
    }

    public void newGame() {
        for (int i = 0; i < GameBoardUtils.NUM_OF_ROWS; i++) {
            for (int j = 0; j < GameBoardUtils.NUM_OF_COLS; j++) {
                if (gameBoard.getGameBoardTiles()[i][j] != null && gameBoard.getGameBoardTiles()[i][j].getButton() != null) {
                    gameBoard.getGameBoardTiles()[i][j].setGameObject(null);
                    gameBoard.getGameBoardTiles()[i][j].getButton().setTextFill(blackColor);
                    if (gameBoard.getGameBoardTiles()[i][j].getButton().getText().equals(cityEmoji)) {
                        gameBoard.getGameBoardTiles()[i][j].getButton().setText(townEmoji);
                    }
                }
            }
        }

        gameBoard.setNumberOfMoves(0);
        gameBoard.setSetUpDone(false);
        gameBoard.setPlayerTurn(gameBoard.getBluePlayer());
        circlePlayerTurn.setFill(blueColor);

        gameBoard.getBluePlayer().resetValues();
        gameBoard.getRedPlayer().resetValues();

        refreshResources();
        refreshPoints();
    }

    public void save() {
        GameBoard createdGameBoard = GameBoardUtils.CreateGameState(gameBoard, false);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("saveGame.dat"))) {
            oos.writeObject(createdGameBoard);
            DialogUtils.ShowSaveDialog();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load() {
        newGame();
        //LOAD INTO RECOVERED GAME BOARD THE SAVED STATE
        GameBoard recoveredGameBoard;
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("saveGame.dat"))) {
            recoveredGameBoard = (GameBoard) oos.readObject();
            DialogUtils.ShowLoadDialog();
            newGame();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        restoreGameboard(recoveredGameBoard);
    }

    public void generateDoc() {
        ReflectionUtils.generateDocReflection();
    }
}
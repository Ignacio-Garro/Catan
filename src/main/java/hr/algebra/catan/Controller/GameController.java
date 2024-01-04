package hr.algebra.catan.Controller;

import hr.algebra.catan.Model.GameBoard;
import hr.algebra.catan.Model.Objects.Player;
import hr.algebra.catan.Model.Objects.ResourceTile;
import hr.algebra.catan.Model.Objects.Road;
import hr.algebra.catan.Model.Objects.Town;
import hr.algebra.catan.Model.ResourcesType;
import hr.algebra.catan.Model.Tile;
import hr.algebra.catan.Utils.ReflectionUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
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
    private ImageView imgDice1;
    @FXML
    private ImageView imgDice2;

    @FXML
    private Circle circlePlayerTurn;

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
    private Text textResourceWood0;
    @FXML
    private Text textResourceBrick0;
    @FXML
    private Text textResourceWheat0;
    @FXML
    private Text textResourceSheep0;
    @FXML
    private Text textResourceStone0;

    @FXML
    private Text textResourceWood1;
    @FXML
    private Text textResourceBrick1;
    @FXML
    private Text textResourceWheat1;
    @FXML
    private Text textResourceSheep1;
    @FXML
    private Text textResourceStone1;
    @FXML
    private TextArea textAreaError;
    @FXML
    private Text textPlayerPoints0;
    @FXML
    private Text textPlayerPoints1;

    public GameBoard gameBoard;
    public static Tile[][] tileGameBoard;
    private static final Integer NUM_OF_ROWS = 23;
    private static final Integer NUM_OF_COLS = 21;
    private static final Integer POINTS_TO_WIN = 10;
    public int diceTotal;
    private static boolean gameFinished = false;
    private ResourcesType resource;
    private final Color blueColor = Color.rgb(0, 0, 255, 1);
    private final Color redColor = Color.rgb(255, 0, 0, 1);
    private final Color blackColor = Color.rgb(0, 0, 0, 1);
    private final String blueString = "blue";
    private final String redString = "red";
    private final String cityEmoji = "🏢";
    private final String townEmoji = "\uD83C\uDFE0";
    private final String roadEmoji = "\uD83D\uDEE3";


    public void initialize() {
        Player bluePlayer = new Player(blueString, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Player redPlayer = new Player(redString, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

        tileGameBoard = new Tile[NUM_OF_ROWS][NUM_OF_COLS];
        gameBoard = new GameBoard(bluePlayer, bluePlayer, redPlayer, 0, tileGameBoard, false, false);

        placeTiles();
        BoardResourcesIni();
    }

    public void placeTiles() {
        //TOWNS
        tileGameBoard[0][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 0, 6);
        tileGameBoard[0][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 0, 10);
        tileGameBoard[0][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 0, 14);
        tileGameBoard[2][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 2, 4);
        tileGameBoard[2][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 2, 8);
        tileGameBoard[2][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 2, 12);
        tileGameBoard[2][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 2, 16);
        tileGameBoard[4][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 4, 4);
        tileGameBoard[4][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 4, 8);
        tileGameBoard[4][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 4, 12);
        tileGameBoard[4][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 4, 16);
        tileGameBoard[6][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 6, 2);
        tileGameBoard[6][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 6, 6);
        tileGameBoard[6][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 6, 10);
        tileGameBoard[6][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 6, 14);
        tileGameBoard[6][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 6, 18);
        tileGameBoard[8][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 8, 2);
        tileGameBoard[8][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 8, 6);
        tileGameBoard[8][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 8, 10);
        tileGameBoard[8][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 8, 14);
        tileGameBoard[8][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 8, 18);
        tileGameBoard[10][0] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 0);
        tileGameBoard[10][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 4);
        tileGameBoard[10][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 8);
        tileGameBoard[10][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 12);
        tileGameBoard[10][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 16);
        tileGameBoard[10][20] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 20);
        tileGameBoard[12][0] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 0);
        tileGameBoard[12][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 4);
        tileGameBoard[12][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 8);
        tileGameBoard[12][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 12);
        tileGameBoard[12][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 16);
        tileGameBoard[12][20] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 20);
        tileGameBoard[14][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 14, 2);
        tileGameBoard[14][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 14, 6);
        tileGameBoard[14][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 14, 10);
        tileGameBoard[14][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 14, 14);
        tileGameBoard[14][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 14, 18);
        tileGameBoard[16][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 16, 2);
        tileGameBoard[16][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 16, 6);
        tileGameBoard[16][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 16, 10);
        tileGameBoard[16][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 16, 14);
        tileGameBoard[16][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 16, 18);
        tileGameBoard[18][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 18, 4);
        tileGameBoard[18][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 18, 8);
        tileGameBoard[18][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 18, 12);
        tileGameBoard[18][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 18, 16);
        tileGameBoard[20][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 20, 4);
        tileGameBoard[20][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 20, 8);
        tileGameBoard[20][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 20, 12);
        tileGameBoard[20][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 20, 16);
        tileGameBoard[22][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 22, 6);
        tileGameBoard[22][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 22, 10);
        tileGameBoard[22][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 22, 10);
        //ROADS
        tileGameBoard[1][5] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 5);
        tileGameBoard[1][7] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 7);
        tileGameBoard[1][9] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 9);
        tileGameBoard[1][11] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 11);
        tileGameBoard[1][13] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 13);
        tileGameBoard[1][15] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 15);
        tileGameBoard[3][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 4);
        tileGameBoard[3][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 8);
        tileGameBoard[3][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 12);
        tileGameBoard[3][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 16);
        tileGameBoard[5][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 3);
        tileGameBoard[5][5] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 5);
        tileGameBoard[5][7] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 7);
        tileGameBoard[5][9] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 9);
        tileGameBoard[5][11] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 11);
        tileGameBoard[5][13] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 13);
        tileGameBoard[5][15] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 15);
        tileGameBoard[5][17] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 17);
        tileGameBoard[7][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 2);
        tileGameBoard[7][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 6);
        tileGameBoard[7][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 10);
        tileGameBoard[7][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 14);
        tileGameBoard[7][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 18);
        tileGameBoard[9][1] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 1);
        tileGameBoard[9][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 3);
        tileGameBoard[9][5] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 5);
        tileGameBoard[9][7] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 7);
        tileGameBoard[9][9] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 9);
        tileGameBoard[9][11] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 11);
        tileGameBoard[9][13] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 13);
        tileGameBoard[9][15] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 15);
        tileGameBoard[9][17] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 17);
        tileGameBoard[9][19] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 19);
        tileGameBoard[11][0] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 0);
        tileGameBoard[11][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 4);
        tileGameBoard[11][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 8);
        tileGameBoard[11][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 12);
        tileGameBoard[11][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 16);
        tileGameBoard[11][20] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 20);
        tileGameBoard[13][1] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 1);
        tileGameBoard[13][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 3);
        tileGameBoard[13][5] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 5);
        tileGameBoard[13][7] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 7);
        tileGameBoard[13][9] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 9);
        tileGameBoard[13][11] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 11);
        tileGameBoard[13][13] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 13);
        tileGameBoard[13][15] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 15);
        tileGameBoard[13][17] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 17);
        tileGameBoard[13][19] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 19);
        tileGameBoard[15][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 2);
        tileGameBoard[15][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 6);
        tileGameBoard[15][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 10);
        tileGameBoard[15][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 14);
        tileGameBoard[15][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 18);
        tileGameBoard[17][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 3);
        tileGameBoard[17][5] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 5);
        tileGameBoard[17][7] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 5);
        tileGameBoard[17][9] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 9);
        tileGameBoard[17][11] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 11);
        tileGameBoard[17][13] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 13);
        tileGameBoard[17][15] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 15);
        tileGameBoard[17][17] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 17);
        tileGameBoard[19][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 4);
        tileGameBoard[19][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 8);
        tileGameBoard[19][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 12);
        tileGameBoard[19][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 16);
        tileGameBoard[21][5] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 21, 5);
        tileGameBoard[21][7] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 21, 7);
        tileGameBoard[21][9] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 21, 9);
        tileGameBoard[21][11] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 21, 11);
        tileGameBoard[21][13] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 21, 13);
        tileGameBoard[21][15] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 21, 15);
        //RESOURCES
        tileGameBoard[3][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 6);
        tileGameBoard[3][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 10);
        tileGameBoard[3][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 14);
        tileGameBoard[7][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 4);
        tileGameBoard[7][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 8);
        tileGameBoard[7][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 12);
        tileGameBoard[7][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 16);
        tileGameBoard[11][2] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 2);
        tileGameBoard[11][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 6);
        tileGameBoard[11][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 10);
        tileGameBoard[11][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 14);
        tileGameBoard[11][18] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 18);
        tileGameBoard[15][4] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 4);
        tileGameBoard[15][8] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 8);
        tileGameBoard[15][12] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 12);
        tileGameBoard[15][16] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 16);
        tileGameBoard[19][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 6);
        tileGameBoard[19][10] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 10);
        tileGameBoard[19][14] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 19, 14);
        //IDK
        /*
        tileGameBoard[3][6] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 6);
        tileGameBoard[1][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 1, 3);
        tileGameBoard[2][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 2, 3);
        tileGameBoard[3][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 3, 3);
        tileGameBoard[4][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 4, 3);
        tileGameBoard[5][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 5, 3);
        tileGameBoard[6][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 6, 3);
        tileGameBoard[7][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 7, 3);
        tileGameBoard[8][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 8, 3);
        tileGameBoard[9][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 9, 3);
        tileGameBoard[10][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 10, 3);
        tileGameBoard[11][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 11, 3);
        tileGameBoard[12][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 12, 3);
        tileGameBoard[13][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 13, 3);
        tileGameBoard[14][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 14, 3);
        tileGameBoard[15][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 15, 3);
        tileGameBoard[16][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 16, 3);
        tileGameBoard[17][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 17, 3);
        tileGameBoard[18][3] = new Tile(null, null, null, null, null, gameBoard.getPlayerTurn(), 18, 3);
        */
        //-----------------------------------------------------------

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

        tileGameBoard[3][6].setResourceNumber(textResource3x6);
        tileGameBoard[3][10].setResourceNumber(textResource3x10);
        tileGameBoard[3][14].setResourceNumber(textResource3x14);
        tileGameBoard[7][4].setResourceNumber(textResource7x4);
        tileGameBoard[7][8].setResourceNumber(textResource7x8);
        tileGameBoard[7][12].setResourceNumber(textResource7x12);
        tileGameBoard[7][16].setResourceNumber(textResource7x16);
        tileGameBoard[11][2].setResourceNumber(textResource11x2);
        tileGameBoard[11][6].setResourceNumber(textResource11x6);
        tileGameBoard[11][10].setResourceNumber(textResource11x10);
        tileGameBoard[11][14].setResourceNumber(textResource11x14);
        tileGameBoard[11][18].setResourceNumber(textResource11x18);
        tileGameBoard[15][4].setResourceNumber(textResource15x4);
        tileGameBoard[15][8].setResourceNumber(textResource15x8);
        tileGameBoard[15][12].setResourceNumber(textResource15x12);
        tileGameBoard[15][16].setResourceNumber(textResource15x16);
        tileGameBoard[19][6].setResourceNumber(textResource19x6);
        tileGameBoard[19][10].setResourceNumber(textResource19x10);
        tileGameBoard[19][14].setResourceNumber(textResource19x14);

        //SET RESOURCETILE IN TILES
        tileGameBoard[3][6].setResourceTile(new ResourceTile(3, 6, null, null, null, -1));
        tileGameBoard[3][10].setResourceTile(new ResourceTile(3, 10, null, null, null, -1));
        tileGameBoard[3][14].setResourceTile(new ResourceTile(3, 14, null, null, null, -1));
        tileGameBoard[7][4].setResourceTile(new ResourceTile(7, 4, null, null, null, -1));
        tileGameBoard[7][8].setResourceTile(new ResourceTile(7, 8, null, null, null, -1));
        tileGameBoard[7][12].setResourceTile(new ResourceTile(7, 12, null, null, null, -1));
        tileGameBoard[7][16].setResourceTile(new ResourceTile(7, 16, null, null, null, -1));
        tileGameBoard[11][2].setResourceTile(new ResourceTile(11, 2, null, null, null, -1));
        tileGameBoard[11][6].setResourceTile(new ResourceTile(11, 6, null, null, null, -1));
        tileGameBoard[11][10].setResourceTile(new ResourceTile(11, 10, null, null, null, -1));
        tileGameBoard[11][14].setResourceTile(new ResourceTile(11, 14, null, null, null, -1));
        tileGameBoard[11][18].setResourceTile(new ResourceTile(11, 18, null, null, null, -1));
        tileGameBoard[15][4].setResourceTile(new ResourceTile(15, 4, null, null, null, -1));
        tileGameBoard[15][8].setResourceTile(new ResourceTile(15, 8, null, null, null, -1));
        tileGameBoard[15][12].setResourceTile(new ResourceTile(15, 12, null, null, null, -1));
        tileGameBoard[15][16].setResourceTile(new ResourceTile(15, 16, null, null, null, -1));
        tileGameBoard[19][6].setResourceTile(new ResourceTile(19, 6, null, null, null, -1));
        tileGameBoard[19][10].setResourceTile(new ResourceTile(19, 10, null, null, null, -1));
        tileGameBoard[19][14].setResourceTile(new ResourceTile(19, 14, null, null, null, -1));
    }

    public void BoardResourcesIni() {
        Image image;
        refreshResources();

        for (int r = 3; r < NUM_OF_ROWS; r = r + 4) {
            for (int c = 2; c < NUM_OF_COLS - 1; c = c + 2) {
                if (tileGameBoard[r][c] != null && tileGameBoard[r][c].getResourceTile() != null && (r != 11 || c != 10)) {
                    //get resource
                    resource = getRandomResource();
                    while (resource.getNumTilesInBoard() == 0) {
                        resource = getRandomResource();
                    }
                    resource.setNumTilesInBoard(resource.getNumTilesInBoard() - 1);

                    image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\" + resource + ".png"); // You can also use a URL or an input stream
                    tileGameBoard[r][c].getImageView().setImage(image);
                    tileGameBoard[r][c].getResourceTile().setResource(resource);
                    // Generate a random number between 2 and 12 (inclusive)
                    Random random = new Random();
                    int lowerBound = 2;
                    int upperBound = 12;
                    int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    tileGameBoard[r][c].getResourceTile().setNumberResource(randomNumber);
                    tileGameBoard[r][c].getResourceNumber().setText((String.valueOf(randomNumber)));
                }
            }
        }
        //place dessert
        resource = ResourcesType.DESSERT;
        image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\" + resource + ".png");
        tileGameBoard[11][10].getImageView().setImage(image);
        tileGameBoard[11][10].getResourceTile().setNumberResource(-1);
        tileGameBoard[11][10].getResourceNumber().setText(null);

    }

    private static ResourcesType getRandomResource() {
        ResourcesType[] resource = ResourcesType.values();
        Random random = new Random();
        int randomIndex = random.nextInt(resource.length - 1);
        return resource[randomIndex];
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

            //check end of setup
            if (!gameBoard.isSetUpDone() && gameBoard.getBluePlayer().getNumTowns() == 2 && gameBoard.getRedPlayer().getNumTowns() == 2 && gameBoard.getBluePlayer().getNumRoads() == 2 && gameBoard.getRedPlayer().getNumRoads() == 2) {
                textAreaError.setText("The board has been setup properly");
                gameBoard.setSetUpDone(true);
            } else if (!gameBoard.isSetUpDone())
                textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

            if (gameBoard.isSetUpDone()) {
                //get dice roles
                Random random = new Random();
                int dice1 = random.nextInt(6) + 1;
                random = new Random();
                int dice2 = random.nextInt(6) + 1;
                diceTotal = dice1 + dice2;

                //display dice roll
                Image image;
                image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\" + dice1 + ".png");
                imgDice1.setImage(image);
                image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\" + dice2 + ".png");
                imgDice2.setImage(image);
            }


            //get resources from dice role
            for (Town town : gameBoard.getBluePlayer().getTownList()) {
                town.getResources(gameBoard.getBluePlayer(), diceTotal, town.getNumberOfResourcesFromUpgrade());
            }
            for (Town town : gameBoard.getRedPlayer().getTownList()) {
                town.getResources(gameBoard.getRedPlayer(), diceTotal, town.getNumberOfResourcesFromUpgrade());
            }

            gameBoard.setNumberOfMoves(gameBoard.getNumberOfMoves() + 1);

            refreshResources();
            refreshPoints();
        }
    }

    public void townButtonPressed(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();

        // GET THE POSITION OF THE clickedButton IN THE ARRAY buttonGameBoard
        int row = -1;
        int col = -1;
        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j < NUM_OF_COLS; j++) {
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
                if (TownProximityRule(row, col)) {
                    placeTown(row, col, clickedButton);
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (gameBoard.isSetUpDone()) {
                //IT IS CONNECTED TO A ROAD
                if (isTownConnectedByRoad(row, col, stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()))) {
                    //MAKE SURE IT IS NOT NEXT TO ANOTHER TOWN
                    if (TownProximityRule(row, col)) {
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
    }

    public void roadButtonPressed(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();

        // GET THE POSITION OF THE clickedButton IN THE ARRAY buttonGameBoard
        int row = -1;
        int col = -1;
        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j < NUM_OF_COLS; j++) {
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
                if (TownProximityRule(row, col)) {
                    if (isRoadConnectedByTownOrRoad(row, col, stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()))) {
                        placeRoad(row, col, clickedButton);
                    } else {
                        textAreaError.setText("road not connected to town or another road");
                    }
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (gameBoard.isSetUpDone()) {
                //IS THERE A TOWN CONNECTED TO IT?
                if (isRoadConnectedByTownOrRoad(row, col, stringToColor(gameBoard.getPlayerTurn().getStringPlayerColor()))) {
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
        checkWinner();
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
        checkWinner();
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
        checkWinner();
        textAreaError.setText("road placed is in row " + row + " and column " + col);
    }

    private boolean TownProximityRule(int row, int col) {
        for (int r = -2; r < 4; r = r + 2) { // -2 0 2
            for (int c = -2; c < 4; c = c + 2) {
                if ((row + r) >= 0 && (row + r) < NUM_OF_ROWS && (col + c) >= 0 && (col + c) < NUM_OF_COLS &&
                        tileGameBoard[row + r][col + c] != null &&
                        tileGameBoard[row + r][col + c].getGameObject() != null &&
                        tileGameBoard[row + r][col + c].getGameObject().getClass().equals(Town.class)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isRoadConnectedByTownOrRoad(int row, int col, Color playerColor) {
        int yAxis = -1;
        int xAxis = -1;
        while (yAxis <= 1) {
            while (xAxis <= 1) {
                //THERE IS A TOWN HERE
                if ((row + yAxis) >= 0 && (row + yAxis) < NUM_OF_ROWS && (col + xAxis) >= 0 && (col + xAxis) < NUM_OF_COLS &&
                        tileGameBoard[row + yAxis][col + xAxis] != null && tileGameBoard[row + yAxis][col + xAxis].getButton() != null) {
                    //TOWN IS PLACED
                    if (tileGameBoard[row + yAxis][col + xAxis].getGameObject() != null) {
                        //TOWN IS OF THE PLAYER
                        if (stringToColor(tileGameBoard[row + yAxis][col + xAxis].getGameObject().getStringColor()) == playerColor) {
                            return true;
                        }
                    }
                    //TOWN NOT PLACED
                    else {
                        //TRY TO SEE IF THERE IS A ROAD THAT CONNECTS
                        int yAxis2 = -1;
                        int xAxis2 = -1;
                        while (yAxis2 < 2) {
                            while (xAxis2 < 2) {
                                //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                                if ((row + yAxis + yAxis2) >= 0 && (row + yAxis + yAxis2) < NUM_OF_ROWS && (col + xAxis + xAxis2) >= 0 && (col + xAxis + xAxis2) < NUM_OF_COLS &&
                                        tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2] != null &&
                                        tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject() != null &&
                                        tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject().getClass().equals(Road.class) &&
                                        stringToColor(tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject().getStringColor()) == playerColor) {
                                    return true;
                                }
                                xAxis2++;
                            }
                            yAxis2++;
                            xAxis2 = -1;
                        }
                    }
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }

    private boolean isTownConnectedByRoad(int row, int col, Color playerColor) {
        int yAxis = -1;
        int xAxis = -1;
        while (yAxis < 2) {
            while (xAxis < 2) {
                //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                if ((row + yAxis) >= 0 && (row + yAxis) < NUM_OF_ROWS && (col + xAxis) >= 0 && (col + xAxis) < NUM_OF_COLS &&
                        tileGameBoard[row + yAxis][col + xAxis] != null &&
                        tileGameBoard[row + yAxis][col + xAxis].getGameObject() != null &&
                        tileGameBoard[row + yAxis][col + xAxis].getGameObject().getClass().equals(Road.class) &&
                        stringToColor(tileGameBoard[row + yAxis][col + xAxis].getGameObject().getStringColor()) == playerColor) {
                    return true;
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }

    private void refreshResources() {
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

    private void refreshPoints() {
        textPlayerPoints0.setText(String.valueOf(gameBoard.getBluePlayer().getNumPoints()));
        textPlayerPoints1.setText(String.valueOf(gameBoard.getRedPlayer().getNumPoints()));
    }

    private void checkWinner() {
        if (gameBoard.getBluePlayer().getNumPoints() >= POINTS_TO_WIN) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("WINNER!!!");
            alert.setHeaderText("BLUE PLAYER HAS WON THE GAME");
            alert.showAndWait();
            gameFinished = true;
        } else if (gameBoard.getRedPlayer().getNumPoints() >= POINTS_TO_WIN) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("WINNER!!!");
            alert.setHeaderText("RED PLAYER HAS WON THE GAME");
            alert.showAndWait();
            gameFinished = true;
        }
    }

    public void cheatButtonPressed() {
        gameBoard.setCHEATS(!gameBoard.isCHEATS());
    }

    public Color stringToColor(String colorString) {
        if (colorString.equals("blue")) return blueColor;
        else if (colorString.equals("red")) return redColor;
        else return null;
    }

    public void newGame() {
        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j < NUM_OF_COLS; j++) {
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
        //MAKE GAME BOARD TO SAVE
        Tile[][] gameBoardTiles = new Tile[NUM_OF_ROWS][NUM_OF_COLS];

        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j < NUM_OF_COLS; j++) {
                //There is something in that tile
                if (gameBoard.getGameBoardTiles()[i][j] != null && gameBoard.getGameBoardTiles()[i][j].getGameObject() != null) {
                    gameBoardTiles[i][j] = gameBoard.getGameBoardTiles()[i][j];
                }
            }
        }

        GameBoard gameBoardToSave = new GameBoard(gameBoard.getPlayerTurn(), gameBoard.getBluePlayer(), gameBoard.getRedPlayer(), gameBoard.getNumberOfMoves(), gameBoardTiles, gameBoard.isCHEATS(), gameBoard.isSetUpDone());
        //SAVE INTO A FILE THE GAME GAMEOBJECTS
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("saveGame.dat"))) {
            oos.writeObject(gameBoardToSave);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Save game successful!");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully saved the game!");

            alert.showAndWait();

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

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Load game successful!");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully loaded the game!");

            alert.showAndWait();

            newGame();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        gameBoard.setPlayerTurn(recoveredGameBoard.getPlayerTurn());
        gameBoard.setNumberOfMoves(recoveredGameBoard.getNumberOfMoves());
        gameBoard.setCHEATS(recoveredGameBoard.isCHEATS());
        gameBoard.setSetUpDone(recoveredGameBoard.isSetUpDone());
        gameBoard.setBluePlayer(recoveredGameBoard.getBluePlayer());
        gameBoard.setRedPlayer(recoveredGameBoard.getRedPlayer());


        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j < NUM_OF_COLS; j++) {
                if (recoveredGameBoard.getGameBoardTiles()[i][j] != null) {
                    if (recoveredGameBoard.getGameBoardTiles()[i][j].getGameObject() != null) {
                        //PLACE GAME OBJECT
                        gameBoard.getGameBoardTiles()[i][j].setGameObject(recoveredGameBoard.getGameBoardTiles()[i][j].getGameObject());
                        //CHANGE BUTTON VIEW
                        gameBoard.getGameBoardTiles()[i][j].getButton().setTextFill(stringToColor(recoveredGameBoard.getGameBoardTiles()[i][j].getGameObject().getStringColor()));
                        gameBoard.getGameBoardTiles()[i][j].getButton().setText(recoveredGameBoard.getGameBoardTiles()[i][j].getGameObject().getIcon());
                    }
                }
            }
        }

        refreshResources();
        refreshPoints();
    }

    public void generateDoc() {
        ReflectionUtils.generateDocReflection();
    }
}


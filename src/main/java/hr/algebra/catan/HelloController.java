package hr.algebra.catan;

import hr.algebra.catan.Objects.*;
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

import java.util.Random;

public class HelloController {
    public int diceTotal;
    @FXML
    private ToggleButton tglbtnCheats;
    @FXML
    private Button btnNextTurn;


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

    private static final Integer NUM_OF_ROWS = 23;
    private static final Integer NUM_OF_COLS = 21;
    private static final Integer POINTS_TO_WIN = 5;
    public static Tile [][] tileGameBoard;
    public static boolean CHEATS = false;
    public static boolean setUpDone = false;
    public static boolean gameFinished = false;
    public Town lastTownPlaced;
    public ResourcesType resource;
    public Player playerTurn;
    public Player bluePlayer;
    public Player redPlayer;
    public Color blueColor = Color.rgb(0, 0, 255, 1);
    public Color redColor = Color.rgb(255, 0, 0, 1);

    public int dice1;
    public int dice2;



    public void initialize() {
        bluePlayer = new Player(blueColor, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        redPlayer = new Player(redColor, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        playerTurn = bluePlayer;

        textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

        tileGameBoard = new Tile[NUM_OF_ROWS][NUM_OF_COLS];

        placeTiles();
        BoardResourcesIni();

    }

    private void placeTiles() {
        tileGameBoard[0][6] = new Tile(null, null, null, null, null,0,6);
        tileGameBoard[0][10] = new Tile(null, null, null, null, null, 0, 10);
        tileGameBoard[0][14] = new Tile(null, null, null, null, null, 0, 14);
        tileGameBoard[2][4] = new Tile(null, null, null, null, null, 2, 4);
        tileGameBoard[2][8] = new Tile(null, null, null, null, null, 2, 8);
        tileGameBoard[2][12] = new Tile(null, null, null, null, null, 2, 12);
        tileGameBoard[2][16] = new Tile(null, null, null, null, null, 2, 16);
        tileGameBoard[4][4] = new Tile(null, null, null, null, null, 4, 4);
        tileGameBoard[4][8] = new Tile(null, null, null, null, null, 4, 8);
        tileGameBoard[4][12] = new Tile(null, null, null, null, null, 4, 12);
        tileGameBoard[4][16] = new Tile(null, null, null, null, null, 4, 16);
        tileGameBoard[6][2] = new Tile(null, null, null, null, null, 6, 2);
        tileGameBoard[6][6] = new Tile(null, null, null, null, null, 6, 6);
        tileGameBoard[6][10] = new Tile(null, null, null, null, null, 6, 10);
        tileGameBoard[6][14] = new Tile(null, null, null, null, null, 6, 14);
        tileGameBoard[6][18] = new Tile(null, null, null, null, null, 6, 18);
        tileGameBoard[8][2] = new Tile(null, null, null, null, null, 8, 2);
        tileGameBoard[8][6] = new Tile(null, null, null, null, null, 8, 6);
        tileGameBoard[8][10] = new Tile(null, null, null, null, null, 8, 10);
        tileGameBoard[8][14] = new Tile(null, null, null, null, null, 8, 14);
        tileGameBoard[8][18] = new Tile(null, null, null, null, null, 8, 18);
        tileGameBoard[10][0] = new Tile(null, null, null, null, null, 10, 0);
        tileGameBoard[10][4] = new Tile(null, null, null, null, null, 10, 4);
        tileGameBoard[10][8] = new Tile(null, null, null, null, null, 10, 8);
        tileGameBoard[10][12] = new Tile(null, null, null, null, null, 10, 12);
        tileGameBoard[10][16] = new Tile(null, null, null, null, null, 10, 16);
        tileGameBoard[10][20] = new Tile(null, null, null, null, null, 10, 20);
        tileGameBoard[12][0] = new Tile(null, null, null, null, null, 12, 0);
        tileGameBoard[12][4] = new Tile(null, null, null, null, null, 12, 4);
        tileGameBoard[12][8] = new Tile(null, null, null, null, null, 12, 8);
        tileGameBoard[12][12] = new Tile(null, null, null, null, null, 12, 12);
        tileGameBoard[12][16] = new Tile(null, null, null, null, null, 12, 16);
        tileGameBoard[12][20] = new Tile(null, null, null, null, null, 12, 20);
        tileGameBoard[14][2] = new Tile(null, null, null, null, null, 14, 2);
        tileGameBoard[14][6] = new Tile(null, null, null, null, null, 14, 6);
        tileGameBoard[14][10] = new Tile(null, null, null, null, null, 14, 10);
        tileGameBoard[14][14] = new Tile(null, null, null, null, null, 14, 14);
        tileGameBoard[14][18] = new Tile(null, null, null, null, null, 14, 18);
        tileGameBoard[16][2] = new Tile(null, null, null, null, null, 16, 2);
        tileGameBoard[16][6] = new Tile(null, null, null, null, null, 16, 6);
        tileGameBoard[16][10] = new Tile(null, null, null, null, null, 16, 10);
        tileGameBoard[16][14] = new Tile(null, null, null, null, null, 16, 14);
        tileGameBoard[16][18] = new Tile(null, null, null, null, null, 16, 18);
        tileGameBoard[18][4] = new Tile(null, null, null, null, null, 18, 4);
        tileGameBoard[18][8] = new Tile(null, null, null, null, null, 18, 8);
        tileGameBoard[18][12] = new Tile(null, null, null, null, null, 18, 12);
        tileGameBoard[18][16] = new Tile(null, null, null, null, null, 18, 16);
        tileGameBoard[20][4] = new Tile(null, null, null, null, null, 20, 4);
        tileGameBoard[20][8] = new Tile(null, null, null, null, null, 20, 8);
        tileGameBoard[20][12] = new Tile(null, null, null, null, null, 20, 12);
        tileGameBoard[20][16] = new Tile(null, null, null, null, null, 20, 16);
        tileGameBoard[22][6] = new Tile(null, null, null, null, null, 22, 6);
        tileGameBoard[22][10] = new Tile(null, null, null, null, null, 22, 10);
        tileGameBoard[22][14] = new Tile(null, null, null, null, null, 22, 10);

        tileGameBoard[1][5] = new Tile(null, null, null, null, null, 1, 5);
        tileGameBoard[1][7] = new Tile(null, null, null, null, null, 1, 7);
        tileGameBoard[1][9] = new Tile(null, null, null, null, null, 1, 9);
        tileGameBoard[1][11] = new Tile(null, null, null, null, null, 1, 11);
        tileGameBoard[1][13] = new Tile(null, null, null, null, null, 1, 13);
        tileGameBoard[1][15] = new Tile(null, null, null, null, null, 1, 15);
        tileGameBoard[3][4] = new Tile(null, null, null, null, null, 3, 4);
        tileGameBoard[3][8] = new Tile(null, null, null, null, null, 3, 8);
        tileGameBoard[3][12] = new Tile(null, null, null, null, null, 3, 12);
        tileGameBoard[3][16] = new Tile(null, null, null, null, null, 3, 16);
        tileGameBoard[5][3] = new Tile(null, null, null, null, null, 5, 3);
        tileGameBoard[5][5] = new Tile(null, null, null, null, null, 5, 5);
        tileGameBoard[5][7] = new Tile(null, null, null, null, null, 5, 7);
        tileGameBoard[5][9] = new Tile(null, null, null, null, null, 5, 9);
        tileGameBoard[5][11] = new Tile(null, null, null, null, null, 5, 11);
        tileGameBoard[5][13] = new Tile(null, null, null, null, null, 5, 13);
        tileGameBoard[5][15] = new Tile(null, null, null, null, null, 5, 15);
        tileGameBoard[5][17] = new Tile(null, null, null, null, null, 5, 17);
        tileGameBoard[7][2] = new Tile(null, null, null, null, null, 7, 2);
        tileGameBoard[7][6] = new Tile(null, null, null, null, null, 7, 6);
        tileGameBoard[7][10] = new Tile(null, null, null, null, null, 7, 10);
        tileGameBoard[7][14] = new Tile(null, null, null, null, null, 7, 14);
        tileGameBoard[7][18] = new Tile(null, null, null, null, null, 7, 18);
        tileGameBoard[9][1] = new Tile(null, null, null, null, null, 9, 1);
        tileGameBoard[9][3] = new Tile(null, null, null, null, null, 9, 3);
        tileGameBoard[9][5] = new Tile(null, null, null, null, null, 9, 5);
        tileGameBoard[9][7] = new Tile(null, null, null, null, null, 9, 7);
        tileGameBoard[9][9] = new Tile(null, null, null, null, null, 9, 9);
        tileGameBoard[9][11] = new Tile(null, null, null, null, null, 9, 11);
        tileGameBoard[9][13] = new Tile(null, null, null, null, null, 9, 13);
        tileGameBoard[9][15] = new Tile(null, null, null, null, null, 9, 15);
        tileGameBoard[9][17] = new Tile(null, null, null, null, null, 9, 17);
        tileGameBoard[9][19] = new Tile(null, null, null, null, null, 9, 19);
        tileGameBoard[11][0] = new Tile(null, null, null, null, null, 11, 0);
        tileGameBoard[11][4] = new Tile(null, null, null, null, null, 11, 4);
        tileGameBoard[11][8] = new Tile(null, null, null, null, null, 11, 8);
        tileGameBoard[11][12] = new Tile(null, null, null, null, null, 11, 12);
        tileGameBoard[11][16] = new Tile(null, null, null, null, null, 11, 16);
        tileGameBoard[11][20] = new Tile(null, null, null, null, null, 11, 20);
        tileGameBoard[13][1] = new Tile(null, null, null, null, null, 13, 1);
        tileGameBoard[13][3] = new Tile(null, null, null, null, null, 13, 3);
        tileGameBoard[13][5] = new Tile(null, null, null, null, null, 13, 5);
        tileGameBoard[13][7] = new Tile(null, null, null, null, null, 13, 7);
        tileGameBoard[13][9] = new Tile(null, null, null, null, null, 13, 9);
        tileGameBoard[13][11] = new Tile(null, null, null, null, null, 13, 11);
        tileGameBoard[13][13] = new Tile(null, null, null, null, null, 13, 13);
        tileGameBoard[13][15] = new Tile(null, null, null, null, null, 13, 15);
        tileGameBoard[13][17] = new Tile(null, null, null, null, null, 13, 17);
        tileGameBoard[13][19] = new Tile(null, null, null, null, null, 13, 19);
        tileGameBoard[15][2] = new Tile(null, null, null, null, null, 15, 2);
        tileGameBoard[15][6] = new Tile(null, null, null, null, null, 15, 6);
        tileGameBoard[15][10] = new Tile(null, null, null, null, null, 15, 10);
        tileGameBoard[15][14] = new Tile(null, null, null, null, null, 15, 14);
        tileGameBoard[15][18] = new Tile(null, null, null, null, null, 15, 18);
        tileGameBoard[17][3] = new Tile(null, null, null, null, null, 17, 3);
        tileGameBoard[17][5] = new Tile(null, null, null, null, null, 17, 5);
        tileGameBoard[17][7] = new Tile(null, null, null, null, null, 17, 5);
        tileGameBoard[17][9] = new Tile(null, null, null, null, null, 17, 9);
        tileGameBoard[17][11] = new Tile(null, null, null, null, null, 17, 11);
        tileGameBoard[17][13] = new Tile(null, null, null, null, null, 17, 13);
        tileGameBoard[17][15] = new Tile(null, null, null, null, null, 17, 15);
        tileGameBoard[17][17] = new Tile(null, null, null, null, null, 17, 17);
        tileGameBoard[19][4] = new Tile(null, null, null, null, null, 19, 4);
        tileGameBoard[19][8] = new Tile(null, null, null, null, null, 19, 8);
        tileGameBoard[19][12] = new Tile(null, null, null, null, null, 19, 12);
        tileGameBoard[19][16] = new Tile(null, null, null, null, null, 19, 16);
        tileGameBoard[21][5] = new Tile(null, null, null, null, null, 21, 5);
        tileGameBoard[21][7] = new Tile(null, null, null, null, null, 21, 7);
        tileGameBoard[21][9] = new Tile(null, null, null, null, null, 21, 9);
        tileGameBoard[21][11] = new Tile(null, null, null, null, null, 21, 11);
        tileGameBoard[21][13] = new Tile(null, null, null, null, null, 21, 13);
        tileGameBoard[21][15] = new Tile(null, null, null, null, null, 21, 15);

        tileGameBoard[3][6] = new Tile(null, null, null, null, null, 3, 6);
        tileGameBoard[3][10] = new Tile(null, null, null, null, null, 3, 10);
        tileGameBoard[3][14] = new Tile(null, null, null, null, null, 3, 14);
        tileGameBoard[7][4] = new Tile(null, null, null, null, null, 7, 4);
        tileGameBoard[7][8] = new Tile(null, null, null, null, null, 7, 8);
        tileGameBoard[7][12] = new Tile(null, null, null, null, null, 7, 12);
        tileGameBoard[7][16] = new Tile(null, null, null, null, null, 7, 16);
        tileGameBoard[11][2] = new Tile(null, null, null, null, null, 11, 2);
        tileGameBoard[11][6] = new Tile(null, null, null, null, null, 11, 6);
        tileGameBoard[11][10] = new Tile(null, null, null, null, null, 11, 10);
        tileGameBoard[11][14] = new Tile(null, null, null, null, null, 11, 14);
        tileGameBoard[11][18] = new Tile(null, null, null, null, null, 11, 18);
        tileGameBoard[15][4] = new Tile(null, null, null, null, null, 15, 4);
        tileGameBoard[15][8] = new Tile(null, null, null, null, null, 15, 8);
        tileGameBoard[15][12] = new Tile(null, null, null, null, null, 15, 12);
        tileGameBoard[15][16] = new Tile(null, null, null, null, null, 15, 16);
        tileGameBoard[19][6] = new Tile(null, null, null, null, null, 19, 6);
        tileGameBoard[19][10] = new Tile(null, null, null, null, null, 19, 10);
        tileGameBoard[19][14] = new Tile(null, null, null, null, null, 19, 14);

        tileGameBoard[3][6] = new Tile(null, null, null, null, null, 3, 6);
        tileGameBoard[1][3] = new Tile(null, null, null, null, null, 1, 3);
        tileGameBoard[2][3] = new Tile(null, null, null, null, null, 2, 3);
        tileGameBoard[3][3] = new Tile(null, null, null, null, null, 3, 3);
        tileGameBoard[4][3] = new Tile(null, null, null, null, null, 4, 3);
        tileGameBoard[5][3] = new Tile(null, null, null, null, null, 5, 3);
        tileGameBoard[6][3] = new Tile(null, null, null, null, null, 6, 3);
        tileGameBoard[7][3] = new Tile(null, null, null, null, null, 7, 3);
        tileGameBoard[8][3] = new Tile(null, null, null, null, null, 8, 3);
        tileGameBoard[9][3] = new Tile(null, null, null, null, null, 9, 3);
        tileGameBoard[10][3] = new Tile(null, null, null, null, null, 10, 3);
        tileGameBoard[11][3] = new Tile(null, null, null, null, null, 11, 3);
        tileGameBoard[12][3] = new Tile(null, null, null, null, null, 12, 3);
        tileGameBoard[13][3] = new Tile(null, null, null, null, null, 13, 3);
        tileGameBoard[14][3] = new Tile(null, null, null, null, null, 14, 3);
        tileGameBoard[15][3] = new Tile(null, null, null, null, null, 15, 3);
        tileGameBoard[16][3] = new Tile(null, null, null, null, null, 16, 3);
        tileGameBoard[17][3] = new Tile(null, null, null, null, null, 17, 3);
        tileGameBoard[18][3] = new Tile(null, null, null, null, null, 18, 3);

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

        //-----------------------------------------------------------
        tileGameBoard[1][3].setResourceTile(new ResourceTile(1, 3, null, null, -1));
        tileGameBoard[3][6].setResourceTile(new ResourceTile(3, 6, null, null, -1));
        tileGameBoard[3][10].setResourceTile(new ResourceTile(3, 10, null, null, -1));
        tileGameBoard[3][14].setResourceTile(new ResourceTile(3, 14, null, null, -1));
        tileGameBoard[7][4].setResourceTile(new ResourceTile(7, 4, null, null, -1));
        tileGameBoard[7][8].setResourceTile(new ResourceTile(7, 8, null, null, -1));
        tileGameBoard[7][12].setResourceTile(new ResourceTile(7, 12, null, null, -1));
        tileGameBoard[7][16].setResourceTile(new ResourceTile(7, 16, null, null, -1));
        tileGameBoard[11][2].setResourceTile(new ResourceTile(11, 2, null, null, -1));
        tileGameBoard[11][6].setResourceTile(new ResourceTile(11, 6, null, null, -1));
        tileGameBoard[11][10].setResourceTile(new ResourceTile(11, 10, null, null, -1));
        tileGameBoard[11][14].setResourceTile(new ResourceTile(11, 14, null, null, -1));
        tileGameBoard[11][18].setResourceTile(new ResourceTile(11, 18, null, null, -1));
        tileGameBoard[15][4].setResourceTile(new ResourceTile(15, 4, null, null, -1));
        tileGameBoard[15][8].setResourceTile(new ResourceTile(15, 8, null, null, -1));
        tileGameBoard[15][12].setResourceTile(new ResourceTile(15, 12, null, null, -1));
        tileGameBoard[15][16].setResourceTile(new ResourceTile(15, 16, null, null, -1));
        tileGameBoard[19][6].setResourceTile(new ResourceTile(19, 6, null, null, -1));
        tileGameBoard[19][10].setResourceTile(new ResourceTile(19, 10, null, null, -1));
        tileGameBoard[19][14].setResourceTile(new ResourceTile(19, 14, null, null, -1));
    }

    public void BoardResourcesIni() {
        Image image;
        refreshResources();

        for(int r = 3; r < NUM_OF_ROWS; r = r + 4){
            for(int c = 2; c < NUM_OF_COLS - 1; c = c + 2){
                try{
                    if(tileGameBoard[r][c].getResourceTile() != null && (r != 11 || c != 10)){
                        //get resource
                        resource = getRandomResource();
                        while (resource.getNumTilesInBoard() == 0){
                            resource = getRandomResource();
                        }
                        resource.setNumTilesInBoard(resource.getNumTilesInBoard() - 1);

                        image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\" + resource +".png"); // You can also use a URL or an input stream
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
                catch (Exception ignored) {

                }
            }
        }
        //place dessert
        resource = ResourcesType.DESSERT;
        image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\tiles\\" + resource +".png");
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
    public void nextTurn(ActionEvent event) {

        if(!gameFinished){
            textAreaError.setText("");

            if(playerTurn == bluePlayer){
                playerTurn = redPlayer;
                circlePlayerTurn.setFill(redColor);
            }
            else{
                playerTurn = bluePlayer;
                circlePlayerTurn.setFill(blueColor);
            }

            //check end of setup
            if(!setUpDone && bluePlayer.getNumTowns() == 2 && redPlayer.getNumTowns() == 2 && bluePlayer.getNumRoads() == 2 && redPlayer.getNumRoads() == 2){
                textAreaError.setText("The board has been setup properly");
                setUpDone = true;
            }
            else if ( !setUpDone)textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

            if(setUpDone){
                //get dice roles
                Random random = new Random();
                dice1 = random.nextInt(6) + 1;
                random = new Random();
                dice2 = random.nextInt(6) + 1;
                diceTotal = dice1 + dice2;

                //display dice roll
                Image image;
                image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\" + dice1 +".png");
                imgDice1.setImage(image);
                image = new Image("file:C:\\Users\\ignac\\Documents\\GitHub\\Catan\\src\\main\\resources\\hr\\algebra\\catan\\Images\\dice\\" + dice2 +".png");
                imgDice2.setImage(image);
            }


            //get resources from dice role
            for (Town town : bluePlayer.getTownList()) {
                town.getResources(bluePlayer, diceTotal, 1);
            }
            for (Town town : redPlayer.getTownList()) {
                town.getResources(redPlayer, diceTotal, 1);
            }
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
                try{
                    if (tileGameBoard[i][j].getButton() == clickedButton) {
                        row = i;
                        col = j;
                        break;
                    }
                } catch (Exception ignored) {

                }

            }
            if (row != -1) {
                break;
            }
        }
        //CHECK THAT THERE IS NO HOUSE THERE
        if(tileGameBoard[row][col].getGameObject() == null) {
            //SETUP TOWN
            if(!setUpDone && playerTurn.getNumTowns() < 2) {
                if(TownProximityRule(row,col)) {
                    placeTown(row, col, clickedButton);
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (setUpDone){
                //IT IS CONNECTED TO A ROAD
                if (isTownConnectedByRoad(row, col, playerTurn.getPlayerColor())) {
                    //MAKE SURE IT IS NOT NEXT TO ANOTHER TOWN
                    if (TownProximityRule(row, col)) {
                        //COST
                        if((playerTurn.getNumWood() >= 1 && playerTurn.getNumBrick() >= 1 && playerTurn.getNumWheat() >= 1 && playerTurn.getNumSheep() >= 1)) {
                            playerTurn.setNumWood(playerTurn.getNumWood() - 1);
                            playerTurn.setNumBrick(playerTurn.getNumBrick() - 1);
                            playerTurn.setNumWheat(playerTurn.getNumWheat() - 1);
                            playerTurn.setNumSheep(playerTurn.getNumSheep() - 1);
                            //PLACE THE TOWN AND ADD IT TO LOGIC
                            placeTown(row, col, clickedButton);
                        }
                        else if(CHEATS){
                            placeTown(row, col, clickedButton);
                        }
                        else {
                            textAreaError.setText("cant afford town");
                        }
                    }
                    else {
                        textAreaError.setText("town proximity rule");
                    }
                }
                else {
                    textAreaError.setText("town not connected");
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
                try{
                    if (tileGameBoard[i][j].getButton() == clickedButton) {
                        row = i;
                        col = j;
                        break;
                    }
                } catch (Exception ignored) {

                }

            }
            if (row != -1) {
                break;
            }
        }
        //check there is no ROADS there before
        if(tileGameBoard[row][col].getGameObject() == null) {
            //SETUP ROADS
            if(!setUpDone && playerTurn.getNumRoads() < 2) {
                if(TownProximityRule(row,col)) {
                    if(isRoadConnectedByTownOrRoad(row,col, playerTurn.getPlayerColor())){
                        placeRoad(row,col,clickedButton);
                    }
                    else{
                        textAreaError.setText("road not connected to town or another road");
                    }
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (setUpDone){
                //IS THERE A TOWN CONNECTED TO IT?
                if(isRoadConnectedByTownOrRoad(row,col, playerTurn.getPlayerColor())){
                    //COSTS
                    if((playerTurn.getNumWood() >= 1 && playerTurn.getNumBrick() >= 1)){
                        playerTurn.setNumWood(playerTurn.getNumWood() - 1);
                        playerTurn.setNumBrick(playerTurn.getNumBrick() - 1);

                        placeRoad(row,col,clickedButton);
                    }
                    else if(CHEATS){
                        placeRoad(row,col,clickedButton);
                    }
                    else{
                        textAreaError.setText("cant afford road");
                    }
                }
                else {
                    textAreaError.setText("road not connected to town or another road or town");
                }
            }
        }
    }

    private void placeTown(int row, int col, Button clickedButton){
        clickedButton.setTextFill(playerTurn.getPlayerColor());
        //LOGIC
        Town town = new Town(row, col, playerTurn.getPlayerColor());
        tileGameBoard[row][col].setGameObject(town);

        playerTurn.setNumPoints(playerTurn.getNumPoints() + 1);
        playerTurn.setNumTowns(playerTurn.getNumTowns() + 1);
        playerTurn.addTownList(town);
        lastTownPlaced = town;

        refreshResources();
        refreshPoints();
        checkWinner();
        textAreaError.setText("town placed in row " + row + " and column " + col);
    }

    private void placeRoad(int row, int col, Button clickedButton) {
        //PLACE ROAD BOTH VISUAL AND LOGIC
        Road road = new Road(row, col, playerTurn.getPlayerColor());
        tileGameBoard[row][col].setGameObject(road);

        clickedButton.setTextFill(playerTurn.getPlayerColor());
        playerTurn.setNumRoads(playerTurn.getNumRoads() + 1);

        refreshResources();
        refreshPoints();
        checkWinner();
        textAreaError.setText("road placed is in row " + row + " and column " + col);
    }

    private boolean TownProximityRule(int row, int col) {
        for(int r = -2; r < 4; r = r + 2){ // -2 0 2
            for(int c = -2; c < 4; c = c + 2){
                try{
                    if(tileGameBoard[row + r][col + c].getGameObject().getClass().equals(Town.class)){
                        return false;
                    }
                }
                catch (Exception ignored){
                }

            }
        }

        return true;
    }

    private boolean isRoadConnectedByTownOrRoad(int row, int col, Color playerColor) {
        int yAxis= -1;
        int xAxis= -1;
        while (yAxis <= 1){
            while (xAxis <= 1){
                try{
                    //THERE IS A TOWN HERE
                    if(tileGameBoard[row + yAxis][col +  xAxis].getButton() != null){
                        //TOWN IS PLACED
                        if(tileGameBoard[row + yAxis][col +  xAxis].getGameObject() != null){
                            //TOWN IS OF THE PLAYER
                            if(tileGameBoard[row + yAxis][col +  xAxis].getGameObject().getColor() == playerColor){
                                return true;
                            }
                        }
                        //TOWN NOT PLACED
                        else{
                            //TRY TO SEE IF THERE IS A ROAD THAT CONNECTS
                            int yAxis2= -1;
                            int xAxis2= -1;
                            while (yAxis2 < 2){
                                while (xAxis2 < 2){
                                    try{
                                        //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                                        if(tileGameBoard[row + yAxis + yAxis2][col +  xAxis +  xAxis2].getGameObject().getClass().equals(Road.class) && tileGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getGameObject().getColor() == playerColor){
                                            return true;
                                        }
                                    }
                                    catch (Exception ignored){
                                    }
                                    xAxis2++;
                                }
                                yAxis2++;
                                xAxis2 = -1;
                            }
                        }
                    }


                }
                catch (Exception ignored){
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }

    private boolean isTownConnectedByRoad(int row, int col, Color playerColor) {
        int yAxis= -1;
        int xAxis= -1;
        while (yAxis < 2){
            while (xAxis < 2){
                try{
                    //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                    if(tileGameBoard[row + yAxis][col +  xAxis].getGameObject().getClass().equals(Road.class)  && tileGameBoard[row + yAxis][col + xAxis].getGameObject().getColor() == playerColor){
                        return true;
                    }
                }
                catch (Exception ignored){
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }
    private void refreshResources(){
        //refresh resources text
        textResourceWood0.setText("WOOD: " + bluePlayer.getNumWood());
        textResourceBrick0.setText("BRICK: " + bluePlayer.getNumBrick());
        textResourceWheat0.setText("WHEAT: " + bluePlayer.getNumWheat());
        textResourceSheep0.setText("SHEEP: " + bluePlayer.getNumSheep());
        textResourceStone0.setText("STONE: " + bluePlayer.getNumStone());

        textResourceWood1.setText(redPlayer.getNumWood() + " :WOOD");
        textResourceBrick1.setText(redPlayer.getNumBrick() +" :BRICK");
        textResourceWheat1.setText(redPlayer.getNumWheat() +" :WHEAT" );
        textResourceSheep1.setText(redPlayer.getNumSheep() +" :SHEEP");
        textResourceStone1.setText(redPlayer.getNumStone() +" :STONE");

    }
    private void refreshPoints() {
        textPlayerPoints0.setText(String.valueOf(bluePlayer.getNumPoints()));
        textPlayerPoints1.setText(String.valueOf(redPlayer.getNumPoints()));
    }
    private void checkWinner(){
        if(bluePlayer.getNumPoints() >= POINTS_TO_WIN){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("WINNER!!!");
            alert.setHeaderText("BLUE PLAYER HAS WON THE GAME");
            alert.showAndWait();
            gameFinished = true;
        }
        else if(redPlayer.getNumPoints() >= POINTS_TO_WIN){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("WINNER!!!");
            alert.setHeaderText("RED PLAYER HAS WON THE GAME");
            alert.showAndWait();
            gameFinished = true;
        }
    }
    public void CheatButtonPressed(ActionEvent event) {
        CHEATS = !CHEATS;
    }
}


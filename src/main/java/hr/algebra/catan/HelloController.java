package hr.algebra.catan;

import hr.algebra.catan.Objects.Player;
import hr.algebra.catan.Objects.ResourceTile;
import hr.algebra.catan.Objects.Town;
import hr.algebra.catan.Objects.Road;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.util.Random;

public class HelloController {

    private static final Integer NUM_OF_TILES = 19;
    private static final Integer NUM_OF_ROWS = 23;
    private static final Integer NUM_OF_COLS = 21;
    private static final Integer POINT_TO_WIN = 5;
    public static Button[][] buttonGameBoard;
    public static Object [][] objectGameBoard;
    public static ImageView[][] ImageViewGameBoard;
    public static Text[] ImageTextViewGameBoard;

    public static final String HOUSE_EMOJI = "\uD83C\uDFE0";
    public static final String ROAD_EMOJI = "\uD83D\uDEE3";
    public static final boolean CHEATS = false;
    public static boolean setUpDone = false;
    public static boolean gameFinished = false;

    public Town lastTownPlaced;
    public ResourcesType resource;
    public Player playerTurn;
    public Player bluePlayer;
    public Player redPlayer;
    public Color blueColor = Color.rgb(0, 0, 255, 1);
    public Color redColor = Color.rgb(255, 0, 0, 1);
    public Color blackColor = Color.rgb(0,0,0,1);

    public int dice1;
    public int dice2;

    public int diceTotal;

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
    private ImageView imgWood0;
    @FXML
    private ImageView imgBrick0;
    @FXML
    private ImageView imgWheat0;
    @FXML
    private ImageView imgSheep0;
    @FXML
    private ImageView imgStone0;

    @FXML
    private ImageView imgWood1;
    @FXML
    private ImageView imgBrick1;
    @FXML
    private ImageView imgWheat1;
    @FXML
    private ImageView imgSheep1;
    @FXML
    private ImageView imgStone1;

    @FXML
    private ImageView imgDice1;
    @FXML
    private ImageView imgDice2;


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
    private Circle circle0;
    @FXML
    private Circle circle1;




    public void initialize() {
        bluePlayer = new Player(blueColor, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        redPlayer = new Player(redColor, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        playerTurn = bluePlayer;

        textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

        buttonGameBoard = new Button[NUM_OF_ROWS][NUM_OF_COLS];
        objectGameBoard = new Object[NUM_OF_ROWS][NUM_OF_COLS];
        ImageViewGameBoard = new ImageView[NUM_OF_ROWS][NUM_OF_COLS];
        ImageTextViewGameBoard = new Text[NUM_OF_TILES];

        buttonGameBoard[0][6] = btnHouse0x6;
        buttonGameBoard[0][10] = btnHouse0x10;
        buttonGameBoard[0][14] = btnHouse0x14;
        buttonGameBoard[2][4] = btnHouse2x4;
        buttonGameBoard[2][8] = btnHouse2x8;
        buttonGameBoard[2][12] = btnHouse2x12;
        buttonGameBoard[2][16] = btnHouse2x16;
        buttonGameBoard[4][4] = btnHouse4x4;
        buttonGameBoard[4][8] = btnHouse4x8;
        buttonGameBoard[4][12] = btnHouse4x12;
        buttonGameBoard[4][16] = btnHouse4x16;
        buttonGameBoard[6][2] = btnHouse6x2;
        buttonGameBoard[6][6] = btnHouse6x6;
        buttonGameBoard[6][10] = btnHouse6x10;
        buttonGameBoard[6][14] = btnHouse6x14;
        buttonGameBoard[6][18] = btnHouse6x18;
        buttonGameBoard[8][2] = btnHouse8x2;
        buttonGameBoard[8][6] = btnHouse8x6;
        buttonGameBoard[8][10] = btnHouse8x10;
        buttonGameBoard[8][14] = btnHouse8x14;
        buttonGameBoard[8][18] = btnHouse8x18;
        buttonGameBoard[10][0] = btnHouse10x0;
        buttonGameBoard[10][4] = btnHouse10x4;
        buttonGameBoard[10][8] = btnHouse10x8;
        buttonGameBoard[10][12] = btnHouse10x12;
        buttonGameBoard[10][16] = btnHouse10x16;
        buttonGameBoard[10][20] = btnHouse10x20;
        buttonGameBoard[12][0] = btnHouse12x0;
        buttonGameBoard[12][4] = btnHouse12x4;
        buttonGameBoard[12][8] = btnHouse12x8;
        buttonGameBoard[12][12] = btnHouse12x12;
        buttonGameBoard[12][16] = btnHouse12x16;
        buttonGameBoard[12][20] = btnHouse12x20;
        buttonGameBoard[14][2] = btnHouse14x2;
        buttonGameBoard[14][6] = btnHouse14x6;
        buttonGameBoard[14][10] = btnHouse14x10;
        buttonGameBoard[14][14] = btnHouse14x14;
        buttonGameBoard[14][18] = btnHouse14x18;
        buttonGameBoard[16][2] = btnHouse16x2;
        buttonGameBoard[16][6] = btnHouse16x6;
        buttonGameBoard[16][10] = btnHouse16x10;
        buttonGameBoard[16][14] = btnHouse16x14;
        buttonGameBoard[16][18] = btnHouse16x18;
        buttonGameBoard[18][4] = btnHouse18x4;
        buttonGameBoard[18][8] = btnHouse18x8;
        buttonGameBoard[18][12] = btnHouse18x12;
        buttonGameBoard[18][16] = btnHouse18x16;
        buttonGameBoard[20][4] = btnHouse20x4;
        buttonGameBoard[20][8] = btnHouse20x8;
        buttonGameBoard[20][12] = btnHouse20x12;
        buttonGameBoard[20][16] = btnHouse20x16;
        buttonGameBoard[22][6] = btnHouse22x6;
        buttonGameBoard[22][10] = btnHouse22x10;
        buttonGameBoard[22][14] = btnHouse22x14;

        buttonGameBoard[1][5] = btnRoad1x5;
        buttonGameBoard[1][7] = btnRoad1x7;
        buttonGameBoard[1][9] = btnRoad1x9;
        buttonGameBoard[1][11] = btnRoad1x11;
        buttonGameBoard[1][13] = btnRoad1x13;
        buttonGameBoard[1][15] = btnRoad1x15;
        buttonGameBoard[3][4] = btnRoad3x4;
        buttonGameBoard[3][8] = btnRoad3x8;
        buttonGameBoard[3][12] = btnRoad3x12;
        buttonGameBoard[3][16] = btnRoad3x16;
        buttonGameBoard[5][3] = btnRoad5x3;
        buttonGameBoard[5][5] = btnRoad5x5;
        buttonGameBoard[5][7] = btnRoad5x7;
        buttonGameBoard[5][9] = btnRoad5x9;
        buttonGameBoard[5][11] = btnRoad5x11;
        buttonGameBoard[5][13] = btnRoad5x13;
        buttonGameBoard[5][15] = btnRoad5x15;
        buttonGameBoard[5][17] = btnRoad5x17;
        buttonGameBoard[7][2] = btnRoad7x2;
        buttonGameBoard[7][6] = btnRoad7x6;
        buttonGameBoard[7][10] = btnRoad7x10;
        buttonGameBoard[7][14] = btnRoad7x14;
        buttonGameBoard[7][18] = btnRoad7x18;
        buttonGameBoard[9][1] = btnRoad9x1;
        buttonGameBoard[9][3] = btnRoad9x3;
        buttonGameBoard[9][5] = btnRoad9x5;
        buttonGameBoard[9][7] = btnRoad9x7;
        buttonGameBoard[9][9] = btnRoad9x9;
        buttonGameBoard[9][11] = btnRoad9x11;
        buttonGameBoard[9][13] = btnRoad9x13;
        buttonGameBoard[9][15] = btnRoad9x15;
        buttonGameBoard[9][17] = btnRoad9x17;
        buttonGameBoard[9][19] = btnRoad9x19;
        buttonGameBoard[11][0] = btnRoad11x0;
        buttonGameBoard[11][4] = btnRoad11x4;
        buttonGameBoard[11][8] = btnRoad11x8;
        buttonGameBoard[11][12] = btnRoad11x12;
        buttonGameBoard[11][16] = btnRoad11x16;
        buttonGameBoard[11][20] = btnRoad11x20;
        buttonGameBoard[13][1] = btnRoad13x1;
        buttonGameBoard[13][3] = btnRoad13x3;
        buttonGameBoard[13][5] = btnRoad13x5;
        buttonGameBoard[13][7] = btnRoad13x7;
        buttonGameBoard[13][9] = btnRoad13x9;
        buttonGameBoard[13][11] = btnRoad13x11;
        buttonGameBoard[13][13] = btnRoad13x13;
        buttonGameBoard[13][15] = btnRoad13x15;
        buttonGameBoard[13][17] = btnRoad13x17;
        buttonGameBoard[13][19] = btnRoad13x19;
        buttonGameBoard[15][2] = btnRoad15x2;
        buttonGameBoard[15][6] = btnRoad15x6;
        buttonGameBoard[15][10] = btnRoad15x10;
        buttonGameBoard[15][14] = btnRoad15x14;
        buttonGameBoard[15][18] = btnRoad15x18;
        buttonGameBoard[17][3] = btnRoad17x3;
        buttonGameBoard[17][5] = btnRoad17x5;
        buttonGameBoard[17][7] = btnRoad17x7;
        buttonGameBoard[17][9] = btnRoad17x9;
        buttonGameBoard[17][11] = btnRoad17x11;
        buttonGameBoard[17][13] = btnRoad17x13;
        buttonGameBoard[17][15] = btnRoad17x15;
        buttonGameBoard[17][17] = btnRoad17x17;
        buttonGameBoard[19][4] = btnRoad19x4;
        buttonGameBoard[19][8] = btnRoad19x8;
        buttonGameBoard[19][12] = btnRoad19x12;
        buttonGameBoard[19][16] = btnRoad19x16;
        buttonGameBoard[21][5] = btnRoad21x5;
        buttonGameBoard[21][7] = btnRoad21x7;
        buttonGameBoard[21][9] = btnRoad21x9;
        buttonGameBoard[21][11] = btnRoad21x11;
        buttonGameBoard[21][13] = btnRoad21x13;
        buttonGameBoard[21][15] = btnRoad21x15;

        ImageViewGameBoard[3][6] = img3x6;
        ImageViewGameBoard[3][10] = img3x10;
        ImageViewGameBoard[3][14] = img3x14;
        ImageViewGameBoard[7][4] = img7x4;
        ImageViewGameBoard[7][8] = img7x8;
        ImageViewGameBoard[7][12] = img7x12;
        ImageViewGameBoard[7][16] = img7x16;
        ImageViewGameBoard[11][2] = img11x2;
        ImageViewGameBoard[11][6] = img11x6;
        ImageViewGameBoard[11][10] = img11x10;
        ImageViewGameBoard[11][14] = img11x14;
        ImageViewGameBoard[11][18] = img11x18;
        ImageViewGameBoard[15][4] = img15x4;
        ImageViewGameBoard[15][8] = img15x8;
        ImageViewGameBoard[15][12] = img15x12;
        ImageViewGameBoard[15][16] = img15x16;
        ImageViewGameBoard[19][6] = img19x6;
        ImageViewGameBoard[19][10] = img19x10;
        ImageViewGameBoard[19][14] = img19x14;

        ImageTextViewGameBoard[0] = textResource3x6;
        ImageTextViewGameBoard[1] = textResource3x10;
        ImageTextViewGameBoard[2] = textResource3x14;
        ImageTextViewGameBoard[3] = textResource7x4;
        ImageTextViewGameBoard[4] = textResource7x8;
        ImageTextViewGameBoard[5] = textResource7x12;
        ImageTextViewGameBoard[6] = textResource7x16;
        ImageTextViewGameBoard[7] = textResource11x2;
        ImageTextViewGameBoard[8] = textResource11x6;
        ImageTextViewGameBoard[9] = textResource11x10;
        ImageTextViewGameBoard[10] = textResource11x14;
        ImageTextViewGameBoard[11] = textResource11x18;
        ImageTextViewGameBoard[12] = textResource15x4;
        ImageTextViewGameBoard[13] = textResource15x8;
        ImageTextViewGameBoard[14] = textResource15x12;
        ImageTextViewGameBoard[15] = textResource15x16;
        ImageTextViewGameBoard[16] = textResource19x6;
        ImageTextViewGameBoard[17] = textResource19x10;
        ImageTextViewGameBoard[18] = textResource19x14;

        BoardResourcesIni();

    }
    public void BoardResourcesIni() {
        Image image;
        int tilesPlaces = 0;

        refreshResources(playerTurn);

        for(int r = 3; r < NUM_OF_ROWS; r = r + 4){
            for(int c = 2; c < NUM_OF_COLS - 1; c = c + 2){
                try{
                    if(ImageViewGameBoard[r][c] != null && (r != 11 || c != 10)){
                        //get resource
                        resource = getRandomResource();
                        while (resource.getNumTilesInBoard() == 0){
                            resource = getRandomResource();
                        }
                        resource.setNumTilesInBoard(resource.getNumTilesInBoard() - 1);

                        image = new Image("file:C:/Users/ignac/IdeaProjects/Catan/src/main/resources/hr/algebra/catan/Images/" + resource +".png"); // You can also use a URL or an input stream
                        ImageViewGameBoard[r][c].setImage(image);
                        // Generate a random number between 2 and 12 (inclusive)
                        Random random = new Random();
                        int lowerBound = 2;
                        int upperBound = 12;
                        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

                        //System.out.println("Resource: " + resource + " placed in " + r + " " + c);
                        ImageTextViewGameBoard[tilesPlaces].setText(String.valueOf(randomNumber));
                        objectGameBoard[r][c] = new ResourceTile(r,c, resource, randomNumber);
                        tilesPlaces++;
                    }
                }
                catch (Exception ignored) {

                }
            }
        }
        //place dessert
        resource = ResourcesType.DESSERT;
        ImageViewGameBoard[11][10].setImage(null);
        ImageTextViewGameBoard[9].setText(null);
        objectGameBoard[11][10] = new ResourceTile(11,10, resource, -1);
    }
    private static ResourcesType getRandomResource() {
        ResourcesType[] resource = ResourcesType.values();
        Random random = new Random();
        int randomIndex = random.nextInt(resource.length - 1); //dont count the dessert
        return resource[randomIndex];
    }
    public void nextTurn(ActionEvent event) {

        textAreaError.setText("");

        if(hasPlayerWon(playerTurn)){
            textAreaError.setText("player " + playerTurn.getPlayerColor() + " has won!!!!");
        }
        //check end of setup
        if(!setUpDone && bluePlayer.getNumTowns() == 2 && redPlayer.getNumTowns() == 2 && bluePlayer.getNumRoads() == 2 && redPlayer.getNumRoads() == 2){
            textAreaError.setText("The board has been setup properly");
            setUpDone = true;
        }
        else if ( !setUpDone)textAreaError.setText("you must set up the board by placing 2 towns and roads per player");

        //change player

        if(playerTurn == bluePlayer){
            circle0.setFill(redColor);
            circle1.setFill(blueColor);
            playerTurn = redPlayer;
        }
        else if(playerTurn == redPlayer){
            circle0.setFill(blueColor);
            circle1.setFill(redColor);
            playerTurn = bluePlayer;
        }

        //get dice roles
        Random random = new Random();
        dice1 = random.nextInt(6) + 1;
        random = new Random();
        dice2 = random.nextInt(6) + 1;
        diceTotal = dice1 + dice2;

        //display dice roll
        Image image;
        image = new Image("file:C:/Users/ignac/IdeaProjects/Catan/src/main/resources/hr/algebra/catan/Images/" + dice1 +".png");
        imgDice1.setImage(image);
        image = new Image("file:C:/Users/ignac/IdeaProjects/Catan/src/main/resources/hr/algebra/catan/Images/" + dice2 +".png");
        imgDice2.setImage(image);

        //get resources from dice role
        //System.out.println("BLUE: ");
        System.out.println("Dice roll: " + diceTotal);
        for (Town town : bluePlayer.getTownList()) {
            town.getResources(bluePlayer, diceTotal, 1);
        }
        for (Town town : redPlayer.getTownList()) {
            town.getResources(redPlayer, diceTotal, 1);
        }
        refreshResources(playerTurn);
    }
    public void roadButtonPressed(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();

        if (clickedButton.getTextFill() == Color.BLACK) {
            // GET THE POSITION OF THE clickedButton IN THE ARRAY buttonGameBoard
            int row = -1;
            int col = -1;
            for (int i = 1; i < NUM_OF_ROWS; i++) {
                for (int j = 1; j < NUM_OF_COLS; j++) {
                    if (buttonGameBoard[i][j] == clickedButton) {
                        row = i;
                        col = j;
                        break;
                    }
                }
                if (row != -1) {
                    break;
                }
            }
            //FIRST TOWN
            if(!setUpDone && playerTurn.getNumRoads() < 2) {
                if(TownProximityRule(row,col)) {
                    if(isRoadConnectedByTownOrRoad(row,col, playerTurn.getPlayerColor())){
                        placeRoad(row,col,clickedButton);
                    }
                    else{
                        System.out.println("road not connected to town or another road");
                    }
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (setUpDone){
                //COSTS
                if((playerTurn.getNumWood() >= 1 && playerTurn.getNumBrick() >= 1) || CHEATS){
                    //IS THERE A TOWN CONNECTED TO IT?
                    if(isRoadConnectedByTownOrRoad(row,col, playerTurn.getPlayerColor())){
                        playerTurn.setNumWood(playerTurn.getNumWood() - 1);
                        playerTurn.setNumBrick(playerTurn.getNumBrick() - 1);

                        placeRoad(row,col,clickedButton);
                    }
                    else{
                        System.out.println("road not connected to town or another road");
                    }
                }
                else {
                    textAreaError.setText("cant afford the costs");
                }
            }
        }

    }

    private void placeRoad(int row, int col, Button clickedButton) {
        //PLACE ROAD BOTH VISUAL AND LOGIC
        clickedButton.setTextFill(playerTurn.getPlayerColor());

        System.out.println("road placed is in row " + row + " and column " + col);
        new Road(row, col, playerTurn.getPlayerColor());
        playerTurn.setNumRoads(playerTurn.getNumRoads() + 1);
        refreshResources(playerTurn);
    }

    public void townButtonPressed(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        if(clickedButton.getTextFill() == Color.BLACK) {
            // GET THE POSITION OF THE clickedButton IN THE ARRAY buttonGameBoard
            int row = -1;
            int col = -1;
            for (int i = 1; i < NUM_OF_ROWS; i++) {
                for (int j = 1; j < NUM_OF_COLS; j++) {
                    if (buttonGameBoard[i][j] == clickedButton) {
                        row = i;
                        col = j;
                        break;
                    }
                }
                if (row != -1) {
                    break;
                }
            }
            //FIRST TOWN
            if(!setUpDone && playerTurn.getNumTowns() < 2) {
                if(TownProximityRule(row,col)) {
                    placeTown(row, col, clickedButton);
                }
            }
            //NOT FIRST TOWN, MUST BE CONNECTED TO ROAD, FOLLOW ROAD RULES, AND HAVE ENOUGH RESOURCES
            else if (setUpDone){
                //COST
                if((playerTurn.getNumWood() >= 1 && playerTurn.getNumBrick() >= 1 && playerTurn.getNumWheat() >= 1 && playerTurn.getNumSheep() >= 1) || CHEATS) {
                    //IT IS CONNECTED TO A ROAD
                    if (isTownConnectedByThing(row, col, playerTurn.getPlayerColor(), ROAD_EMOJI)) {
                        //MAKE SURE IT IS NOT NEXT TO ANOTHER TOWN
                        if (TownProximityRule(row, col)) {
                            playerTurn.setNumWood(playerTurn.getNumWood() - 1);
                            playerTurn.setNumBrick(playerTurn.getNumBrick() - 1);
                            playerTurn.setNumWheat(playerTurn.getNumWheat() - 1);
                            playerTurn.setNumSheep(playerTurn.getNumSheep() - 1);
                            //PLACE THE TOWN AND ADD IT TO LOGIC
                            placeTown(row, col, clickedButton);
                        } else {
                            System.out.println("you cant place a town next to another");
                        }
                    } else {
                        System.out.println("town not connected by road");
                    }
                }
                else {
                    textAreaError.setText("cant afford the costs of town");
                }
            }
        }
    }

    private boolean TownProximityRule(int row, int col) {
        for(int r = -2; r < 4; r = r + 2){ // -2 0 2
            for(int c = -2; c < 4; c = c + 2){
                try{
                    //System.out.println((row + r) + " " + (col + c));
                    if(buttonGameBoard[row + r][col + c].getText().contains(HOUSE_EMOJI) && !buttonGameBoard[row + r][col + c].getTextFill().equals(blackColor)){
                        return false;
                    }
                }
                catch (Exception e){
                    //System.out.println("house around are not in map");
                }

            }
        }

        return true;
    }

    private void placeTown(int row, int col, Button clickedButton){
        //PLACE TOWN BOTH VISUAL AND LOGIC
        clickedButton.setTextFill(playerTurn.getPlayerColor());

        System.out.println("town placed in row " + row + " and column " + col);
        Town town = new Town(row, col, playerTurn.getPlayerColor());
        playerTurn.setNumPoints(playerTurn.getNumPoints() + 1);
        playerTurn.setNumTowns(playerTurn.getNumTowns() + 1);
        playerTurn.addTownList(town);

        lastTownPlaced = town;
        refreshResources(playerTurn);
    }
    private boolean isRoadConnectedByTownOrRoad(int row, int col, Color playerColor) {
        int yAxis= -1;
        int xAxis= -1;
        while (yAxis < 2){
            while (xAxis < 2){
                try{
                    //THERE IS A TOWN AND IT HAS THE SAME COLOR AS PLAYER TURN
                    if((buttonGameBoard[row + yAxis][col +  xAxis].getText().contains(HOUSE_EMOJI) || buttonGameBoard[row + yAxis][col +  xAxis].getText().contains(ROAD_EMOJI)) && buttonGameBoard[row + yAxis][col +  xAxis].getTextFill().equals(playerColor)){
                        //System.out.println("HOUSE FOUND in row " + (row + yAxis) + " and column " + (col + xAxis));
                        return true;
                    }
                    //TRY TO CONNECT A ROAD TO ANOTHER ROAD
                    else if(buttonGameBoard[row + yAxis][col +  xAxis].getText().contains(HOUSE_EMOJI)){
                        //System.out.println("house around");
                        int yAxis2= -1;
                        int xAxis2= -1;
                        while (yAxis2 < 2){
                            while (xAxis2 < 2){
                                try{
                                    //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                                    //System.out.println((row + yAxis + yAxis2) + " " + (col +  xAxis +  xAxis2));
                                    if(buttonGameBoard[row + yAxis + yAxis2][col +  xAxis +  xAxis2].getText().contains(ROAD_EMOJI) && buttonGameBoard[row + yAxis + yAxis2][col + xAxis + xAxis2].getTextFill().equals(playerColor)){
                                        //System.out.println("connected road found in row " + (row + yAxis + yAxis2) + " and column " + (col +  xAxis + xAxis2));
                                        return true;
                                    }
                                }
                                catch (Exception e){
                                    //System.out.println("no in row " + (row + yAxis2) + " and column " + (col +  xAxis2));
                                }
                                xAxis2++;
                            }
                            yAxis2++;
                            xAxis2 = -1;
                        }
                    }
                }
                catch (Exception e){
                    //System.out.println("no in row " + (row + yAxis) + " and column " + (col +  xAxis));
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }

    private boolean isTownConnectedByThing(int row, int col, Color playerColor, String thing) {
        int yAxis= -1;
        int xAxis= -1;
        while (yAxis < 2){
            while (xAxis < 2){
                try{
                    //THERE IS A ROAD AND IT HAS THE SAME COLOR AS PLAYER TURN
                    if(buttonGameBoard[row + yAxis][col +  xAxis].getText().contains(thing) && buttonGameBoard[row + yAxis][col +  xAxis].getTextFill().equals(playerColor)){
                        //System.out.println("thing FOUND in row " + (row + yAxis) + " and column " + (col + xAxis));
                        return true;
                    }
                }
                catch (Exception e){
                    //System.out.println("no in row " + (row + yAxis) + " and column " + (col +  xAxis));
                }
                xAxis++;
            }
            yAxis++;
            xAxis = -1;
        }
        return false;
    }

    private boolean hasPlayerWon(Player player){
        return (player.getNumPoints() >= POINT_TO_WIN);
    }

    private void refreshResources(Player currentPlayer){
        Player oppositePlayer;
        if(currentPlayer == bluePlayer){
            oppositePlayer = redPlayer;
        }
        else{
            oppositePlayer = bluePlayer;
        }
        //refresh resources text
        textResourceWood0.setText("WOOD: " + currentPlayer.getNumWood());
        textResourceBrick0.setText("BRICK: " + currentPlayer.getNumBrick());
        textResourceWheat0.setText("WHEAT: " + currentPlayer.getNumWheat());
        textResourceSheep0.setText("SHEEP: " + currentPlayer.getNumSheep());
        textResourceStone0.setText("STONE: " + currentPlayer.getNumStone());

        textResourceWood1.setText("WOOD: " + oppositePlayer.getNumWood());
        textResourceBrick1.setText("BRICK: " + oppositePlayer.getNumBrick());
        textResourceWheat1.setText("WHEAT: " + oppositePlayer.getNumWheat());
        textResourceSheep1.setText("SHEEP: " + oppositePlayer.getNumSheep());
        textResourceStone1.setText("STONE: " + oppositePlayer.getNumStone());
    }
}


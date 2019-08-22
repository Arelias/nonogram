
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    //Constants
    Integer WINDOW_WIDTH = 1000;
    Integer WINDOW_HEIGHT = 500;


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        GridPane test = new GridPane();
        Board board = FileController.loadLevel();

        GridPane testBoard = board.drawGrid();
        test.add(testBoard,0,0);



        Scene scene = new Scene(test, WINDOW_WIDTH, WINDOW_HEIGHT, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

//public class BoardGameMain extends Application {
//
//    private Image imageback = new Image("background.jpg");
//    //private Optional<Pawn> selectedPawn = Optional.empty();
//    private Pawn selectedPawn = null;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//
//    //Create splitpane
//    //top part for data shit
//    //bottom part for game shit
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        BackgroundSize backgroundSize = new BackgroundSize(imageback.getWidth(), imageback.getHeight(), true, true, true, false);
//        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
//        Background background = new Background(backgroundImage);
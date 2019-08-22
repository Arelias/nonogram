import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.lang.reflect.Array;

public class Board {

    GridPane boardPane = new GridPane();

    Cell[][] cells;


    public Board(Cell[][] cells){
        this.cells = cells;

    }

    //Use prototype


    public GridPane drawGrid() {

        GridPane gridPane = new GridPane();
        gridPane.getChildren().clear();

        int imageSize = 300/cells.length;
        Image safe = new Image("SquareImageCovered.png", imageSize, imageSize, true, false);
        Image unsafe = new Image("SquareImageUnCovered.png", imageSize, imageSize, true, false);

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {


                ImageView nodeImage;
                if (cells[i][j].isSafe()) {
                    nodeImage = new ImageView(safe);
                } else {
                    nodeImage = new ImageView(unsafe);
                }
                gridPane.add(nodeImage, j, i);
            }

        }

        return gridPane;
    }



}

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.DataFormatException;

public class FileController {

    public void saveGame() {

        String output = "";
        output += "Player turn: " + System.getProperty("line.separator");
        output += "Something" + System.getProperty("line.separator");
        output += "Black score: " + System.getProperty("line.separator");
        output += "Something" + System.getProperty("line.separator");
        output += "White score: " + System.getProperty("line.separator");
        output += "Something" + System.getProperty("line.separator");
        output += "Checkerboard state: " + System.getProperty("line.separator");
//        for (Pawn[] pawnRow : board.getPawnArray()) {
//            for (Pawn pawn : pawnRow) {
//                if (pawn.isKing()) {
//                    output += (pawn.isType() + 3);
//                } else {
//                    output += pawn.isType();
//                }
//            }
//            output += System.getProperty("line.separator");
//        }
//        try {
//            PrintWriter out = new PrintWriter("gameSave.txt");
//            out.write(output);
//            out.close();
//        } catch (Exception e) {
//            System.out.println("File not saved " + e);
//        }
    }

    public static Board loadLevel(){
        try {

            String[] gameFile;
            Charset charset = Charset.forName("UTF-8");
            gameFile = Files.readAllLines(Paths.get("Example.txt"), charset).toArray(new String[0]);

            int width = Integer.parseInt(gameFile[1]);
            int height = Integer.parseInt(gameFile[3]);
            Cell[][] cells = new Cell[height][width];
            for (int i = 0; i < height; i++){
                char[] data = gameFile[5+i].toCharArray();
                for (int j = 0; j < height; j++){
                        Cell cell = new Cell(data[j] == '#');
                        cells[i][j] = cell;
                }
            }

            return new Board(cells);

        } catch (Exception e) {
            System.out.println("Save file corrupted! " + e);
            return null;
        }


    }
}

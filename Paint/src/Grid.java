import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private static final int cellSize = 30;
    private int width;
    private int height;
    private int cols;
    private int rows;




    public Grid(int width, int height, int cols, int rows) {
        this.width = width;
        this.height = height;
        this.cols = cols;
        this.rows = rows;
    }


    public void init(){


        Rectangle outerRectangle = new Rectangle(10, 10, 600, 600);
        outerRectangle.draw();

        for (int i = 10; i < width; i += cellSize) {
            System.out.println("########################");
            for (int j = 10; j < height; j += cellSize) {
                System.out.println("*****************************");

                Rectangle cell = new Rectangle(i, j, cellSize, cellSize);
                cell.draw();

            }
        }



    }

    //cellSize.setColor(Color.BLUE); // Set the desired color
    //        cellSize.fill();
    //int cellSize com uma variavel para w e h
    // i = i + cellSize;


    //for loop
    //dentro de outro for

    //for (int i = 0; i < cellSize.width; i = i + cellSize)
       // for (int j = 0; i < cellSize.height; j = j)




}

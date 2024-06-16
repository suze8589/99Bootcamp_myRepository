import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Grid {

    private static final int cellSize = 30;
    private int width;
    private int height;
    private int cols;
    private int rows;
    private boolean painted;

    //private boolean[][] isPainted;
    //private Rectangle[][] cells;




    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cols = cols * cellSize; //This multiplication calculates the total width;
        this.rows = rows * cellSize; //This multiplication calculates the total height;
        this.painted = true;
        //this.cells = new Rectangle[cols][rows];
        //this.isPainted = false;
    }


    public void init(){


        Rectangle outerRectangle = new Rectangle(10, 10, width, height);
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

    /*public void paintCell(int col, int row) {
        if (!cells[col][row].isFilled()) {
            System.out.println("Help me!!!!");
            cells[col][row].setColor(Color.MAGENTA);
            cells[col][row].fill();
        }
    }

    public void eraseCell(int col, int row) {
        if (cells[col][row].isFilled()) {
            System.out.println("this is happening");
            cells[col][row].draw();
        }
    }

    public void isPainted(int col, int row) {
        if (cells[col][row].isFilled()) {
            eraseCell(col, row);
        } else {
            paintCell(col, row);
        }
    }*/



    public int getCellSize(){
        return cellSize;
    }

    public int getWidth(){ //This method returns the total width of the grid.
        return width;
    }

    public int getHeight(){ //This method returns the total height of the grid.
        return height;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }


//cellSize.setColor(Color.BLUE); // Set the desired color
    //        cellSize.fill();
    //int cellSize com uma variable para w e h
    // i = i + cellSize;


    //for loop
    //inside another for loop

    //for (int i = 0; i < cellSize.width; i = i + cellSize)
       // for (int j = 0; i < cellSize.height; j = j)




}

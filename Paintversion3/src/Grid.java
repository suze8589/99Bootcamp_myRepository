import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Grid {

    private static final int cellSize = 30;
    private int width;
    private int height;
    private int cols;
    private int rows;
    private CellPaint[][] cellPaints;
    private Rectangle[][] cells;
    //private boolean painted;
   // private Rectangle[][] cells;

    private enum CellPaint{
        ERASED,
        PAINTED
    }


    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cols = cols * cellSize;// This multiplication calculates the total width;
        this.rows = rows * cellSize;// This multiplication calculates the total height;
        this.cellPaints = new CellPaint[cols][rows];
        this.cells = new Rectangle[cols][rows];
        //this.cells = new Rectangle[cols][rows];
        //this.painted = false;
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

    public void paint(int cols, int rows){
        switch (cellPaints[cols][rows]){
            case ERASED:
                paintCell(cols,rows);
                break;
            case PAINTED:
                eraseCell(cols,rows);
                break;
        }
    }

    public void paintCell(int cols, int rows){
        cells[cols][rows].setColor(Color.BLACK);
        cells[cols][rows].fill();
        cellPaints[cols][rows] = CellPaint.PAINTED;
    }

    public void eraseCell(int cols, int rows){
        cells[cols][rows].setColor(Color.WHITE);
        cells[cols][rows].fill();
        cellPaints[cols][rows] = CellPaint.ERASED;
    }



    /*public void paintCell(int col, int row) {
        if (!cells[col][row].isFilled()) {
            cells[col][row].setColor(Color.MAGENTA);
            cells[col][row].fill();
        }
    }

    public void eraseCell(int col, int row) {
        if (cells[col][row].isFilled()) {
            cells[col][row].draw();
        }
    }

    public void toggleCell(int col, int row) {
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
    //int cellSize com uma variavel para w e h
    // i = i + cellSize;


    //for loop
    //dentro de outro for

    //for (int i = 0; i < cellSize.width; i = i + cellSize)
       // for (int j = 0; i < cellSize.height; j = j)




}

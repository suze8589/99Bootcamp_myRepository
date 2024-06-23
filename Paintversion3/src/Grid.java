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


    private enum CellPaint{
        ERASED,
        PAINTED
    }


    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cols = width / cellSize;// This multiplication calculates the total width;
        this.rows = height / cellSize;// This multiplication calculates the total height;
        this.cellPaints = new CellPaint[cols][rows];
        this.cells = new Rectangle[cols][rows];

    }


    public void init(){


        Rectangle outerRectangle = new Rectangle(10, 10, width, height);
        outerRectangle.draw();

        for (int i = 10; i < width; i += cellSize) {
            System.out.println("########################");
            for (int j = 10; j < height; j += cellSize) {
                System.out.println("*****************************");

                Rectangle cell = new Rectangle(i, j, cellSize, cellSize);
                //Rectangle cell = new Rectangle(10 + i * cellSize, 10 + j * cellSize, cellSize, cellSize);
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





}

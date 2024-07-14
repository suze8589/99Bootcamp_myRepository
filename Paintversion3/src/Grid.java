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
        ERASE,
        PAINT
    }


    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cols = width / cellSize;
        this.rows = height / cellSize;
        this.cellPaints = new CellPaint[cols][rows];
        this.cells = new Rectangle[cols][rows];
        //this.cells = new Rectangle[cols][rows];
        //this.painted = false;
    }


    public void init(){


        Rectangle outerRectangle = new Rectangle(10, 10, width, height);
        outerRectangle.draw();

        for (int col = 0; col < cols; col++) {
            System.out.println("This is my grid my created!!");
            for (int row = 0; row < rows; row++) {
                int x = 10 + col * cellSize;
                int y = 10 + row * cellSize;
                System.out.println("WOWOWOWOOWOWOWOOWOWOOW");

                cells[col][row] = new Rectangle(x, y, cellSize, cellSize);
                cells[col][row].draw();//instanciar e guardar numa array list, talvez
                cellPaints[col][row] = CellPaint.PAINT;
                //comparar o x e o y da cellsize da grid com o curso

            }
        }
    }

    public void paint(int col, int row){
        if(col >= 0 && col < cols && row >= 0 && row < rows) {
            switch (cellPaints[col][row]) {
                case PAINT:
                    paintCell(col, row);
                    break;
                case ERASE:
                    eraseCell(col, row);
                    break;
            }
        }
    }

    public void paintCell(int col, int row){
        System.out.println("PAINT IT BLACK! PAINT IT BLACK! PAINT IT BLACK");
        cells[col][row].setColor(Color.BLACK);
        cells[col][row].fill();
        cellPaints[col][row] = CellPaint.PAINT;
    }

    public void eraseCell(int col, int row){
        System.out.println("I'm a painting WHITE!WHITE!WHITE!WHITE!");
        cells[col][row].setColor(Color.WHITE);
        cells[col][row].fill();
        cellPaints[col][row] = CellPaint.ERASE;
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

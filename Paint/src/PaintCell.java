import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PaintCell {
    private Rectangle cellFilled;
    private int row;
    private int col;

    public PaintCell(Rectangle cellFilled, int row, int col){
        this.cellFilled = cellFilled;
        this.row = row;
        this.col = col;
    }


    public void fill(Color color){
        cellFilled.setColor(Color.MAGENTA);
        cellFilled.fill();
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}



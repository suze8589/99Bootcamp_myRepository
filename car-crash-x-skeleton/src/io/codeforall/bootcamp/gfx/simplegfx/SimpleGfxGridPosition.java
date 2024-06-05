package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.gfx.lanterna.LanternaGrid;
import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle; // parte visual do carro
    private SimpleGfxGrid simpleGfxGrid; // precisa de grid para definir a posicao

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid){ // construtor que esta a ser usado para o game
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        rectangle = new Rectangle(grid.columnToX(getCol()) + 10,grid.rowToY(getRow()) + 10,10,10);
        simpleGfxGrid = grid;
        rectangle.draw();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        rectangle = new Rectangle(grid.columnToX(col) + 10,grid.rowToY(row) + 10, 10,10);
        simpleGfxGrid = grid;
        rectangle.draw();

        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        rectangle.draw();
        rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) { // movimento do carro para não sair da Grid
        //if
        switch (direction) {

            case UP:
                if (getRow() - distance >= 0){
                   rectangle.translate(0, - simpleGfxGrid.rowToY(distance));
                   
                }
            break;

            case DOWN:
                if (getRow() + distance <= simpleGfxGrid.getRows()-1){
                    rectangle.translate(0,simpleGfxGrid.rowToY(distance));

                }

                break;

            case LEFT:
                  if (getCol() - distance >= 0){
                      rectangle.translate( - simpleGfxGrid.rowToY(distance),0);

                  }
                break;


            case RIGHT:
                if (getCol() + distance <= simpleGfxGrid.getCols()-1){
                    rectangle.translate(simpleGfxGrid.rowToY(distance),0);

                }

                break;
        }

       setPos((rectangle.getX() - simpleGfxGrid.PADDING)/10,(rectangle.getY() - simpleGfxGrid.PADDING)/10);
       //super.moveInDirection(direction, distance);
        //show();
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {// para modar a cor do carro
         super.setColor(color); // modar na Abstrata
        Color color1;


           color1 = SimpleGfxColorMapper.getColor(color); // mudar no retangulo
           rectangle.setColor(color1);
    }
}

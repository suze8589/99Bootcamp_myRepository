package io.codeforall.bootcamp.gfx.simplegfx;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_HARD_LIGHTPeer;
import io.codeforall.bootcamp.gfx.lanterna.LanternaColorMapper;
import io.codeforall.bootcamp.gfx.lanterna.LanternaGridPosition;
import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private static Rectangle rectangle;
    private int cols;
    private int rows;


    private int cellSize = 10;



    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        rectangle = new Rectangle(10, 10, cols*cellSize, rows*cellSize); //  defenir o rectangulo com 10 ou PADDING e converter para pixell
        rectangle.draw(); // desenhar o retangulo




    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return rows;
    }

    /**
     * Obtains the width of the grid in pixels
     *
     * @return the width of the grid
     */
    public int getWidth() {
        return rectangle.getWidth();
    }

    /**
     * Obtains the height of the grid in pixels
     *
     * @return the height of the grid
     */
    public int getHeight() {
        return rectangle.getHeight();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     *
     * @return the x position of the grid
     */
    public int getX() {
        return rectangle.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {
        return rectangle.getY();
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */
    public int getCellSize() {
        return cellSize;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);

    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
      return new SimpleGfxGridPosition(col,row,this) ;
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     *
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        return row * 10;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return column * 10;
    }

    public void hide(SimpleGfxGridPosition simpleGfxGridPosition) {
        rectangle.delete();


    }

    public void show(SimpleGfxGridPosition simpleGfxGridPosition) {
        rectangle.fill();
    }
}

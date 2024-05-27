package io.codeforall.bootcamp.field;

import io.codeforall.bootcamp.cars.Car;

public class Position {

    private int row;
    private int col;


    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}

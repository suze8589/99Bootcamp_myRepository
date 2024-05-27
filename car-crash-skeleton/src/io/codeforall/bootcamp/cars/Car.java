package io.codeforall.bootcamp.cars;
import io.codeforall.bootcamp.field.Position;


abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;
    private int color;
    private String name;

    private int moveCar;
    private int speed;


    public Car(Position pos,String name, int color, int moveCar, int speed) {
        this.pos = pos;
        this.name = name;
        this.color = color;
        this.moveCar = moveCar;
        this.speed = speed;

    }



    //criar metodo com os mesmos nomes que estão no field
    //método para por os carros a mudar de posição

    public Position getPos() {

        return pos;
    }

    public int getColor() {
        return color;
    }

    public String getName(){
        return name;
    }

    public int getMoveCar(){
        return moveCar;
    }

    public int getSpeed(){
        return speed;
    }





    public boolean isCrashed() {
        return false;
    }

    private void moveCar(){

        for( int i = 0; i < pos.getRow(); i++){
            for( int j = 0; j < pos.getCol(); j++){
                moveCar();
            }
        }

    }







    @Override
    public String toString(){
        return name;

    }


}

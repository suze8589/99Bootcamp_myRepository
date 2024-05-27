package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;


import java.awt.*;

import static io.codeforall.bootcamp.cars.CarType.FIAT;
import static io.codeforall.bootcamp.cars.CarType.MUSTANG;

public class CarFactory {


    // vai fazer carros
    public static  Car getNewCar() {
        int maxRow = 100;
        int maxCol = 25;
        int min = 0;

        int randomRow = (int) (Math.random()* maxRow - min);
        int randomCol = (int) (Math.random()* maxCol - min);
        Position position = new Position(randomRow,randomCol);


        CarType [] cars = CarType.values();

        CarType carType = cars[((int) (Math.random() * 2))];

        Position p1 = new Position(position.getCol(), position.getRow()); //this is hard code
        Position p2 = new Position(position.getCol(), position.getRow()); //this is hard code
        Color color = new Color(250);

        switch (carType){
            case FIAT:
                System.out.println("Fiat created!!");
                return new Fiat(p1, 250);
            case MUSTANG:
                System.out.println("Mustang created!!");
                return new Mustang(p2, 150);
            default:
                System.out.println("Default CAR!");
               return new Mustang(p2, 150);


        }

    }

}

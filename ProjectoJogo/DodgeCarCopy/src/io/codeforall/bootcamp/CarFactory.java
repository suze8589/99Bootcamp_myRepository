package io.codeforall.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CarFactory {


    public static Car getNewCar(Picture picture){
        Car car = new Car(picture);
        return car;
    }


}

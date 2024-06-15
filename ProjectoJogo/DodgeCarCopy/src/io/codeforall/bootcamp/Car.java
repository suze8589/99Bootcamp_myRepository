package io.codeforall.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.plaf.metal.MetalIconFactory;

public class Car {


    private Picture picture;

    private int speed = -10;

    private Rectangle carRectangle;

    private final int y1 = 65;

    private final int y2 = 115;

    private int previousY = -1;

    public Car(Picture picture){
        //y=65 ou y=115
        this.picture = picture;
        int chosenY;
        if(previousY == -1){
            chosenY = (int) Math.round(Math.random());
        } else {
            if (previousY == 0)
                chosenY = 1;
            else
                chosenY = 0;
        }
        previousY = chosenY;

        if(chosenY == 0) {
            //carRectangle = new Rectangle(450, y1, 80, 40);
            picture = new Picture(450,y1,"resources/images/blue race car copy.png");
        }
        else {
            picture = new Picture(450, y2, "resources/images/blue race car copy.png" );
        }

    }



    public void fill(){
        //carRectangle.fill();
        picture.draw();
    }

    public void move(){
        //carRectangle.translate(speed, 0);
        picture.translate(speed, 0);
    }

    public Picture getCarRectangle(){
        return picture;
    }


}

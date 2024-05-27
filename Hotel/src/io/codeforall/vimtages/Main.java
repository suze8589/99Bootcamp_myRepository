package io.codeforall.vimtages;

public class Main {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(10,"Sheesh_");
        Person person1 = new Person("Susana", hotel1);

        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelCheckOut();
       /* person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation();
        person1.hotelVacation(); */

    }
}

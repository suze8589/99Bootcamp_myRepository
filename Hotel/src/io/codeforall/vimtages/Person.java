package io.codeforall.vimtages;

public class Person {

    private String name;

    private Hotel hotel;

    private int quarto = 0;

    public Person (String name, Hotel hotel){
        this.name = name;
        this.hotel= hotel;
    }

    public String getName(String name){
        return name;
    }

    public void hotelVacation (){
        System.out.println("Hello " + name);
        quarto = hotel.checkIn(quarto);

    }

    public void hotelCheckOut (){
        System.out.println("I had such a good vacation!! Time to checkout, I have a feeling my cat is dead without me.");
        hotel.checkOut();
    }




}

package io.codeforall.vimtages;

public class Hotel {
    private int nrRoom;
    private Room[] arrayRooms;
    private String name;
    //100 nrRoom
    //array

    public Hotel(int nrRoom, String name) {
        this.name = name;
        this.nrRoom = nrRoom;
        this.arrayRooms = new Room[nrRoom];

        for (int i = 0; i < arrayRooms.length; i++) {
            arrayRooms[i] = new Room();
            //System.out.println(arrayRooms[i].getRoomAvailability());
        }
    }

    public int checkIn(int quarto) {
        //quantos quartos há e os q estao disponiveis
        if (quarto != 0) {
            System.out.println("Hey you have already checked in!!");
            return quarto;
        }

        for (int i = 0; i < arrayRooms.length; i++) {

            if (arrayRooms[i].getRoomAvailability() == false) {
                continue;
            }

            System.out.println("There's a room available : Room " + (i + 1) + ".");
            System.out.println("Have a nice stay at our humble Hotel " + name);
            arrayRooms[i].setRoomAvailability(false);
            return i + 1;

        }
        System.out.println("Sorry, there are no rooms available");
        return 0;

    }

    public void checkOut() {

        for (int i = 0; i < arrayRooms.length; i++) {

            if (arrayRooms[i].getRoomAvailability() == true) {
                continue;
            }
            System.out.println("Get out!");
            arrayRooms[i].setRoomAvailability(true);
            break;

        }

    }

}

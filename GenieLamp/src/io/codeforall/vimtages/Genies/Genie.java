package io.codeforall.vimtages.Genies;

public class Genie {

    private int nrWishes;

    private int wishesGranted;

    public Genie (int nrWishes, int wishesGranted){
        this.nrWishes = nrWishes;
        this.wishesGranted = wishesGranted;

    }
    public int getNrWishes() {
        return nrWishes;
    }

    public int getWishesGranted(){
        return wishesGranted++;
    }

    public void grantingWishes(){
        while (getWishesGranted()<getNrWishes()) {
            System.out.println("Your wish as been granted!");
        }
        System.out.println("All your wishes have been granted bye");
    }




}

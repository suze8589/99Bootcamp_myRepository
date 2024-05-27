package io.codeforall.vimtages;

import io.codeforall.vimtages.Genies.FriendlyGenie;
import io.codeforall.vimtages.Genies.Genie;
import io.codeforall.vimtages.Genies.GrumpyGenie;
import io.codeforall.vimtages.Genies.RecycledDemon;

import javax.print.DocFlavor;

public class Main {

    public static void main(String [] args){

        Genie genie = new Genie(3,0);
        FriendlyGenie friendlyGenie = new FriendlyGenie(genie.getNrWishes(), genie.getWishesGranted());
        GrumpyGenie grumpyGenie = new GrumpyGenie(genie.getNrWishes(), genie.getWishesGranted());
        RecycledDemon recycledDemon = new RecycledDemon(genie.getNrWishes(), genie.getWishesGranted());

        MagicLamp magicLamp = new MagicLamp(4,genie,0);

        //friendlyGenie.grantingWishes();
        //grumpyGenie.grantingWishes();
       // recycledDemon.grantingWishes();
        magicLamp.genieTypeGenerator();
    }
}

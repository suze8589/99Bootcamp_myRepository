package io.codeforall.vimtages;

import io.codeforall.vimtages.Genies.Genie;

public class MagicLamp {

    private int nrGenies;

    private boolean rubbed;

    private int geniesSummoned;
    private Genie genie;

    private int genieType;

    public MagicLamp(int nrGenies,Genie genie, int geniesSummoned){
       this.nrGenies = nrGenies;
       this.genie = genie;
       this.geniesSummoned = geniesSummoned;
    }

    public int getNrGenies(){
        return nrGenies;
    }
    public int getGeniesSummoned(){
        return geniesSummoned++;
    }

    public int getGenieType(){
        return (int) Math.floor(Math.random()*2)+1;
    }

   public void genieTypeGenerator(){

        int randomGenie = getGenieType();

        while(getGeniesSummoned() < getNrGenies())



        if(randomGenie%2 == 0) {

                System.out.println("A Friendly Genie as appeared!");
            }

        if(randomGenie%2 == 1) {

                System.out.println("A Grumpy Genie as appeared!");

            }

            randomGenie = getGenieType();

    }
}

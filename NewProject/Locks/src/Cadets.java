public class Cadets implements Runnable{

    private String name;
    private Bathroom bathroom;

    public Cadets(String name, Bathroom bathroom){
        this.name = name;
        this.bathroom = bathroom;
    }
    @Override
    public void run(){

        Thread.currentThread().setName(name);//give a specific name to a thread
        bathroom.enterBathroom();

    }


}

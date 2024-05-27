public class Main {
    public static void main(String[] args) {

        Pets cat = new Pets();
        cat.color = "Black and White";
        cat.species = "Cat";
        cat.year = "2022";
        cat.name = "Isis";
        cat.state = "sleeping";

        Pets bird1 = new Pets();
        bird1.color = "Blue";
        bird1.species = "Budgie";
        bird1.year = "2013";
        bird1.name = "Kika";
        bird1.state = "flying";

        Pets bird2 = new Pets();
        bird2.color = "Gray";
        bird2.species = "Budgie";
        bird2.year = "2021";
        bird2.name = "Cookie";
        bird2.state = "flying";


        //System.out.println("The color of my pets are " + cat.name + ": " +  cat.color + ", " + bird1.name + ": " + bird1.color +  ", " + bird2.name + ": "+ bird2.color);

        System.out.println("The cat is " + cat.state + " the bird is " + bird2.state + " Susana says oh no... ");


        cat.setState("running");
        System.out.println(bird1.name + " still alive " + bird2.name + " dead");


        bird1.subtract();

    }
}
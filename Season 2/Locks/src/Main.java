public class Main {

    public static void main(String[] args) {

        Toilet toilet = new Toilet();
        Bathroom bathroom = new Bathroom(toilet);

        Thread andreia = new Thread(new Cadets("Andreia",bathroom));
        Thread margarida = new Thread(new Cadets("Margarida",bathroom));
        Thread mendanha = new Thread(new Cadets("Mendanha",bathroom));
        Thread mariana = new Thread(new Cadets("Mariana",bathroom));

        andreia.start();
        margarida.start();
        mendanha.start();
        mariana.start();


        System.out.println("Naughty MCs!");
    }
}
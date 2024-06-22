public class TrabalhadorDasCaldas implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 19; i++){
            System.out.println("TRABALHADOR DAS CALDAS: Aqui a fazer uma loiça.");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("TRABALHO DAS CALDAS: Estava aqui em greve.");
                e.printStackTrace();
            }
        }
        System.out.println("TRABALHADOR DAS CALDAS: Caralho para o gerente ele não faz nada! Vou embora! Adeus!");
    }
}
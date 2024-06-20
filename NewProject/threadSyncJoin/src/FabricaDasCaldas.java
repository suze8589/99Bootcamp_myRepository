public class FabricaDasCaldas {
    public static void main(String[] args) {

        try {
            System.out.println("GERENTE: À espera que os trabalhadores acabem!");

            Thread trabalhador = new Thread(new TrabalhadorDasCaldas());
            trabalhador.start();//invoca o método run que foi implementado pelo runnable

            trabalhador.join();//no fundo é um método bloqueante

            System.out.println("GERENTE: Mentira!!!");
        } catch (InterruptedException e) {
            System.out.println("GERENTE: Socorro!!");
            e.printStackTrace();
        }
    }
}

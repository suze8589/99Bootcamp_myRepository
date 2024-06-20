public class Bathroom {

    private Toilet toilet;

    public Bathroom(Toilet toilet){
        this.toilet = toilet;
    }

    public void enterBathroom(){
        synchronized (toilet) {
            System.out.println(Thread.currentThread().getName() + " enters bathroom");
            toilet.useToilet();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " exits toilet");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " is washing their hands.");
        }
    }
}

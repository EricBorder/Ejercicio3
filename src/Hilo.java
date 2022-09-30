public class Hilo extends Thread {

    public Hilo(String str) {
        super(str);
    }

    public void run() {
        Hilo h = new Hilo("Prueba " );
        h.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo " + getName() + i);
        }

    }
}

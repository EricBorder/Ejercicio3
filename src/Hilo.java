public class Hilo extends Thread {
    public static int contadorIni;

    public Hilo(String str) {
        super(str);
        contadorIni++;
    }

    public void run() {
        System.out.println("Hilo " + getName() + " Iniciado");
        if(contadorIni<5){
            new Hilo("Hilo " + contadorIni).start();
            try {
                Hilo.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        /*for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + getName());

        }*/
        System.out.println("Hilo " + getName() + " Finalizado");
    }
}

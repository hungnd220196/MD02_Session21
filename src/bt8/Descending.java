package bt8;

import static bt8.Main.variable;

public class Descending implements Runnable {
    public void run() {
        try {
            while (true) {
                variable--;
                System.out.println("Decreased: " + variable);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
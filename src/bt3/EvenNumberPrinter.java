package bt3;

public class EvenNumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Chẵn: " + i);
            try {
                Thread.sleep(100); // Ngủ 100 milliseconds để tạo ra hiệu ứng chậm lại
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
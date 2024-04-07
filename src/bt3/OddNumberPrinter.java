package bt3;

public class OddNumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Lẻ: " + i);
            try {
                Thread.sleep(100); // Ngủ 100 milliseconds để tạo ra hiệu ứng chậm lại
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
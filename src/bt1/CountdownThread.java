package bt1;

public class CountdownThread extends Thread {
    public void run() {
        try {
            System.out.println("Bắt đầu đếm ngược...");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); // Đợi 1 giây
            }
            System.out.println("Kết thúc!");
        } catch (InterruptedException e) {
            System.out.println("Luồng đã bị gián đoạn.");
        }
    }
}
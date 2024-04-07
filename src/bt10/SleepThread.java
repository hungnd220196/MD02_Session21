package bt10;

import java.util.Scanner;

public class SleepThread extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giây để ngủ: ");
        int seconds = scanner.nextInt();
        scanner.close();

        System.out.println("Thread đang ngủ trong " + seconds + " giây.");
        try {
            Thread.sleep(seconds * 1000); // Chuyển đổi giây thành mili giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread đã thức dậy sau " + seconds + " giây.");
    }
}
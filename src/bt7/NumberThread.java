package bt7;

import java.util.Random;

public class NumberThread extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Tạo số ngẫu nhiên trong khoảng từ 0 đến 99
        System.out.println("Random number: " + randomNumber);

    }
}

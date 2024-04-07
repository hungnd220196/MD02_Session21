package bt11;

class PrimeThread extends Thread {
    public void run() {
        System.out.println("Các số nguyên tố từ 1 đến 10000: ");

        for (int i = 2; i <= 10000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
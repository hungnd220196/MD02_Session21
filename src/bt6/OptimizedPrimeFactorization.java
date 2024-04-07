package bt6;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization is running...");
        int count = 0;
        long number = 2;
        while (count < 10) { // Tìm và thông báo 10 số nguyên tố

            if (isPrime(number)) {
                System.out.println("Tối ưu: Tìm thấy số : " + number);
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; (long) i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}





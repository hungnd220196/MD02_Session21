package bt6;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization is running...");
        int count = 0;
        long number = 2;
        while (count < 10) { // Tìm và thông báo 10 số nguyên tố
            if (isPrime(number)) {
                System.out.println("Chưa tối ưu: Tìm thấy số: " + number);
                count++;
            }
            number++;
        }
    }

    // Kiểm tra số nguyên tố (thuật toán chưa tối ưu)
    private boolean isPrime(long number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}



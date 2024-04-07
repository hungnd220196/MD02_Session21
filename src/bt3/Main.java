package bt3;

public class Main {
    public static void main(String[] args) {
        // Tạo và khởi động thread in các số chẵn
        Thread evenThread = new Thread(new EvenNumberPrinter());
        evenThread.start();

        // Tạo và khởi động thread in các số lẻ
        Thread oddThread = new Thread(new OddNumberPrinter());
        oddThread.start();
    }
}

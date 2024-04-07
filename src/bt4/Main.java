package bt4;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread threadRunable1 = new Thread(numberGenerator);
        Thread threadRunable2 = new Thread(numberGenerator);
        threadRunable1.start();
        threadRunable2.start();
    }
}

package bt8;

public class Main {
    static int variable = 0;

    public static void main(String[] args) {
        Thread increaseThread = new Thread(new Ascending());
        Thread decreaseThread = new Thread(new Descending());

        increaseThread.start();
        decreaseThread.start();
    }
}
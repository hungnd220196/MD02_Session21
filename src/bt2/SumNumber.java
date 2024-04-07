package bt2;

public class SumNumber extends Thread{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <=1000 ; i++) {
            sum+=i;
        }
        System.out.println("tổng các số từ 1 đến 1000 là "+sum);
    }
}

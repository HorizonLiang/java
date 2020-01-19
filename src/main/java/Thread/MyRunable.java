package Thread;


public class MyRunable implements Runnable{
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(x);
        }
    }
}

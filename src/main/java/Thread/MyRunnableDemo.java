package Thread;

public class MyRunnableDemo {
    public static void main(String[] args) {
        // 创建MyRunnable类的对象
        MyRunable my = new MyRunable();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.start();
        t2.start();
    }
}

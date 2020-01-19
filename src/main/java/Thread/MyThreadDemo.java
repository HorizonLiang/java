package Thread;

public class MyThreadDemo {
    public static void main(String[] args) {
        // 创建两个线程对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        my1.start();
        my2.start();
    }
}

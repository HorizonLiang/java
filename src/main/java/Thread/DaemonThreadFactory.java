package Thread;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        return t;
    }
}

package Singleton;

public class Thread1  implements Runnable {
    @Override
    public void run() {
        UniqueClassForMultiThreading instance = UniqueClassForMultiThreading.getInstance();

        synchronized (instance) {
            instance.setValue(10);
            System.out.println("Value: " + instance.getValue());
        }
    }
}

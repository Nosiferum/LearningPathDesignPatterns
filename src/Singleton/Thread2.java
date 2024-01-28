package Singleton;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        UniqueClassForMultiThreading instance = UniqueClassForMultiThreading.getInstance();

        synchronized (instance) {
            instance.setValue(20);
            System.out.println("Value: " + instance.getValue());
        }
    }
}

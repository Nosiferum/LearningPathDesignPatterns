package Singleton;

public class UniqueClassForMultiThreading {
    private static volatile UniqueClassForMultiThreading instance;
    private int value;

    public UniqueClassForMultiThreading() {
    }

    public static UniqueClassForMultiThreading getInstance() {
        //result was created for double-check locking
        UniqueClassForMultiThreading result = instance;

        if (result != null) {
            return result;
        }

        synchronized (UniqueClassForMultiThreading.class) {
            if (instance == null) {
                instance = new UniqueClassForMultiThreading();
            }
            return instance;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

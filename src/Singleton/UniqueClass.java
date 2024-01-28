package Singleton;

public class UniqueClass {
    private static  UniqueClass instance;
    private int value;

    public UniqueClass() {
    }

    public static UniqueClass getInstance() {
        if (instance == null) {
            instance = new UniqueClass();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

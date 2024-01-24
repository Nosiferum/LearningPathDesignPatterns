package Factory;

import java.util.function.Supplier;

public enum CarType {

    BMW(BMW::new),
    MERCEDES(Mercedes::new);

    private final Supplier<Car> constructor;

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return constructor;
    }
}

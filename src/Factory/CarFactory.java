package Factory;

public class CarFactory {

    public static Car getCar(CarType carType) {
        return carType.getConstructor().get();
    }
}

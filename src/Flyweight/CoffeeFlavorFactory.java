package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFlavorFactory {

    private final Map<String, CoffeeFlavor> flavors = new HashMap<>();

    public CoffeeFlavor getCoffeeFlavor(String flavor) {
        return  flavors.computeIfAbsent(flavor, CoffeeFlavor::new);
    }
}

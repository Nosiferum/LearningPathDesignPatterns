package Flyweight;

public class CoffeeOrder {

    private final int tableNumber;
    private final CoffeeFlavor coffeeFlavor;

    public CoffeeOrder(int tableNumber, String flavor, CoffeeFlavorFactory flavorFactory) {
        this.tableNumber = tableNumber;
        this.coffeeFlavor = flavorFactory.getCoffeeFlavor(flavor);
    }

    public void serve() {
        System.out.println("Serving coffee order at table " + tableNumber + " with flavor: " + coffeeFlavor.getFlavor());
    }
}

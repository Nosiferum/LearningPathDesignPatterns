import AbstractFactory.*;
import Bridge.FlyingEnchantment;
import Bridge.Hammer;
import Bridge.SoulEatingEnchantment;
import Bridge.Sword;
import Builder.Item;
import Builder.ItemBuilder;
import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestType;
import Composite.Messenger;
import Factory.Car;
import Factory.CarFactory;
import Factory.CarType;
import Flyweight.CoffeeFlavorFactory;
import Flyweight.CoffeeOrder;
import Prototype.Circle;
import Prototype.Rectangle;
import Singleton.Thread1;
import Singleton.Thread2;
import Singleton.UniqueClass;
import Strategy.*;
import Template.GlassHouse;
import Template.HouseBuilder;
import Template.WoodenHouse;

public class Main {
    public static void main(String[] args) {

        //Strategy Pattern
        System.out.println("Strategy Pattern");
        Fighter fighter = new Fighter(new MeleeStrategy());
        fighter.fight();

        fighter.changeStrategy(new SpellStrategy());
        fighter.fight();

        fighter.changeStrategy(new ArcherStrategy());
        fighter.fight();

        System.out.println();

        fighter.changeStrategy(LambdaStrategy.MeleeStrategy);
        fighter.fight();

        fighter.changeStrategy(LambdaStrategy.SpellStrategy);
        fighter.fight();

        fighter.changeStrategy(LambdaStrategy.ArcherStrategy);
        fighter.fight();

        System.out.println("************");

        //Factory Pattern
        System.out.println("Factory Pattern");
        Car bmw = CarFactory.getCar(CarType.BMW);
        Car mercedes = CarFactory.getCar(CarType.MERCEDES);

        System.out.println(bmw.getDescription());
        System.out.println(mercedes.getDescription());

        System.out.println("************");

        //Abstract Factory Pattern
        System.out.println("Abstract Factory Pattern");
        KingdomFactory humanKingdomFactory = makeFactory(KingdomType.HUMAN);
        createKingdom(humanKingdomFactory);

        KingdomFactory elfKingdomFactory = makeFactory(KingdomType.ELF);
        createKingdom(elfKingdomFactory);

        System.out.println("************");

        //Prototype Pattern
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        Circle anotherCircle = (Circle) circle.clone();
        Rectangle anotherRectangle = (Rectangle)  rectangle.clone();

        System.out.println("Prototype Pattern");
        System.out.println(anotherCircle.color);
        System.out.println(anotherRectangle.color);

        System.out.println("************");

        //Builder Pattern
        Item item = new ItemBuilder()
                .setId(1)
                .setName("Item")
                .setPrice(100)
                .addScore(1530f)
                .addScore(1320f)
                .build();

        System.out.println("Builder Pattern");
        System.out.println("Price: " + item.getPrice());
        System.out.println("Name: " + item.getName());

        System.out.println("************");

        //Flyweight Pattern
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();

        CoffeeOrder order1 = new CoffeeOrder(1, "Cappuccino", flavorFactory);
        CoffeeOrder order2 = new CoffeeOrder(2, "Latte", flavorFactory);
        CoffeeOrder order3 = new CoffeeOrder(3, "Cappuccino", flavorFactory);

        System.out.println("Flyweight Pattern");
        order1.serve();
        order2.serve();
        order3.serve();

        System.out.println("************");

        //Template Pattern
        System.out.println("Template Pattern");
        HouseBuilder houseBuilder = new HouseBuilder(new WoodenHouse());
        houseBuilder.buildHouse();

        System.out.println();

        houseBuilder.changeBuildingMethod(new GlassHouse());
        houseBuilder.buildHouse();

        System.out.println("************");

        //Composite Pattern
        Messenger messenger = new Messenger();

        System.out.println("Composite Pattern");
        messenger.messageFromDogukan().print();
        messenger.messageFromSomeone().print();

        System.out.println("************");

        System.out.println("Bridge Pattern");

        var sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();

        System.out.println();

        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();

        System.out.println("************");

        //Chain Of Responsibility Patten
        ChainOfResponsibility.OrcKing king = new ChainOfResponsibility.OrcKing();

        System.out.println("Chain Of Responsibility Pattern");

        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));

        System.out.println("************");

        //Singleton Pattern
        UniqueClass instance1 = UniqueClass.getInstance();
        UniqueClass instance2 = UniqueClass.getInstance();

        instance1.setValue(10);
        instance2.setValue(20);

        System.out.println("Singleton Pattern");
        System.out.println("Value: " + instance1.getValue());
        System.out.println("Value: " + instance2.getValue());

        //Singleton Pattern With Thread Safe Approach
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }

    public static KingdomFactory makeFactory(KingdomType kingdomType) {
        return switch (kingdomType) {
            case ELF -> new ElfKingdomFactory();
            case ORC -> new OrcKingdomFactory();
            case HUMAN -> new HumanKingdomFactory();
        };
    }

    public static void createKingdom(KingdomFactory kingdomFactory) {
        System.out.println(kingdomFactory.createKing().getDescription());
        System.out.println(kingdomFactory.createArmy().getDescription());
        System.out.println(kingdomFactory.createCastle().getDescription());
    }
}
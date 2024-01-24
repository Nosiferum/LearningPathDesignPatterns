import AbstractFactory.*;
import Factory.Car;
import Factory.CarFactory;
import Factory.CarType;
import Strategy.*;

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

        fighter.changeStrategy(LambdaStrategy.MeleeStrategy);
        fighter.fight();

        fighter.changeStrategy(LambdaStrategy.SpellStrategy);
        fighter.fight();

        fighter.changeStrategy(LambdaStrategy.ArcherStrategy);
        fighter.fight();

        System.out.println();

        //Factory Pattern
        System.out.println("Factory Pattern");
        Car bmw = CarFactory.getCar(CarType.BMW);
        Car mercedes = CarFactory.getCar(CarType.MERCEDES);

        System.out.println(bmw.getDescription());
        System.out.println(mercedes.getDescription());

        System.out.println();

        //Abstract Factory Pattern
        System.out.println("Abstract Factory Pattern");
        KingdomFactory humanKingdomFactory = makeFactory(KingdomType.HUMAN);
        createKingdom(humanKingdomFactory);

        KingdomFactory elfKingdomFactory = makeFactory(KingdomType.ELF);
        createKingdom(elfKingdomFactory);
    }

    public static KingdomFactory makeFactory(KingdomType kingdomType) {
        return switch (kingdomType) {
            case ELF -> new ElfKingdomFactory();
            case ORC -> new OrcKingdomFactory();
            case HUMAN -> new HumanKingdomFactory();
            default -> throw new IllegalArgumentException("KingdomType not supported.");
        };
    }

    public static void createKingdom(KingdomFactory kingdomFactory) {
        System.out.println(kingdomFactory.createKing().getDescription());
        System.out.println(kingdomFactory.createArmy().getDescription());
        System.out.println(kingdomFactory.createCastle().getDescription());
    }
}
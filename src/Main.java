import Strategy.ArcherStrategy;
import Strategy.Fighter;
import Strategy.MeleeStrategy;
import Strategy.SpellStrategy;

public class Main {
    public static void main(String[] args) {

        //Strategy Pattern
        Fighter fighter = new Fighter(new MeleeStrategy());
        fighter.fight();

        fighter.changeStrategy(new SpellStrategy());
        fighter.fight();

        fighter.changeStrategy(new ArcherStrategy());
        fighter.fight();

    }
}
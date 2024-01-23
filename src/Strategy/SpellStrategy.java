package Strategy;

public class SpellStrategy implements FightingStrategy {
    @Override
    public void execute() {
        System.out.println("I am using spells to fight");
    }
}

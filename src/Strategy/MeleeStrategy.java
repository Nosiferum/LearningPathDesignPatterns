package Strategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void execute() {
        System.out.println("I am using melee to fight");
    }
}

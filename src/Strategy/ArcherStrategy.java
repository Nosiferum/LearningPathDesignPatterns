package Strategy;

public class ArcherStrategy implements FightingStrategy {
    @Override
    public void execute() {
        System.out.println("I am using arrows to fight");
    }
}

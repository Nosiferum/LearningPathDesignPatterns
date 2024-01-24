package Strategy;

public enum LambdaStrategy implements FightingStrategy {

    //thia type of behaviour is only valid when the interface is a functional one
    MeleeStrategy(() -> System.out.println("I am using melee to fight")),
    ArcherStrategy(() -> System.out.println("I am using spells to fight")),
    SpellStrategy(() -> System.out.println("I am using arrows to fight"));

    private final FightingStrategy fightingStrategy;

    LambdaStrategy(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
    }

    @Override
    public void execute() {
        fightingStrategy.execute();
    }
}

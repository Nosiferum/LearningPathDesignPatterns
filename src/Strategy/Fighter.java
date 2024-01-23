package Strategy;

public class Fighter {

    private FightingStrategy fightingStrategy;

    public Fighter(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
    }

    public void changeStrategy(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
    }

    public void fight() {
        fightingStrategy.execute();
    }
}

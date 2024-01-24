package AbstractFactory;

public class HumanKingdomFactory implements KingdomFactory {
    @Override
    public Army createArmy() {
        return new HumanArmy();
    }

    @Override
    public Castle createCastle() {
        return new HumanCastle();
    }

    @Override
    public King createKing() {
        return new HumanKing();
    }
}

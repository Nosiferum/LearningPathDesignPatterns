package AbstractFactory;

public interface KingdomFactory {
    Army createArmy();
    Castle createCastle();
    King createKing();
}

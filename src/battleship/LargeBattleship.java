package battleship;

public class LargeBattleship extends Battleship {
    private static int totalLargeBattleships = 1;

    public LargeBattleship() {
        super(3); // Size of 3 for large battleship
    }
    
    public static int getShipsAllowed() {
    	return totalLargeBattleships;
    }
}


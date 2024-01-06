package battleship;

public class SmallBattleship extends Battleship {
    private static int totalSmallBattleships = 3;

    public SmallBattleship() {
        super(1); // Size of 1 for small battleship
    }

    // Add other methods and attributes specific to SmallBattleship
    public static int getShipsAllowed() {
    	return totalSmallBattleships;
    }
}

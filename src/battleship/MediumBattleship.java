package battleship;

public class MediumBattleship extends Battleship {
    private static int totalMediumBattleships = 2;

    public MediumBattleship() {
        super(2); // Size of 2 for medium battleship
    }
    
    public static int getShipsAllowed() {
    	return totalMediumBattleships;
    }
}


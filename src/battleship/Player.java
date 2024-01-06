package battleship;

public class Player {
	
	// Attributes
	private String name;
	private int scores;
	private Board board;
	private int sunkShips;
	
	public Player(String name, Board board) {
		this.name = name;
		this.scores = 0;
		this.board = board;
		this.sunkShips = 0;
	}
	
	// Method to handle a player's turn when they make a guess
	public boolean takeTurn(int row, int column) {
        // Get the square at the specified row and column
		Square hitSquare = this.board.getGrid()[row][column];

	        if (hitSquare.HasShot()) {
	            System.out.println("You already shot at this square.");
	        } else {
	            hitSquare.setHasShot(true);

	            if (hitSquare.HasShip() && hitSquare.getBattleship() != null) {
	                // If the square has a ship, handle the hit
	                Battleship battleship = hitSquare.getBattleship();
	          
	                battleship.reduceHealth();

	                if (battleship.isSunk()) {
	                    // If the battleship is sunk, update the player's status
	                    System.out.println("You sank a battleship!");
	                    sunkShips++;
	    	            scores++;

	                    if (sunkShips == 5) {
	                        System.out.println("Congratulations! You won!");
	                        return true; // Player has won
	                    }
	                } else {
	                    System.out.println("You hit a battleship!");
	                }
	            } else {
	                System.out.println("You missed!");
	            }
	            return this.board.allShipsSunk();

	        }
	        
	        return false;
	    }
	
	
	
	public String getName() {
		return this.name;
	}
	
	public int getScores() {
		return this.scores;
	}
	
	public boolean hitShip(int row, int column) {
        // Placeholder method for handling hit ships, can be extended
		return false;
	}
}

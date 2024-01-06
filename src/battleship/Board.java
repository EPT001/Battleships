package battleship;

import java.util.Random;


public class Board {
	private int rows;
	private int columns;
	private Square[] [] grid;


	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.grid = new Square[rows][columns];
	}
	
	public Square[] [] getGrid() {
		return this.grid;
	}
	
	public void spawnBoard() {
		// Create a new grid and initialize all squares
		grid = new Square[rows][columns];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new Square(i, j);
			}
		}
	}
	
    // Generate small battleships
	public void generateSmallBattleship() {
		Random r = new Random();
		int battleships = 0;
		
		
		while(battleships < SmallBattleship.getShipsAllowed()) {
		int row = r.nextInt(9);
		int column = r.nextInt(9);
		
		// Generate a random orientation (vertical or horizontal)
		boolean horizontal = r.nextBoolean();

		
		if(horizontal && column < 9 && this.grid[row][column].HasShip()==false) {
			
			this.grid[row][column].setHasShip(true);
			
			Battleship battleship = new SmallBattleship();
			
			this.grid[row][column].setBattleship(battleship);
			battleships++;

		}
		else if (!horizontal && column < 9 && this.grid[row][column].HasShip()==false) {
			
			this.grid[row][column].setHasShip(true);
			
			Battleship battleship = new SmallBattleship();
			
			this.grid[row][column].setBattleship(battleship);
			battleships++;
			}
		}
	}
	
	// Generate medium battleships
	public void generateMediumBattleship() {
		Random r = new Random();
		int battleships = 0;
		
		
		while(battleships < MediumBattleship.getShipsAllowed()) {
		int row = r.nextInt(9);
		int column = r.nextInt(9);
		
		// Generate a random orientation (vertical or horizontal)
		boolean horizontal = r.nextBoolean();

		
		if(horizontal && column < 9 && this.grid[row][column].HasShip()==false 
				&& this.grid[row][column+1].HasShip()==false) {
			
			this.grid[row][column].setHasShip(true);
			this.grid[row][column+1].setHasShip(true);
			
			Battleship battleship = new MediumBattleship();
			
			this.grid[row][column].setBattleship(battleship);
			this.grid[row][column+1].setBattleship(battleship);
			battleships++;
		}
		else if (!horizontal && row < 9 && this.grid[row][column].HasShip()==false 
				&& this.grid[row+1][column].HasShip()==false) {
			
			this.grid[row][column].setHasShip(true);
			this.grid[row+1][column].setHasShip(true);
			
			Battleship battleship = new MediumBattleship();
			
			this.grid[row][column].setBattleship(battleship);
			this.grid[row+1][column].setBattleship(battleship);
			battleships++;
			}
		}
	}
	
	// Generate big battleships
	public void generateLargeBattleship() {
		Random r = new Random();
		int battleships = 0;
		
		
		while(battleships < LargeBattleship.getShipsAllowed()) {
		int row = r.nextInt(9);
		int column = r.nextInt(9);
		
		// Generate a random orientation (vertical or horizontal)
		boolean horizontal = r.nextBoolean();

		
		if(horizontal && column < 7 && this.grid[row][column].HasShip()==false 
				&& this.grid[row][column+1].HasShip()==false 
				&& this.grid[row][column+2].HasShip()==false) {
			
			this.grid[row][column].setHasShip(true);
			this.grid[row][column+1].setHasShip(true);
			this.grid[row][column+2].setHasShip(true);
			
			
			Battleship battleship = new LargeBattleship();
			this.grid[row][column].setBattleship(battleship);
			this.grid[row][column+1].setBattleship(battleship);
			this.grid[row][column+2].setBattleship(battleship);
			battleships++;

		}
		else if (!horizontal && row < 7 && this.grid[row][column].HasShip()==false 
				&& this.grid[row+1][column].HasShip()==false 
				&& this.grid[row+2][column].HasShip()==false) {
			
			this.grid[row][column].setHasShip(true);
			this.grid[row+1][column].setHasShip(true);
			this.grid[row+2][column].setHasShip(true);
			
			Battleship battleship = new LargeBattleship();
			
			this.grid[row][column].setBattleship(battleship);
			this.grid[row+1][column].setBattleship(battleship);
			this.grid[row+2][column].setBattleship(battleship);
			battleships++;
			}
		}
	}	

    // Check if all ships are sunk
	public boolean allShipsSunk() {
		for (int i = 0; i<10; i++) {
			for (int j = 0; j<10; j++) {
				Battleship battleship = this.grid[i][j].getBattleship();
				if(this.grid[i][j].HasShip() && !battleship.isSunk()) {
					return false;
					
				}
			}
		}
		return true;
		
	}

	@Override
	public String toString() {
        // Build and return a string representation of the board
		StringBuilder output = new StringBuilder();
		
		output.append("    0  1  2  3  4  5  6  7  8  9\n");
		
        for (int y = 0; y < rows; y++) {
            // Add row number
            output.append(y).append(" ");

            for (int x = 0; x < columns; x++) {
                output.append(grid[x][y].toString());
            }

            output.append("\n");
        }

        return output.toString();
	}
	
	//For printing the location of the battleships on the board - A cheat code
//	public void getBattleshipLoc() {
//		for (int i = 0; i<10; i++) {
//			for (int j = 0; j<10; j++) {
//				if(this.grid[i][j].HasShip()) {
//					System.out.println(this.grid[i][j].getBattleship().toString() + (i) + "," + (j));
//					}
//				}
//			}
//		}
	}


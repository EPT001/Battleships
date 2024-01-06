package battleship;

public class Battleship {
	
	private boolean isSunk;;
	private int health;
	private int size;
	
	
    // Constructor to initialize the Battleship
	public Battleship(int size) {
		this.isSunk = false;
		this.health = size;
		this.size = size;
	}
	
	
    // Reduce the health of the battleship when it's hit
	public void reduceHealth() {
		if (!isSunk) {
			health--;
		 if (health == 0) {
				isSunk = true;
				}
		 }
		
	}

    // Check if the battleship is sunk
	public boolean isSunk() {
		return isSunk;
	}

    // Get the size of the battleship
	public int getSize() {
		return size;
	}

    // Set the status of the battleship (sunk or not)
	public void setSunk(boolean isSunk) {
		this.isSunk = isSunk;
	}
	
	
	@Override 
	public String toString() {
		return("Battleship: ");
	}	
}



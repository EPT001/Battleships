package battleship;

public class Square {
	
	//Attributes for the cell
	private int rowPosition;
	private int columnPosition;
	private boolean hasShip;
	private boolean hasShot;
	Battleship battleship;
	
    // Constructor to initialize a square with its row and column position
	public Square (int rowPosition, int columnPosition) {
		this.rowPosition = rowPosition;
		this.columnPosition = columnPosition;
	}

	public int getRowPosition() {
		return rowPosition;
	}

	public void setRowPosition(int rowPosition) {
		this.rowPosition = rowPosition;
	}

	public int getColumnPosition() {
		return columnPosition;
	}

	public void setColumnPosition(int columnPosition) {
		this.columnPosition = columnPosition;
	}

	public boolean HasShip() {
		return hasShip;
	}

	public void setHasShip(boolean hasShip) {
		this.hasShip = hasShip;
	}

	public boolean HasShot() {
		return hasShot;
	}

	public void setHasShot(boolean hasShot) {
		this.hasShot = hasShot;
	}

	public Battleship getBattleship() {
		return battleship;
	}

	public void setBattleship(Battleship battleship) {
		this.battleship = battleship;
	}
	
	@Override
	public String toString() {
		if (HasShot()) {
	        return String.format("%3s", HasShip() ? "X" : "O");
	    }
	    return String.format("%3s", "-");
	}
	
}


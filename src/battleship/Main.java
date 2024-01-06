package battleship;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		// Create and initialize the game board
		Board board = new Board(10, 10);
        board.spawnBoard(); // Initialize the board grid
        System.out.println(board.toString()); // Display the initial state of the board
        board.generateSmallBattleship(); // Generate battleships on the board
        board.generateMediumBattleship();
        board.generateLargeBattleship();
        
        // Get player names
        System.out.println("Enter Player 1 name: ");        
        String nameOne = scanner.nextLine();
        
        System.out.println("Enter Player 2 name: ");
        String nameTwo = scanner.nextLine();

        // Create players and initialize the current player
        Player playerOne = new Player(nameOne,board);
        Player playerTwo = new Player(nameTwo, board);
        
        Player currentPlayer = playerOne; 
        
        // Display the initial locations of battleships on the board
       // board.getBattleshipLoc();

        // Game Loop
        while (true) {
        	System.out.println(board);
        	
        	// Player's Turn
        	System.out.println(currentPlayer.getName() + "'s Turn: ");
            System.out.println("TIME TO GUESS:");
            System.out.print("ENTER X:");
            int X = scanner.nextInt();
            System.out.print("ENTER Y:");
            int Y = scanner.nextInt();
            
            // Check if the shot has hit a battleship
            boolean isSunk = currentPlayer.takeTurn(Y, X);
            
            System.out.println(currentPlayer.getName() + "'s Score: " + currentPlayer.getScores());
            
            // Check if the game is over
            if(isSunk) { 	
            	int playerOneScore = playerOne.getScores();
                int playerTwoScore = playerTwo.getScores();
                
                if (playerOneScore > playerTwoScore) {
                    System.out.println("Final Score: " + playerOneScore + " - " + playerTwoScore);
                    System.out.println(playerOne.getName() + " won!");
                } else if (playerTwoScore > playerOneScore) {
                    System.out.println("Final Score: " + playerOneScore + " - " + playerTwoScore);
                    System.out.println(playerTwo.getName() + " won!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            }
            

        
            // Switch to the other Player's turn
            if (currentPlayer == playerOne) {
            	currentPlayer = playerTwo;
            } else if (currentPlayer == playerTwo) {
            	currentPlayer = playerOne;
            }
        }
        
        // Close the scanner
        scanner.close();
        
    	System.out.println(board);
        }
	}


  BATTLESHIP GAME
                                                        
This repository contains a simple implementation of the classic Battleship game in Java. The game is played in the console and involves two players taking turns to guess the location of the opponent's battleships on a 10x10 grid.

How to Play

Setting up the Board:

The game starts by creating a 10x10 game board with battleships of different sizes.
Battleships are randomly placed on the board with various orientations (horizontal or vertical).
Player Turns:

Players take turns guessing the coordinates to target an opponent's battleship.
If a player hits a battleship, they get another turn.
The goal is to sink all of the opponent's battleships.
![image](https://github.com/EPT001/Battleships/assets/155842366/fddf095f-d537-48f1-8563-6e4c7717e2bf)


Winning the Game:

The game ends when all battleships of either player are sunk.
The player who sinks all opponent's battleships first wins.

Classes and Structure

Battleship: Represents a battleship with attributes like size, health, and sunk status.
Board: Manages the game board, including the placement of battleships and tracking hits.
Player: Represents a player with a name, score, and ability to take turns and make guesses.
Square: Represents a cell on the game board, storing information about its state and any associated battleship.

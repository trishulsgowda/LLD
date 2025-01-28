package com.snakeandladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

	Board board;
	Dice dice;
	Deque<Player> players = new LinkedList<Player>();
	Player winner = null;
	
	public void initializeGame(){
		this.board = new Board(8, 3, 3);
		this.dice = new Dice(1);
		
		Player player1 = new Player(1, 0);
		Player player2 = new Player(2, 0);
		
		players.add(player1);
		players.add(player2);
		this.winner =null;
	}
	
	public void startGame(){
		
		while(winner == null){
			// Find the nextPlayer to play
			Player player = findPlayerTurn();
			
			int diceScore = this.dice.rollDice();
			
			int playerNewPosition = player.getCurrentPosition() + diceScore;
			playerNewPosition = checkJumps(playerNewPosition);
			
			if(playerNewPosition > board.boardSize * board.boardSize -1){
				winner = player;
			}
		}
		
	}

	private int checkJumps(int playerNewPosition) {
		Cell currentCell = this.board.getCell(playerNewPosition);
		
		if(currentCell.jump != null){
			return currentCell.jump.end;
		}
		return playerNewPosition;
	}

	private Player findPlayerTurn() {
		Player p = this.players.removeFirst();
		this.players.addLast(p);
		return p;
	}
}

package com.snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
	
	int boardSize;
	int noOfSnakes;
	int noOfLadders;
	Cell[][] cells;
	
	public Board(int boardSize, int noOfSnakes, int noOfLadders) {
		this.boardSize = boardSize;
		this.noOfSnakes = noOfSnakes;
		this.noOfLadders = noOfLadders;
		cells = new Cell[boardSize][boardSize];
		addSnakes(noOfSnakes);
		addLadders(noOfLadders);
	}

	private void addLadders(int noOfLadders) {
		int numberOfLaddersAdded = 0;
		
		while(numberOfLaddersAdded < noOfLadders){
			int ladderStart = ThreadLocalRandom.current().nextInt(0, boardSize * boardSize - 1);
			int ladderEnd = ThreadLocalRandom.current().nextInt(0, boardSize * boardSize - 1);
			
			if(ladderEnd <= ladderStart){
				continue;
			}
			
			Jump ladder = new Jump(ladderStart, ladderEnd);
			
			Cell cell = getCell(ladderStart);
			cell.jump = ladder;
			
			numberOfLaddersAdded++;
		}
	}

	public Cell getCell(int position) {
		int row = position/boardSize;
		int col = position%boardSize;
		return cells[row][col];
	}

	private void addSnakes(int noOfSnakes) {
		int numberOfSnakesAdded = 0;
		
		while(numberOfSnakesAdded < noOfSnakes){
			int snakeStart = ThreadLocalRandom.current().nextInt(0, boardSize * boardSize - 1);
			int snakeEnd = ThreadLocalRandom.current().nextInt(0, boardSize * boardSize - 1);
			
			if(snakeStart <= snakeEnd){
				continue;
			}
			
			Jump ladder = new Jump(snakeStart, snakeEnd);
			
			Cell cell = getCell(snakeStart);
			cell.jump = ladder;
			
			numberOfSnakesAdded++;
		}
	}



}

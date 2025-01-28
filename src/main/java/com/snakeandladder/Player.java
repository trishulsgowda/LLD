package com.snakeandladder;

public class Player {

	int id;
	int currentPosition;
	
	public Player(int id, int currentPosition) {
		super();
		this.id = id;
		this.currentPosition = currentPosition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
}

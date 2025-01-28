package com.snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	int diceCount;
	
	public Dice(int diceCount) {
		this.diceCount = diceCount;
	}

	public int rollDice(){
		
		int currentDice = 0;
		int sum =0;
		while(currentDice<diceCount){
			sum = sum + ThreadLocalRandom.current().nextInt(0, 6);
			currentDice++;
		}
		return sum;
	}
}

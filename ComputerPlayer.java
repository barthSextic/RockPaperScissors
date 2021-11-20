package edu.mtc.egr281.project13;

import java.util.Random;

public class ComputerPlayer extends Player{
	
	private Random rng;
	
	public ComputerPlayer(String newName) {
		super(newName);
		this.rng = new Random();
	} // end constructor

	@Override
	public void makeMove() {
		this.setMove(this.rng.nextInt(Driver.NUMBER_OF_MOVES));
	} // end method
	
} // end class

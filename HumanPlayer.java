package edu.mtc.egr281.project13;

import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner input;
	
	public HumanPlayer(String newName, Scanner in) {
		super(newName);
		this.input = in;
	} // end constructor

	@Override
	public void makeMove() {
		int move;
		do {
			System.out.println(this.getName());
			System.out.println("Choices are ROCK (0), PAPER (1), SCISSORS (2)");
			System.out.print("Enter your move: ");
			move = input.nextInt();
		} while(move > 2 || move < 0);
		this.setMove(move);
	} // end method

	
	
} // end class

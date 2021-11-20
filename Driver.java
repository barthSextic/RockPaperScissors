package edu.mtc.egr281.project13;

import java.util.Scanner;

/*/
 * Rick Howell
 * 11/20/21
 * Project 13
 * This program will simulate Rock Paper Scissors
 * Main method lives in this class
 */

public class Driver {
	
	public static Scanner input;
	public static final int NUMBER_OF_PLAYERS = 2;
	public static final int NUMBER_OF_MOVES = 3;
	public static Player[] player;
	private static String[] cpuNames = {"CPU 01", "CPU 02"};
	
	public static void main(String[] args) {
		
		player = new Player[Driver.NUMBER_OF_PLAYERS];
		input = new Scanner(System.in);
		System.out.println();
		for (int i = 0; i < Driver.NUMBER_OF_PLAYERS; ++i) {
			System.out.print("Enter [H] for human, or [C] for CPU: ");
			if ("H".equalsIgnoreCase(input.next())) {
				System.out.print("Name: ");
				player[i] = new HumanPlayer(input.next(), input);
			} else {
				player[i] = new ComputerPlayer(cpuNames[i]);
			} // end if else
		} // end for
		// no need to assign a reference in memory since we're not using it anywhere else
		new Game(player[0], player[1]);
		input.close();
	} // end main method
	
} // end class

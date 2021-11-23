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
	public static String[] cpuNames = {"CPU 01", "CPU 02"};
	
	public static void main(String[] args) {
		player = new Player[Driver.NUMBER_OF_PLAYERS];
		input = new Scanner(System.in);
		System.out.println("Welcome! Enter a number corresponding to a game mode. \n"
				+ "Player vs Player [0], Player vs Computer [1], Computer vs Computer [2]");
		// no need to assign a reference in memory since we're not using it anywhere else
		new Game();
		Game.playerInfo(input.nextInt(), input);
		Game.algorithm(player[0], player[1]);
		input.close();
	} // end main method
} // end class

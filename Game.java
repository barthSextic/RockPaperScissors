package edu.mtc.egr281.project13;

import java.util.Scanner;

public class Game {

	private static final int TOTAL_WINS = 5;
	private static String compare;
	private static String[] moves;
	private static Choices[] choices = Choices.values();
	private static String[] moveText = {" smashes ",  " covers ", " cuts ", " tied "};
	
	// I can not justify using this constructor
	public Game() {
	} // end game constructor
	
	public static void algorithm(Player p1, Player p2) {
		enumArray();
		do {
			System.out.println("........................");
			moveSet(p1);
			System.out.println("________");
			moveSet(p2);
			System.out.println("........................");
			System.out.println(compareMethod(p1, p2));
			System.out.println("Current Score >>>> \n" + p1.getName() + ": " + p1.getWin() 
			+ " |||| " + p2.getName() + ": " + p2.getWin());
			System.out.println();
		} while(p1.getWin() < Game.TOTAL_WINS && p2.getWin() < Game.TOTAL_WINS);
		System.out.println("Final score >>>> \n" + p1.getName() + ": " + p1.getWin() 
			+ "\n" + p2.getName() + ": " + p2.getWin());
		System.out.println("The winner is: " + returnWinner(p1, p2));
	} // end algorithm
	
	public static void moveSet(Player player) {
		//System.out.println(player.getName());
		player.makeMove();
		System.out.println(player.getName()  + " picked " + moveConverter(player.getMove()));
	} // end method

	private static String compareMethod(Player p1, Player p2) {;
		if (p1.getMove() == p2.getMove()) {
			compare = p1.getName() + moveText[moveText.length - 1] + p2.getName();
		} else if (p1.getMove() == (p2.getMove() + 1) % 3) {
			p1.incrimentWin();
			compare = p1.getName() + moveText[p1.getMove()] + p2.getName();
		} else {
			p2.incrimentWin();
			compare = p2.getName() + moveText[p2.getMove()] + p1.getName();
		} // end if else
		return compare;
	} // end compare method
	
	private static String returnWinner(Player p1, Player p2) {
		if (p1.getWin() >= Game.TOTAL_WINS) {
			return p1.getName();
		} else {
			return p2.getName();
		} // end if else
	} // end method
	
	private static String moveConverter(int input) {
		String result = moves[input];
		return result;
	} // end method
	
	// makes an array from the enums
	private static String[] enumArray() {
		moves = new String[choices.length];
		for(int i = 0; i < choices.length; ++i) {
			moves[i] = choices[i].name();
		} // end for
		return moves;
	} // end method
			
	public static void playerInfo(int selection, Scanner input) {
		if(selection == 0) {
			for(int i = 0; i < Driver.NUMBER_OF_PLAYERS; ++i) {
				System.out.print("Player " + (i+1) + " Name: ");
				Driver.player[i] = new HumanPlayer(input.next(), input);
			} // end for
		} else if (selection == 1) {
			System.out.print("Player Name: ");
			Driver.player[0] = new HumanPlayer(input.next(), input);
			Driver.player[1] = new ComputerPlayer(Driver.cpuNames[1]);
		} else if (selection == 2) {
			for(int i = 0; i < Driver.NUMBER_OF_PLAYERS; ++i) {
				Driver.player[i] = new ComputerPlayer(Driver.cpuNames[i]);
			} // end for
		} // end if else
	} // end method

} // end class

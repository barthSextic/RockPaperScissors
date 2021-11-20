package edu.mtc.egr281.project13;

public abstract class Player {

	private String name;
	private int move;
	private int winCounter;
	
	public Player(String newName) {
		this.setName(newName);
		winCounter = 0;
	} // end constructor
	
	private void setName(String newName) {
		this.name = newName;
	} // end set method
	
	public String getName() {
		return this.name;
	} // end get method
	
	protected void setMove(int newMove) {
		this.move = newMove;
	} // end set method
	
	public int getMove() {
		return this.move;
	} // end get method
	
	protected void incrimentWin() {
		++ winCounter;
	} // end set method
	
	public int getWin() {
		return this.winCounter;
	} // end get method
	
	public abstract void makeMove();
	
} // end class

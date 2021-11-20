package edu.mtc.egr281.project13;

public enum Choices {

	ROCK, PAPER, SCISSORS, TIE;
	
	static String rv0;
	static String returnChoice(int i) {
		switch (i) {
			case 0:
				rv0 = Choices.ROCK.toString();
			case 1:
				rv0 = Choices.PAPER.toString();
			case 2:
				rv0 = Choices.SCISSORS.toString();
		} // end switch
		return rv0;
	} // end method
	
} // end enum

import java.util.Scanner;
import java.lang.Math;

public class Unit1_Deliverable_2 {
	

	public static void main(String[] args) {
		boolean endLoop = false;
		boolean isHeads = false;
		int correctCount=0;
		int numberOfFlips = 0;
		String headsOrTailsGuess = null;

		
		
		while (endLoop == false) {
		Scanner userInputCoinSide = new Scanner(System.in);
		System.out.print("Guess which will have more: heads or tails? ");
		String userInput =  userInputCoinSide.next();
		if (userInput.toLowerCase().equals("heads") || userInput.toLowerCase().equals("tails") ) {
			headsOrTailsGuess = userInput.toLowerCase();
			endLoop= true;
		}
		else {
			
			System.out.print("\nYou entered " +userInput +  " You must enter either heads or tails\n");
		}
		
		}// end of first while loop
		
		endLoop= false;
		while(endLoop == false) {
		Scanner userInputCoinFlip = new Scanner(System.in);
		System.out.print("\nHow many times shall we flip a coin?  ");
		try {
		int userInput =  userInputCoinFlip.nextInt();
		if (userInput>=1 ) {
			numberOfFlips = userInput;
			endLoop= true;
		}
		else {
			
			System.out.print("\nYou entered " +userInput +  " You must enter an integer greater than 0");
			
		}
		}
		catch(Exception e) {
			System.out.print("\n You must enter an integer greater than 0");
		}
		
		
		}//end of second while loop

		
		for (int i=1; i<=numberOfFlips; i++ ) {
			 int rand = (int)(Math.random()*2 )+1;
			
			if(rand == 1) {
			 isHeads=true;
			 System.out.print("\nheads");
			 if(headsOrTailsGuess.equals("heads")) {correctCount= correctCount +1;}
			}//heads
			
			else if (rand==2) {
			isHeads=false;
			System.out.print("\ntails");
			if(headsOrTailsGuess.equals("tails")) {correctCount= correctCount +1;}
			}
			
			
		}
		System.out.print("\n\nYour guess, " + headsOrTailsGuess +", came up "  +correctCount+ " time(s).\nThat's "+(int)(((float)correctCount / (float)numberOfFlips)*100) +"%.");
		
	}

}

package projectt;

import java.util.Scanner;

public class projectt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generate a lottery
	    int lottery = (int)(Math.random() * 1000);

	    // Prompt the user to enter a guess
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your lottery pick (three digits): ");
	    int guess = input.nextInt();

	    // Get digits from lottery
	    int lotteryDigit1 = lottery / 100;
	    int preLotteryDigit2 = lottery % 100;
	    int lotteryDigit2 = preLotteryDigit2 / 10;
	    int lotteryDigit3 = lottery % 10;

	    // Get digits from guess
	    int guessDigit1 = guess / 100;
	    int preGuessDigit2 = guess % 100;
	    int guessDigit2 = preGuessDigit2 / 10;
	    int guessDigit3 = guess % 10;

	    System.out.println("The lottery number is " + lottery);

	    // Check the guess
	    if (guess == lottery)
	      System.out.println("Exact match: you win $12,000");
	    
	    else if (guessDigit1==lotteryDigit1 && guessDigit2==lotteryDigit3 && guessDigit3==lotteryDigit2)
	      System.out.println("Match all digits: you win $5,000");
	    else if (guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit1 && guessDigit3==lotteryDigit3)
		      System.out.println("Match all digits: you win $5,000");
	    else if (guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit3 && guessDigit3==lotteryDigit1)
		      System.out.println("Match all digits: you win $5,000");
	    else if (guessDigit1==lotteryDigit3 && guessDigit2==lotteryDigit1 && guessDigit3==lotteryDigit2)
		      System.out.println("Match all digits: you win $5,000");
	    else if (guessDigit1==lotteryDigit3 && guessDigit2==lotteryDigit2 && guessDigit3==lotteryDigit1)
		      System.out.println("Match all digits: you win $5,000");
	    
	    else if (guessDigit1 == lotteryDigit1 
	          || guessDigit1 == lotteryDigit2 
	          || guessDigit1 == lotteryDigit3 
	          || guessDigit2 == lotteryDigit1
	          || guessDigit2 == lotteryDigit2 
	          || guessDigit2 == lotteryDigit3 
	          || guessDigit3 == lotteryDigit1
	          || guessDigit3 == lotteryDigit2
	          || guessDigit3 == lotteryDigit3)
	      System.out.println("Match one digit: you win $2,000");
	    else
	      System.out.println("Sorry, no match");
	  }
}

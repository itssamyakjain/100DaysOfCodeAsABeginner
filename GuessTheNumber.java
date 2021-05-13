import java.util.*;

/*
 *  Guess the number program
 *  The user has to guess a particular number in the 
 *  range 1-100 , the user has been provided with the 
 *  number of guesses that he makes to guess the correct number
 */

class Game{
	// stores number that user will guess 
	int randomNumber;
	
	// stores number of guesses
	int guesses;
	
	// stores number every time when a user makes a guess
	int number;
	
	Scanner sc = new Scanner(System.in);
	
	// generates random number
	public Game(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	// returns the user input as number
	public int takeUserInput() {
		number = sc.nextInt();
		return number;
	}
	
	// return the number of guesses
	public int getGuesses() {
		return guesses;
	}
	
	// sets the number of guesses
	public void setGuesses(int guesses) {
		this.guesses=guesses;
	}
	
	// detects whether the number entered by the user is true
	public boolean isCorrectNumber() {
		if(randomNumber<number) {		
			System.out.println("The number entered is greater.");				
			System.out.println("You have now "+(--guesses) +" guesses left.");
			System.out.println();
			return false;
		}
		else if(randomNumber>number) {
			System.out.println("The number entered is smaller.");
			System.out.println("You have now "+(--guesses) +" guesses left.");
			System.out.println();
			return false;
		}
		else {
			System.out.println("You guessed it right. The number entered5"
					+ " is correct.");
			return true;
		}
	}
}


public class GuessTheNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Game user1 = new Game(7);
		
		System.out.print("How many guesses do you want to make : ");
		int n = sc.nextInt();
		user1.setGuesses(n);
		System.out.println();
		
		while(n>0) {
			n--;
			System.out.print("Input the number you want to guess : ");
			user1.takeUserInput();
			if(user1.isCorrectNumber()==true)
				break;
		}
		sc.close();
		
	}
}

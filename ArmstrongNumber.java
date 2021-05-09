import java.util.*;

// a number is said to be armstrong if that number is equals to the 
// sum of its each individual digits raised to the power numberOfDigitsInThatNumber
public class ArmstrongNumber{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ask the user to input the number
		int number = sc.nextInt();
		
		// assigned the number to a temporary variable
		int tempNum = number;
		// stores the total number of digits in the number
		int noOfDigits=0;
		
		while(tempNum>0) {
			tempNum/=10;
			noOfDigits++;
		}
	
		// stores the sum of power of each digit
		int sum=0;
		tempNum = number;
		
		while(tempNum>0) {
			int remainder = tempNum%10;
			sum+=Math.pow(remainder, noOfDigits);
			tempNum/=10;
		}
		
		// if the number is equals to the sum, it is an armstrong number else not
		if(sum==number)
			System.out.println("The number is armstrong number!");
		else
			System.out.println("The number is not an armstrong number!");
	
		sc.close();
	
	}
}

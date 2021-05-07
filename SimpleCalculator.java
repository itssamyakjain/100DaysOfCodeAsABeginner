import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ask the user to input operand1
		System.out.print("Enter the first operand : ");
		double operand1 = sc.nextDouble();
		
		// ask the user to input operand2
		System.out.print("Enter the second operand : ");
		double operand2 = sc.nextDouble();
		
		// ask the user to input the operator
		System.out.print("Enter the operation you want to perform : ");
		char operator = sc.next().charAt(0);
		
		System.out.println("You entered : "+operator);
		
		switch(operator) 
		{
			// performs addition operation
			case '+':
				System.out.println("The result is : "+(operand1+operand2));
				break;
				
			// performs subtraction operation
			case '-':
				System.out.println("The result is : "+(operand1-operand2));
				break;
				
			// performs multiplication operation
			case '*':
				System.out.println("The result is : "+(operand1*operand2));
				break;
				
			// performs division operation
			case '/':
				System.out.println("The result is : "+(operand1/operand2));
				break;
				
			// performs modulo operation
			case '%':
				System.out.println("The result is : "+(operand1%operand2));
				break;
				
			default:
				System.out.println("Operator entered is invalid . Can't perform the operation !.");
		}
		
		sc.close();
		
	}

}

import java.util.*;

/*
 *  Java program to calculate the roots of quadratic equation
 */

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// let the quadratic equation be a*x^2+b*x+c 
		
		// ask the user to input a
		System.out.print("Enter the coefficient of x^2 : ");
		double a = sc.nextDouble();
		
		// ask the user to input b
		System.out.print("Enter the coefficient of x : ");
		double b = sc.nextDouble();
		
		// ask the user to input c
		System.out.print("Enter the constant c : ");
		double c = sc.nextDouble();
		
		// calculates discriminant
		double discriminant = b*b - 4*a*c;
		
		// checks if discriminant is equal to zero
		if(discriminant == 0)
			System.out.println("The quadaratic equation has exactly one real root which is : "+(-b/2*a));
		
		// checks if discriminant is greater to zero
		else if(discriminant>0){
			System.out.println("The quadaratic equation has two real and distinct roots .");
			System.out.println("They are : "+((-b+Math.sqrt(discriminant))/2*a)+" and "+((-b-Math.sqrt(discriminant))/2*a));
		}
		
		// if the discriminant is less than zero
		else {
			System.out.println("The quadratic equation has no real roots. It has complex roots.");
			double realPart = -b/(2*a);
			double imaginaryPart = (Math.sqrt(-discriminant))/(2*a);
			System.out.println("They are : "+(realPart)+"+"+(imaginaryPart)+"i"+" and "+(realPart)+"-"+(imaginaryPart)+"i");
		}
		sc.close();
		
	}

}

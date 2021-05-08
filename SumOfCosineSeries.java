import java.util.*;

public class SumOfCosineSeries{
	
	static final double PI = 3.142;
	
	// returns the power x raise to i
	static double pow(double x , int i) {
		double result = 1.0;
		while(i>0) {
			result*=x;
			i--;
		}
		return result;
	}
	
	// returns the factorial of i
	static int fact(int i) {
		int fact=1;
		if(i==0)
			fact =1;
		else if(i<0)
			fact=-1;
		else 
			for(int j=i; j>0 ; j--) 
				fact*=j;
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double x = sc.nextDouble();
		
		// converting x to radians
		x = x*(PI/180);
		double sum = 0.0;
		
		// calculates the sum of the cosx series
		for(int i=0 ; i<=n ; i+=2) {
			if(i%4==0)
				sum+=(pow(x,i)/fact(i));
			else
				sum-=(pow(x,i)/fact(i));
		}
    
    // prints the sum of the series
		System.out.println(sum);
		
		sc.close();
	}
}

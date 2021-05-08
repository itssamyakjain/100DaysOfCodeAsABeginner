import java.util.*;

public class Pattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    // ask the user input for n
		int n = sc.nextInt();
		
    // prints the pattern similar to pascal triangle but * in place of numbers
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j>=n-i+1 && j<=n+i-1) {
					if(i%2==0) {
						if(j%2==0)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					else {
						if(j%2!=0)
							System.out.print("*");
						else
							System.out.print(" ");
					}						
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();		
	}
}

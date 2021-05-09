import java.util.*;

public class FloydTriangle{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  
    // asks the user to input the number of rows
		int numberOfRows = sc.nextInt();
		
		int temp = 1;
		
		// prints the floyd's triangle 
		for(int row=1; row<=numberOfRows ; row++) {
			for(int column=1 ; column<=row ; column++) {
				// formatted output to width=4 in right direction
				System.out.printf("%-4d ",temp);
				temp++;
			}
			System.out.println();
		}
		sc.close();
	
	}
}

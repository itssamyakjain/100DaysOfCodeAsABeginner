import java.util.Scanner;

public class MoveAllNegativeNumbersToRight {
	 // method moves the negative numbers to the right side of the array	
	static void moveNegative(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n-1;
		
		while(left<right) {
			if(arr[left]<0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
			}
			else {
				left++;
			}
		}
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		
		moveNegative(arr);
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}

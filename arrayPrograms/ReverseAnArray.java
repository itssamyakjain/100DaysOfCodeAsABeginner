import java.util.Scanner;

public class ReverseAnArray{	
	// method that reverses the array
	// we swap the first element with the last one
	// second with the second last one and so on  	 
	static void reverseArray(int[] a){
		for(int i=0,j=(a.length-1);i<a.length/2;i++,j--) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// input size of array
		int n = sc.nextInt();		
		int[] arr= new int[n];
		
		// input array elements
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		// method call
		reverseArray(arr);
		for(int i:arr)
			System.out.print(i+" ");
		sc.close();
	}
}	

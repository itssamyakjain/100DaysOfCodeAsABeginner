/*
*  Linear Search traverses the array sequentially to find whether an element is present in array or not
*/
import java.util.Scanner;

public class LinearSearchInUnsortedArray{	
	
  // returns positive integer as index number if element is found else returns -1
	static int linearSearch(int[] a, int x) {
		int index=0;
	
		for(index=0; index<a.length;index++)
			if(a[index]==x) 
				return index;
		return -1;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];		
		
		System.out.print("Input the array elements : ");
		for(int i=0 ; i<size; i++)
			arr[i] = sc.nextInt();
			
		System.out.print("Input element to be searched in array : ");
		int x = sc.nextInt();
		
		System.out.println("The element is found at index : "+linearSearch(arr,x));	
		sc.close();
	}
}	

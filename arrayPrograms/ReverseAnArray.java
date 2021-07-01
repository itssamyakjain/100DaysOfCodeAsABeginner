import java.util.Scanner;

public class ReverseAnArray{	
	// method that reverses the array
	// we swap the first element with the last one
	// second with the second last one and so on  	 
	static void reverseArray(int[] a){
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
	}
	
	//method-2 :  reverse a part of array with the given start and end indices
	public static int[] reverse(int[] arr,int start,int end) {
		
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return  arr;
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

/*
 * Insert Operation in Array
 * In a fixed size array , if array is full then the element cannot be inserted
 * If there is some space left, then we have to make a space for the insertion of element
 * and shift the array elements after that one index forward 
 */

import java.util.Scanner;

public class Insertion{	
	
	// inserts the element if it's current capacity is less than the size of array 
	static int[] insert(int[] a, int x, int pos, int currCapacity) {
		
		int n = a.length;
		if(a.length == currCapacity)
			return a;
		
		int index = pos-1;
		for(int i=n-1; i>=index; i--) {
			a[i]=a[i-1];
		}
		
		a[index]=x;
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Input the current capacity i.e., number of elements present in array currently : ");
		int currCapacity = sc.nextInt();
		
		System.out.print("Input the array elements : ");
		for(int i=0 ; i<currCapacity ; i++)
			arr[i]=sc.nextInt();		
		
		System.out.print("Input the element to be inserted : ");
		int x = sc.nextInt();
		System.out.print("Input the position at which array element will be inserted : ");
		int pos = sc.nextInt();
	
		arr = insert(arr,x,pos,currCapacity);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		sc.close();
	}
}	

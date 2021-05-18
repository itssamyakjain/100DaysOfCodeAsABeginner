import java.util.Scanner;

public class LeftRotateAnArray{	
	
	//this method left rotates(counter clockwise) the array by k
	// using a temp array which stores first k elements & shifts the rest
	// by k and using temp to restore the k elements
	static void leftRotate(int[] a, int k){
		int[] temp = new int[k];
		for(int i=0;i<k;i++)
			temp[i]=a[i];
		
		for(int i=0;i<a.length-k;i++)
			a[i]=a[i+k];
		
		for(int i=a.length-k,j=0; i<a.length; i++,j++)
			a[i]=temp[j];
		
	}
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// input size of array
		int n = sc.nextInt();		
		int[] arr= new int[n];
		
		// input array elements
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int k = sc.nextInt();
		// method call
		leftRotate(arr,k);
		for(int i:arr)
			System.out.print(i+" ");
		sc.close();
	}
}	

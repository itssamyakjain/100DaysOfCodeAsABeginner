import java.util.Scanner;

public class LeftRotateAnArray{	
	
	//the below method left rotates(counter clockwise) the array by k
	// using a temp array which stores first k elements & shifts the rest
	// by k and using temp to restore the k elements
	// TC = O(n) and SC = O(d)
	static int[] leftRotate(int[] a, int k){
		int n = a.length;
		int[] temp = new int[k];
		for(int i=0;i<k;i++)
			temp[i]=a[i];
		
		for(int i=k;i<n;i++)
			a[i-d]=a[i];
		
		for(int i=n-k,j=0; i<n; i++,j++)
			a[i]=temp[j];
		return a;
	}
	
	// rotates array one by one in each iteration till d!=0
	// TC = O(n*d) and SC = O(1) 
 	static int[] leftRotate(int[] arr, int d) {
		int n = arr.length;
		while(d>0) {
			int temp=arr[0];
			for(int i=1;i<n;i++)
				arr[i-1]=arr[i];
			arr[n-1]=temp;
			d--;
		}
		return arr;
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

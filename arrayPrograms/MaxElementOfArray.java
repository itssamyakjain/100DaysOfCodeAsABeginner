import java.util.Scanner;

public class MaxElementOfarray{	
  
  // method returns the index of the largest element
	static int maxOfArray(int[] a){
		int max = a[0];
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				index=i;
			}
		}
		return index;
  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// input size of array
    int n = sc.nextInt();		
		int[] arr= new int[n];
		// input array elements
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println(maxOfArray(arr));
		sc.close();
	}
}	

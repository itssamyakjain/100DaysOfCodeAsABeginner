import java.util.*;

public class BinarySearch{
	// method for binary search iterative approach
  	// returns the index of element if it is found else returns -1
	static int binarySearch(int[] arr,int x, int start,int end) {
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				end = mid-1;
			else
				start = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		//
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
	  // input element to be searched
		int x= sc.nextInt();
   	 // sort the array
		Arrays.sort(arr);
		System.out.println(binarySearch(arr,x,0,n-1));
	
	}
}	

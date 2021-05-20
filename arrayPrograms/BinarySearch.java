import java.util.*;

public class BinarySearch{
	// method for binary search
  // returns the index of element if it is found else returns -1
	static int binarySearch(int[] a,int x,int start, int end) {
	  if(start<=end) {
		  int mid = (start+end)/2;
		  if(a[mid]==x) {
			  return mid;
		  }
		  else if(x<a[mid]) {
			  end=mid-1;
			  return binarySearch(a,x,start,end);
		  }
		  else{
			  start=mid+1;
			  return binarySearch(a,x,start,end);
		  }
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

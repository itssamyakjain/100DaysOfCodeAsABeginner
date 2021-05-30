import java.util.Scanner;

public class Sort0s1s2s {	
	// this is approach 1
  // this method sorts the array in the order 0 then 1 then 2.
	public static void sort(int[] arr) {
		int n = arr.length;
		int low=0,mid=0;
		int high =n-1;
		
		while(mid<=high) {
			switch(arr[mid]) {
				case 0:
					arr[mid]=arr[low];
					arr[low]=0;
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					int temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
 					high--;
					break;
			}
		}
	}
  
  // this is approach 2
  // this method sorts the array in the order 0 then 1 then 2.
  	public static void sort(int[] arr) {
		int n = arr.length;
		int cnt0=0,cnt1=0,cnt2=0;
		
		while(n-1>=0) {
			switch(arr[n-1]) {
			case 0:
				cnt0++;
				--n;
				break;
			case 1:
				cnt1++;
				--n;
				break;
			case 2:
				cnt2++;
				--n;
				break;
			}
		}
		
		int i=0;
		while(i<cnt0) {
			arr[i]=0;
			i++;
		}
		
		while(i<cnt0+cnt1) {
			arr[i]=1;
			i++;
		}
		
		while(i<cnt0+cnt1+cnt2) {
			arr[i]=2;
			i++;
		}	
		
	}


  	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		sort(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		sc.close();
	}

}

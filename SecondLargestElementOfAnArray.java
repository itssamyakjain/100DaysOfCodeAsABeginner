import java.util.Scanner;

public class SecondLargestElememtOfAnArray{
	
	static int secondLargestElement(int[] arr) {
		// stores size of the array
    int l = arr.length;
		
    // stores largest element of array
    int largest;
    
    // stores second largest element of array
		int secondLargest;
		
    // assigning arr[0] to largest if it is greater
    // else to arr[1] 
		if(arr[0]>arr[1]) {
			largest=arr[0];
			secondLargest=arr[1];
		}
		else {
			largest=arr[1];
			secondLargest=arr[0];
		}
		
    // 
		for(int i=2; i<l ;i++) {
			if(arr[i]>largest && arr[i]>secondLargest) {
				secondLargest=largest;
				largest=arr[i];
			}
			if(arr[i]>secondLargest && arr[i]<largest) {
				secondLargest=arr[i];
			}
		}
    
    // returns the second largest element
		return secondLargest;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// input size if array
    int n = sc.nextInt();
    
    // declaring array
		int[] arr = new int[n];
		
    // input array elements
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		
		int max = secondLargestElement(arr);
		System.out.println(max);
		sc.close();
	}
}	

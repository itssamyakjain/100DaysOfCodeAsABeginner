import java.util.Scanner;

public class Algo {
	
  // method deleted a particular element x in an array
	static int deleteOperation(int[] a,int capacity, int x){
	
    // if array is empty
		if(a.length==0)
			return a.length;
		int index=0;
		// finds the index of the element to be deleted
		for(index=0;index<a.length;index++) {
			if(a[index]==x)
				break;
		}
		
    // shifts all the element beyond the x to the left by 1 
		for(int i=index;i<capacity-1;i++) {
			a[i]=a[i+1];
		}
		a[capacity-1]=0;
		return --capacity;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int capacity= sc.nextInt();
		for(int i=0;i<capacity;i++)
			arr[i]=sc.nextInt();
		
		int x = sc.nextInt();
		capacity = deleteOperation(arr,capacity,x);
		
		for(int i=0;i<capacity;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}		
}  

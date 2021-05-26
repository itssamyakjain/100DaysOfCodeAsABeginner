import java.util.Scanner;

public class DeleteOperation {
	
 	 // method deleted a particular element x in an array
	static int deleteOperation(int[] a,int capacity, int x){
	
   		int index=0;
		// linear search to get the index of the element to be deleted	
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
			   index=i;
			   break;
			}
			else
			   index=-1;
		}
		
		// if the element to be deleted is not found we return the current size of the array
		if(index==-1)
			return capacity;
		
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

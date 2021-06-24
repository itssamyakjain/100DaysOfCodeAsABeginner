// in the simple implementation capacity is total elements that can reside in the queue
// size points to the current size of the queue's array 
// Time complexity of all the operations is constant except the dequeue operation having TC as O(n)
// Space complexity is O(capacity) , the size of the array 
class Queue{
	
	int size;
	int capacity;
	int arr[];
	
	Queue(int capacity){
		this.capacity=capacity;
		size=0;
		arr = new int[this.capacity];
	}
	
	int size() {
		return size;
	}
	
	// returns te index of front element
	int getFront() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else
			return this.arr[0];
	}
	
	// returns the index of rear element
	int getRear() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[size-1];
	}

	boolean isEmpty() {
		if(size==0)
			return true;
		else
			return false;
	}
	
	boolean isFull() {
		if(size==capacity)
			return true;
		else
			return false;
	}
	
	void enqueue(int x) {
		if(isFull())
			System.out.println("Overflow");
		else {
			arr[size++]=x;
		}
			
	}
	
	void dequeue() {
		if(isEmpty())
			System.out.println("Underflow");
		else {
			for(int i=0;i<size;i++) {
				arr[i]=arr[i+1];
			}
			size--;
		}
		
	}
	
	void printQueue() {
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
	
}


public class QueueUsingArray {

	public static void main(String[] args) {
		Queue q = new Queue(100);
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		q.enqueue(44);
		q.enqueue(55);
		q.dequeue();
			 
		System.out.println(q.size());					      // 4
		System.out.println(q.getFront());		// 22
		System.out.println(q.getRear());			// 55
		q.printQueue();									            // 22 33 44 55
	}

}

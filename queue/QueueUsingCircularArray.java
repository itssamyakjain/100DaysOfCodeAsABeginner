// we use circular array to make the time complexity of dequeue operation as constant which was
// linear in case of implementation with simple array 
// we keep the two pointers/ indices front and rear to keep the track 
// we increase the front and rear in circular manner
class Queue{
	
	int capacity;
	int front, rear, size;
	int arr[];
	
	Queue(int capacity){
		this.capacity=capacity;
		size=front=rear=0;	
		arr = new int[this.capacity];
	}
	
	int size() {
		return size;
	}
	
	// returns the front element
	int getFront() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[front];
	}
	
	// returns the rear element
	int getRear() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[rear];
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
	
  // enqueue method changes the rear and size
	void enqueue(int x) {
		if(isFull())
			System.out.println("Overflow");
		else {
			rear = (front+size-1)%capacity;
			rear=(rear+1)%capacity;
			arr[rear]=x;
			size++;
		}
			
	}
	
  // changes the front and size
	void dequeue() {
		if(isEmpty())
			System.out.println("Underflow");
		else {
			front=(front+1)%capacity;
			size--;
		}
		
	}
	
}


public class QueueUsingCircularArray {

	public static void main(String[] args) {
		Queue q = new Queue(100);
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		q.enqueue(44);
		q.enqueue(55);
		q.dequeue();

	}
}

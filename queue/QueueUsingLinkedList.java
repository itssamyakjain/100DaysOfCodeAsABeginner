// maintain two pointers front and rear 
// we always choose the head as front and tail as rear
// all the operations take constant time
class Node{
	int key;
	Node next;
	
	Node(int key){
		this.key=key;
	}
}

public class Queue {
	
		Node front;
		Node rear;
		int size;
		
		public Queue() {
			front=rear=null;
		}
		
		public int getFront() {
			if(front==null)
				return -1;
			else
				return front.key;
		}
		
		public int getRear() {
			if(rear==null)
				return -1;
			else
				return rear.key;
		}
		
	
		public void enqueue(int x) {
			
			Node n = new Node(x);
	
			if(front==null) {
				front=rear=n;
			}
			else {
				rear.next=n;
				rear=n;
			}
		}
		
		public void dequeue() {
			if(front==null)
				return;
			front=front.next;
			if(front==null)
				rear=null;
		}
		
		public void printQueue() {
			if(front==null && rear==null)
				return;
			for(Node temp=front ; temp!=rear.next ; temp=temp.next)
				System.out.print(temp.key+" ");
		}
	
		public static void main(String[] args) {
			Queue q = new Queue();
			q.enqueue(11);
			q.enqueue(22);
			q.enqueue(33);
			q.enqueue(44);
			q.printQueue();   // 11 22 33 44
		}
	
	}

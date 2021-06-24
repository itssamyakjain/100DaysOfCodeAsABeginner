// using linked list implementation of queue 
// queue can be reversed similar to what a linked list is reversed in single traversal with no extra space
// while using a stakc requires two traversals and extra space
public class Queue{
  /*
  // variable declarations and queue operations
  */
  
  // method to reverse queue
  public static Node reverse(Queue q) {
			Node curr = q.front;
			Node prev=null;
			
			while(curr!=null) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			return prev;
		}
  
  		
  public static void main(String[] args) {
			Queue q = new Queue();
			q.enqueue(11);
			q.enqueue(22);
			q.enqueue(33);
			q.enqueue(44);
			q.enqueue(55);
			q.rear=q.front;         //assign rear as front
			q.front= reverse(q);    // and front as rear returned by reverse method
			q.printQueue();         // output : 55 44 33 22 11
  }
}

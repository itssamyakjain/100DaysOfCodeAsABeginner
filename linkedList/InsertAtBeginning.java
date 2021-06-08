class Node{
	int key;
	Node next;

	public Node(int key) {
		this.key=key;
		next=null;	
	}

}

// we are doing constant amount of work ,so TC = O(1)
// if you insert 1,2,3 in order then the order in which they would be present in linked list are 3,2,1
public class InsertAtBeginning {
	
	public static Node insert(Node head, int x) {
		
		Node temp = new Node(x);
		temp.next=head;
		return temp;
		
	}
  
  public static void main(String[] args) {
    		Node head = new Node(11);
		head.next = new Node(22);
		head.next.next = new Node(44);
		head.next.next.next = new Node(55);
		// new head after insertion
		head = insert(head,10);
		head = insert(head,9);
		printList(head);    // linked list after insertions : 9 10 11 22 44 55 
  }
}
  

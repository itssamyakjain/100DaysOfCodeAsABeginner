class Node{
	int key;
	Node next;
	Node prev;

	public Node(int key) {
		this.key=key;	
		next = prev = null;
	}
}


public class InsertAtBeginning {
  //TC & SC : O(1) 
  public static Node insert(Node head, int x) {
		
		// allocated memory to new node
		Node n = new Node(x);
		n.next = head;
		
		// if head is not null, change previous of head
		if(head!=null)
			head.prev = n;
		// return the new head
		return n;
	}
  
  	public static void main(String[] args) {
			
		Node head = new Node(11);
		Node temp = new Node(22);
		head.next = temp;
		temp.prev=head;
		
    // update the new head
		head=insert(head,10);
		printList(head);
	}
}

  

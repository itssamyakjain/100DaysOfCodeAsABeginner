class Node{
	int key;
	Node next;
	Node prev;

	public Node(int key) {
		this.key=key;	
		next = prev = null;
	}
}

public class InsertAtEnd {	
		
  public static Node insert(Node head, int x) {
		
		Node n = new Node(x);
		
    // corner case 
		if(head==null)
			return n;
		
		Node curr = head;
		while(curr.next!=null)  // traverse to end and hold curr to last node
			curr=curr.next;
		curr.next=n;
		n.prev=curr;
		return head;
	
	}

  public static void main(String[] args) {
  
    head=insert(head,33);
		head=insert(head,44);
		head=insert(head,55);

		printList(head);   // output : 33 44 55
	}
}

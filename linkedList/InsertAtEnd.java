class Node{
	int key;
	Node next;

	public Node(int key) {
		this.key=key;
		next=null;	
	}

}

public class List {
	
  //method to insert node at the end of linked list
  // TC : O(n) as we only know the reference to head node so we need to search through whole linked list & SC : O(1) 
	public static Node insertAtEnd(Node head,int x) {
		
		Node temp = new Node(x);
		
    // head gets changed only when list is empty
		if(head == null) 
			return temp;
		
		Node curr = head;
		while(curr.next!=null) 
			curr=curr.next;       // current should point/refer to the last node
		curr.next = temp;	
		return head;
		
	}

  public static void main(String[] args) {

    Node head = new Node(11);
		head.next = new Node(22);
		head.next.next = new Node(44);
		head.next.next.next = new Node(55);
    // head is previous one itself , only a new node is inserted at the end so head is assigned again
		head = insertAtEnd(head,66);
		head = insertAtEnd(head,77);
		printList(head);		// output : 11 22 44 55 66 77 
	}

}

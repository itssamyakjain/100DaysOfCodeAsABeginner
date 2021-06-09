class Node{
	int key;
	Node next;

	public Node(int key) {
		this.key=key;
		next=null;	
	}
}

public class List {	
	
	public static Node reverseList(Node head) {
		
		Node curr = head;
		Node prev = null;
		
		// in a single traversal
		// with constant auxiliary space
		while(curr!=null) {
			
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		// previous is the new head
		return prev;
		
	}
	
	public static void printList(Node n) {
	
		while(n!=null) {
			System.out.print(n.key+" ");
			n=n.next;
		
		}
	}
	
		public static void main(String[] args) {
	
			Node head = new Node(12);
			Node temp1 = new Node(14);
			Node temp2 = new Node(15);
			Node temp3 = new Node(16);
			Node temp4 = new Node(17);
			head.next = temp1;
			temp1.next = temp2;
			temp2.next = temp3;
			temp3.next = temp4;
			head = reverseList(head);   
			printList(head);  //output : 17 16 15 14 12 
		}
}

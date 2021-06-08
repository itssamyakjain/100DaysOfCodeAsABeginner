class Node{
	int key;
	Node next;

	public Node(int key) {
		this.key=key;
		next=null;	
	}
}

public class TraversingLinkedList{
  
  // traverses the list and print its contents . TC = O(n)
  public static void printList(Node n) {
		Node curr = n;
    while(curr!=null) {
			System.out.print(curr.key+" ");
			curr=curr.next;
		}
	}
  
  	public static void main(String[] args) {
		
//		Node head = new Node(22);
//		Node temp1 = new Node(33);
//		Node temp2 = new Node(44);
//    Node temp3 = new Node(55);      
//		head.next = temp1;
//		temp1.next = temp2;
//    temp2.next = temp3;
//    printList(head);      
		

		Node head = new Node(22);
		head.next = new Node(33);
		head.next.next = new Node(44);
		head.next.next.next = new Node(55);
		printList(head);

	}

}


class Node{
	int key;
	Node next;
	

	public Node(int key) {
		this.key=key;
		next=null;	
	}

}

// TC : O(n) , as in the worst case whole list needs to be traversed if the element is not found 
// SC : O(1)
public class SearchInLinkedList {
  
  // iterative approach to search element in a linked list
  public static int search(Node n,int x) {
		Node curr = n;
		int pos = 1;
	
    while(curr!=null) {
			if(curr.key==x) {
				return pos; 
			}
			pos++;
			curr=curr.next;
		}
		return -1;
	}
  
  public static void main(String[] args) {
      
		Node head = new Node(11);
		head.next = new Node(22);
		head.next.next = new Node(44);
		head.next.next.next = new Node(55);
		System.out.println(search(head,55));    // output is 4 , 55 is found at position 4
	}

}


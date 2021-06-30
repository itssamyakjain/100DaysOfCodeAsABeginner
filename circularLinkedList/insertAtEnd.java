// naive approach , TC : theta of (n)
// always going to traverse to the last node and then insert it

// approach-2
//


// efficient approach - 3 , TC : theta of 1
// insert new after head , swap the values of head and newNode
// return newNode as the new head
public static Node insertAtEnd(Node head,int x) {
		
		Node n = new Node(x);
		
		if(head==null) {
			n.next=n;
			return n;
		}
		else {
			n.next=head.next;
			head.next=n;
			int temp =head.key;
			head.key=n.key;
			n.key=temp;
			head=n;
			return head;
		}
	}

// naive approach , TC: O(n)
public static Node insertAtBegin(Node head,int x) {
		
		Node n = new Node(x);
    if(head==null)
      n.next=n;
      return n;
  
    Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		
		n.next=head;
		temp.next=n;
		return n;
}

// approach-2 , TC : O(1)
// if we also maintain the tail pointer along with head or only tail pointer
// which points to last node of ll 


// approach-3, TC : O(1)
// insert the new node to the next of head node and then swap the values
// tricky
	public static Node insertAtBegin(Node head,int x) {
		
		Node node = new Node(x);
		if(head==null){
      node.next=node;
      return node;
    }
    else{
  		node.next=head.next;
	  	head.next=node;
		  int temp=head.key;
		  head.key=node.key;
		  node.key=temp;
      return head;
    }
  }
	
	}

// insert at any given position in linked list
// TC : O(1) in the worst case
	
  public static Node InsertAtGivenPosition(Node head,int x, int pos) {
		
		Node temp = new Node(x);
		
    // let the curr node points to head
		Node curr = head;
		
    // insert at the beginning (base case)
    // head gets changed only when pos is 1
		if(pos==1) {
			temp.next=head;
			return temp;
		}
		
    // run the loop pos-2 times
		for(int i=1; i<=pos-2 && curr!=null ; i++) {
			curr=curr.next;
		}
		
		// if no node is present in linked list or given position is invalid(beyond the size of linkedlist+1)
		if(curr==null)
			return temp;

		temp.next= curr.next;
		curr.next= temp;
		return head;
		
	}

// naive approach , TC : O(n)
public static Node deleteHead(Node head) {
		
		if(head==null || head.next==head)
			return null;
		else {
			Node node = head;
			while(node.next!=head) {
				node=node.next;
			}
			node.next=head.next;
			return node.next;       // returns node.next as new head
			
		}
}

// efficient approach, TC : O(1)
// we can easily delete next of head node in constant time
// that is why we copied the data
public static Node deleteHead(Node head) {
		
		if(head==null || head.next==head)
			return null;
		else {
			head.key=head.next.key;				// copy the data of next node to head
			head.next=head.next.next;			// delete the next node to head
			return head;
		}
}

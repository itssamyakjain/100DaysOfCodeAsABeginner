// if k==1 i.e., if the node to be deleted is head or head is null we can delte it in constant time
// else the TC would be O(n) in the worst case
public static Node deleteKthNode(Node head,int k) {
		
		if(k==1) {
			if(head==null||head.next==head)
				return null;
			else {
				int temp=head.key;
				head.key=head.next.key;
				head.next.key=temp;
				head.next=head.next.next;
				return head;
			}
		}
			
		Node temp =head;
		for(int i=0;i<k-2;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}

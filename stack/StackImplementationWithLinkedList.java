// insertion and deletion takes place at the beginning of the linked list
// Time complexity of all the operations is constant at the beginning
// file is Stack.java
public class Stack{
	Node top;
	
	static class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;
		}
	}
	
	// if the top element points to null
	public boolean isEmpty() {
		if(top==null)
			return true;
		else
			return false;
	}
	
	// pushes element on to the stack
	public void push(int x) {
		Node n = new Node(x);
		
		if(isEmpty()) {
			top=n;
		}
		else {
			Node temp = top;
			top = n;
			n.next=temp;
		}
		System.out.println(x+" pushed onto stack");
	}
	
	// removes element from the stack
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			popped = top.value;
			top=top.next;
		}
		return popped;
	}
	
	// returns the top element of th stack
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}
		else {
			return top.value;
		}
	}
	
	// prints the stack elements
	public void printStack(Node top) {
		for(Node temp = top ; temp!=null ; temp=temp.next) {
			System.out.print(temp.value+" ");
		}
	}
	
}

// Driver Code 
// file is StackImplementationWithLinkedList.java
public class StackImplementationWithLinkedList {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(11);
		s.push(22);
		s.push(33);
		System.out.println(s.peek());
		System.out.println(s.pop()+" is popped");
		System.out.println(s.peek());
		s.printStack(s.top);
	}

}

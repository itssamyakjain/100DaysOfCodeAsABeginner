
class Stack{
  // let the stack maximum size be 1000
	static final int MAX = 1000;
	int[] arr = new int[MAX];
	int top;
	
	//top is initialized to -1 so when we push
	//it will become 0 with 1st element of stack 
	// basically top points to the topmost element of stack
	Stack(){
   		 top=-1;
  	}
  	
	boolean isEmpty(){
		if(top<0)
			return true;
		else
			return false;
	}
	
	// returns the top element of the stack
	int peek() {
		if(isEmpty()) {
			System.out.println("StackUnderflow");
			return 0;
		}
		return arr[top];
	}
	
	// inserts the element on to the stack at the top
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("StackOverflow");
			return false;
		}
		// pushed a new element to stack , top index increases by 1
		++top;
		arr[top]=x;
		System.out.println(x+" pushed into stack");
		return true;
	}
	
	// removes the top element from the stack 
	int pop() {
		if(isEmpty()) {
			System.out.println("StackUnderflow");
			return 0;
		}
		
		// when we push after popping off the res the new x overwrites it
		int res = arr[top];
		top--;
		return res;
	}
	
	void printStack() {
		for(int i=0;i<=top;i++)
			System.out.print(arr[i]+" ");
	}
}


public class StackOperations {
	
	public static void main(String[] args) {
        		Stack s = new Stack();
		        s.push(11);
		        s.push(22);
		        s.push(33);
		        System.out.println(s.pop()+" popped from the stack");
		        s.printStack();  // output : 11 22
			}
}

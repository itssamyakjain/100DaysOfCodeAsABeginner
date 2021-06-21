// construction of a binary tree
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
	}
	
}

public class TreeConstruction {
  	public static void main(String[] args) {
	  	Node root = new Node(10);
	  	root.left = new Node(15);
	  	root.right = new Node(20);
		  root.left.left = new Node(25);
		  root.left.right = new Node(30);
		  root.right.left = new Node(27);
	  	root.right.right = new Node(31);
    }
}

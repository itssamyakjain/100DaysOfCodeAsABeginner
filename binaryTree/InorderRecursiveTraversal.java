// construction of a tree
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
	}
	
}


public class InorderRecursiveTraversal {
  
  // INORDER TRAVERSAL
	public static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
    }
	}	
  
  	public static void main(String[] args) {
	  	Node root = new Node(10);
		  root.left = new Node(15);
		  root.right = new Node(20);
	  	root.left.left = new Node(25);
	  	root.left.right = new Node(30);
	  	root.right.left = new Node(27);
		  root.right.right = new Node(31);
		  inorder(root);      // OUTPUT INORDER TRAVERSAL (LEFT ROOT RIGHT) :  25 15 30 10 27 20 31 
	}

}


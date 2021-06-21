// construction of a tree
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
	}
	
}


public class PreorderRecursiveTraversal {
  
  // PREORDER TRAVERSAL
	public static void preorder(Node root) {
		if(root!=null) {
      System.out.print(root.key+" ");
      preorder(root.left);
      preorder(root.right);
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
		  preorder(root);      // OUTPUT PREORDER TRAVERSAL (ROOT LEFT RIGHT) :  10 15 25 30 20 27 31
	}

}


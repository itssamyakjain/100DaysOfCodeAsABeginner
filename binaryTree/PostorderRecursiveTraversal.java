// construction of a tree
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
	}
	
}


public class PostorderRecursiveTraversal {

  // POSTORDER TRAVERSAL
	public static void postorder(Node root) {
		if(root!=null) {
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.key+" ");
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
		  postorder(root);      // OUTPUT POSTORDER TRAVERSAL (LEFT RIGHT ROOT) :  25 30 15 27 31 20 10 
	}

}

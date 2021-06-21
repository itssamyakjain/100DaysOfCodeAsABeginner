// construction of a tree
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
	}
	
}

public class SizeOfTree{
  // returns the size of the binary tree 
  public static int getSize(Node root){
      if(root==null)
        return 0;
      else
        return 1+getSize(root.left)+getSize(root.right);      // 1 is for the count of root node and the recursive calls for count of left and right subtree nodes
  }
  
  	public static void main(String[] args) {
		  Node root = new Node(10);
		  root.left = new Node(15);
		  root.right = new Node(20);
		  root.left.left = new Node(25);
		  root.left.right = new Node(30);
		  root.right.left = new Node(27);
		  root.right.right = new Node(31);
		  System.out.println(getSize(root));         // prints 7 as total nodes present are 7
	}

}
}

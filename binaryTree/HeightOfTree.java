// construction of a tree
class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
	}
	
}
// TC : O(n) as we traverse each node once and do some constant comparison work
// SC : O(h) as in the worst case number of recursion calls are h+1 in the recursive call stack in memory where h is the height of tree
public class HeightOfTree {
    // RETURNS THE HEIGHT OF THE TREE
    //  two conventions to define the height of tree , maximum number of edges in the longest path from root to bottommost leaf
    // and other is to count the nodes
    // this method uses the second convention
  	public static int height(Node root) {
		  if(root==null)
			  return 0;
		  else
			  return Math.max(height(root.left),height(root.right)) + 1;
	}
  
  	public static void main(String[] args) {
	  	Node root = new Node(10);
	  	root.left = new Node(15);
  		root.right = new Node(20);
	  	root.left.left = new Node(25);
    	root.left.right = new Node(30);
	  	root.right.left = new Node(27);
	  	root.right.right = new Node(31);
	  	System.out.println(height(root));       // OUTPUT : 3 
		
	}

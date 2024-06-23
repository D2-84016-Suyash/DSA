import BSTree.Node;

public class BSTree {
	class Node{
		private int data;
		private Node left;
		private Node right;
	
	public Node(int value) {
		data = value;
		left=right=null;
	}
	}
	private Node root;
	
	public BSTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void deleteAll() {
		root=null;
	}
	
	public void addNodeRecursive(int value) {
		if(isEmpty())
			root = new Node(value);
		else
			addNodeRecursive(root, value);
	}
	
	public void addNodeRecursive(Node trav, int value) {
		if(value < trav.data) {
			if(trav.left==null) {
				trav.left = new Node(value);
				return;
			}
			else
				addNodeRecursive(trav.left, value);
		}
		else {
			if(trav.right==null) {
				trav.right = new Node(value);
				return;
			}
			else
				addNodeRecursive(trav.right, value);
		}
	}
	
	public void preorder(Node trav) {
		if(trav==null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		System.out.println("Preorder: ");
		preorder(root);
		System.out.println(" ");
	}
	
	public void inorder(Node trav) {
		if(trav==null)
			return;
		inorder(trav.left);
		System.out.print(" " + trav.data);
		inorder(trav.right);
	}
}

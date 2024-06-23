
public class BSTMain {

	public static void main(String[] args) {
		BSTree bst = new BSTree();
		bst.addNodeRecursive(8);
		bst.addNodeRecursive(3);
		bst.addNodeRecursive(10);
		bst.addNodeRecursive(6);
		bst.addNodeRecursive(1);
		bst.addNodeRecursive(14);
		bst.addNodeRecursive(13);
		bst.addNodeRecursive(7);
		bst.addNodeRecursive(4);
		
		bst.preorder();
		bst.inorder();
		bst.postorder();

	}

}

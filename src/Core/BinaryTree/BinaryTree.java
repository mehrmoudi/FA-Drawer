package Core.BinaryTree;

/**
 * 
 * @author Mehran Mahmoudi
 * 
 */
public class BinaryTree {

	private BinaryTreeNode root;

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTree(BinaryTreeNode root) {
		setRoot(root);
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTree() {

	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTreeNode getRoot() {
		return root;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setRoot(BinaryTreeNode root) {
		this.root = root;
		this.root.setParent(null);
	}

}

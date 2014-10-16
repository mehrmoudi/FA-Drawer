package Core.BinaryTree;

/**
 * 
 * @author Mehran Mahmoudi
 * 
 */
public class BinaryTreeNode {

	private Object value;
	private BinaryTreeNode parent, leftChild, rightChild;

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTreeNode(Object value) {
		setValue(value);
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTreeNode() {
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTreeNode getParent() {
		return parent;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setParent(BinaryTreeNode parent) {
		this.parent = parent;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
		this.leftChild.setParent(this);
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public BinaryTreeNode getRightChild() {
		return rightChild;
	}

	/**
	 * 
	 * @author Mehran Mahmoudi
	 * 
	 */
	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
		this.rightChild.setParent(this);

	}
}
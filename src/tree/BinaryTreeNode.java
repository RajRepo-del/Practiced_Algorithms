package tree;

public class BinaryTreeNode {
	int data;
	BinaryTreeNode left=null;
	BinaryTreeNode right=null;
	public BinaryTreeNode(int data,BinaryTreeNode left,BinaryTreeNode right){
		this.data = data;
		this.left=left;
		this.right = right;
	}
	public BinaryTreeNode(int data){
		this.data=data;
	}

}

package tree;

import java.util.ArrayList;
import java.util.List;

class InorderIterator {
	  // TODO: Write - Your - Code
	  BinaryTreeNode root;
	  public InorderIterator(BinaryTreeNode root) {
	  this.root=root;
	  }

	  public boolean hasNext() {
	    if(root.right !=null || root.left !=null){
	      return true;
	    }
	    return false;
	  }

	  public BinaryTreeNode getNext() {
	    BinaryTreeNode returnNode = null;
	    if(root.right!=null){
	      return new InorderIterator(root.right).getNext();
	    }else {
	      returnNode = root;
	      root=root.left;
	    }
	    System.out.println(returnNode.data);
	    return returnNode;
	  }

	  //Don't Change anything down below
	  public String inorderUsingIterator(BinaryTreeNode root) {
	    InorderIterator iter = new InorderIterator(root);
	    String result = "";
	    while (iter.hasNext()) {
	    	BinaryTreeNode rt = iter.getNext();
	      result += rt.data + " ";
	      rt=null;
	    }
	    return result;
	  }   
	  public static void main(String[] argv) {
		    
		    List<Integer> input1 = new ArrayList<Integer>();
		    input1.add(100);input1.add(50);input1.add(200);input1.add(25);input1.add(125);input1.add(250);
		    BinaryTreeNode root1  = new BinaryTreeNode(100, new BinaryTreeNode(50, new BinaryTreeNode(25), new BinaryTreeNode(75)),
		    				new BinaryTreeNode(200, new BinaryTreeNode(125), new BinaryTreeNode(300)));
		    
		    List<Integer> input2 = new ArrayList<Integer>();
		    input2.add(1);input2.add(2);input2.add(10);input2.add(50);input2.add(180);input2.add(199);
		    BinaryTreeNode root2  = new BinaryTreeNode(100, new BinaryTreeNode(50, new BinaryTreeNode(25), new BinaryTreeNode(75)),
					new BinaryTreeNode(200, new BinaryTreeNode(125), new BinaryTreeNode(300)));
		    
		    //BinaryTree.displayLevelOrder(root1);

		    //BinaryTree.displayLevelOrder(root2);
		  
		    new InorderIterator(root1).inorderUsingIterator(root1);
		  }
	}

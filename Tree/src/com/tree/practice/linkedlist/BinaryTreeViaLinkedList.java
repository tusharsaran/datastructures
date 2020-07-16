package com.tree.practice.linkedlist;

/**
 * @author tusharsaran
 * this is a Queue class for tree
 */
public class BinaryTreeViaLinkedList<E>{
	
	BinaryNode<E> root;
	
	/**
	 * create : creating a binary tree , here we are only create an object of the tree, so the root is equal to null
	 * 
	 */
	public BinaryTreeViaLinkedList<E> createTree() {
		root = null;
		System.out.printf("%s\n", "Successfully created Binary Tree");
		return new BinaryTreeViaLinkedList<>();
	}
	
	/**
	 * delete : delete a binary tree
	 * 
	 */
	public void deleteTree() {
		root = null;
		System.out.printf("%s\n", "Successfully deleted Binary Tree");
		
	}
	
	
	/**
	 * preOrder traversal : this functionality is achieved using recursion(Stack) 
	 * in this we will traverse in the following way:
	 * 		- root
	 * 		- left subtree
	 * 		- right subtree
	 * 
	 * @param node
	 * 
	 */
	public void preOrder(BinaryNode<E> node) {
		if(node == null) {
			return;
		}
		System.out.printf("%s\n", "node data is " + node.data);
		//we will use recursion here
		preOrder(node.left);
		preOrder(node.right);
	}
	
	/**
	 * inOrder traversal : this functionality is also achieved using recursion(Stack) like preOrder Traversal
	 * in this we will traverse in the following way:
	 * 		- left subtree
	 * 		- root
	 * 		- right subtree
	 * 
	 * @param node
	 * 
	 */
	public void inOrder(BinaryNode<E> node) {
		if(node == null) {
			return;
		}
		//we will use recursion here
		preOrder(node.left);
		System.out.printf("%s\n", "node data is " + node.data);
		preOrder(node.right);
	}
	
	/**
	 * postOrder traversal : this functionality is also achieved using recursion(Stack) like preOrder , inOrder Traversal
	 * in this we will traverse in the following way:
	 * 		- left subtree
	 * 		- right subtree
	 * 		- root
	 * 
	 * @param node
	 * 
	 */
	public void postOrder(BinaryNode<E> node) {
		if(node == null) {
			return;
		}
		//we will use recursion here
		preOrder(node.left);
		preOrder(node.right);
		System.out.printf("%s\n", "node data is " + node.data);
	}
	
	/**
	 * levelOrder traversal : this functionality is achieved using Queue 
	 * in this we will traverse level by level
	 * 
	 * 
	 * @param node
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void levelOrder(BinaryNode<E> node) {
		if(node == null) {
			return;
		}
		Queue<BinaryNode> queue =  new Queue<>();
		queue.enQueue(node);
		while(!queue.isEmpty()) {
			BinaryNode<E> currentNode = queue.deQueue();
			System.out.printf("%s\n", "current node data is " + currentNode.data);
			if(currentNode.left != null) {
				queue.enQueue(currentNode.left);
			}
			if(currentNode.right != null) {
				queue.enQueue(currentNode.right);
			}
		} //end of while loop
	}
	
	/**
	 * search : this search functionality is achieved using Queue 
	 * in this we will traverse level by level
	 * 
	 * @param data
	 * 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void search(E data) {
		if(root == null) {
			return;
		}
		Queue<BinaryNode> queue =  new Queue<>();
		queue.enQueue(root);
		while(!queue.isEmpty()) {
			BinaryNode<E> currentNode = queue.deQueue();
			System.out.printf("%s\n", "current node data is " + currentNode.data);
			
			if(currentNode.data == data) {
				System.out.printf("%s\n", "data found... ");
				return;
			}
			else if (currentNode.getLeft() != null) {
				queue.enQueue(currentNode.left);
			} else if (currentNode.getRight() != null) {
				queue.enQueue(currentNode.right);
			}
			
		} //end of while loop
		System.out.printf("%s\n", "data not found... ");
	}

}

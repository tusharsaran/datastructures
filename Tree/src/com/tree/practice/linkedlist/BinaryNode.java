/**
 * 
 */
package com.tree.practice.linkedlist;

/**
 * @author tusharsaran
 * this is node class of binary tree
 */
public class BinaryNode<E>{
	
	public E data;
	public BinaryNode<E> left;
	public BinaryNode<E> right;
	
	public BinaryNode(){
		
	}
	
	public BinaryNode(E data){
		this.data = data;
	}
	
	public E getData() {
		return this.data;
	}
	
	public BinaryNode<E> getLeft(){
		return this.left;
	}
	
	public BinaryNode<E> getRight(){
		return this.right;
	}
	@Override
	public String toString() {
		return "BinaryNode[data = " + data + "]";
	}
}

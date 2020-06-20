/**
 * 
 */
package com.stack.practice.likedlist;

/**
 * @author tusharsaran
 * this is a node class used by stack class
 */
public class Node<E> {
	
	public E data;
	public Node<E> next;
	
	public Node(E data) {
		this.data = data;
	}
	
	public E getData() {
		return this.data;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
}

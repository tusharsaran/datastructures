/**
 * 
 */
package com.queue.practice.linkedlist;

/**
 * @author tusharsaran
 *	this is a node class of Singly linked list.
 *	It contains 2 important elements :
 *		- data - is the data that is inserted in the linked list. Here we have taken a Generic type/Element (E) data.
 *		- next - next will point to the next address of the node
 */
public class Node<E>{
	
	public E data;
	public Node<E> next;
	

	public Node(E data){
	this.data = data;
	}
	
	public E getData() {
		return this.data;
	}
	
	public Node<E> getNext(){
		return this.next;
	}
	
	@Override
	public String toString() {
		return "Node [data= " + data + "]";
	}
	
	

}

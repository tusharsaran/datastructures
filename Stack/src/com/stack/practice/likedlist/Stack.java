/**
 * 
 */
package com.stack.practice.likedlist;

import com.stack.practice.array.StackException;

/**
 * @author tusharsaran
 * 
 *this is a stack class implemented using linked list -- LAST IN FIRST OUT
 */
public class Stack<E> {
	
	Node<E> top = null;
	Node<E> tail = null;
	int size = 0;
	
	/**
	 * creating a stack
	 * @param size
	 */
	public void create(E data) {
		if (top == null) {
			Node<E> node = new Node<>(data);
			top  = node;
			tail = node;
			size  ++;
			System.out.println("Stack successfully cretaed");
		}
	}
	
	/**
	 * pushing/inserting value in a stack
	 * @param data
	 */
	public void push(E data){
		if(top ==  null) {
			create(data);
		}
		Node<E> node = new Node<>(data);
		node.next = top;
		top = node;
		size ++;
		System.out.println("Successfully inserted " + data +  " in stack");
	}
	
	/**
	 * pop/remove value from stack
	 */
	public void pop() {
		if(top == null) {
			throw new StackException("no stack created");
		}else if (isEmptyStack()) {
			throw new StackException("stack underflow error");
		}else {
			System.out.println(top.data);
			System.out.println("Successfully pop " + top.data + " from stack");
			top = top.next;
			size --;
		}
	}
	
	/**
	 * is stack empty
	 */
	public boolean isEmptyStack() {
		return (top == null ? true : false) ;
	}


	/**
	 * is stack empty
	 */
	public boolean isFullStack() {
			//return (topOfStack  == stack.length - 1 ? true : false);
		return true;
		
	}
	
	/**
	 * delete stack
	 */
	public void delete() {
		top  = null;
		tail = null;
		size  = 0;
		System.out.println("Stack successfully deleted");
	}
	
	/**
	 * returns the element at the top of the Stack else return null
	 */
	public E peek() {
		if(isEmptyStack()) {
			return null;
		}else {
			return top.data;
		}
	}
	
	/**
	 * size of the stack
	 */
	public int size() {
		return size;
	}
	 
			
}

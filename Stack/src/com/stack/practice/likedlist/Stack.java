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
	
	Node<E> head = null;
	Node<E> tail = null;
	int size = 0;
	
	/**
	 * creating a stack
	 * @param size
	 */
	public void create(E data) {
		if (head == null) {
			Node<E> node = new Node<>(data);
			head  = node;
			tail = head;
			size  ++;
			System.out.println("Stack successfully cretaed");
		}
	}
	
	/**
	 * pushing/inserting value in a stack
	 * @param data
	 */
	public void push(E data){
		if(head ==  null) {
			create(data);
		}
		Node<E> current  = head;
		while(current.next != null) {
			current = current.next;
		}
		Node<E> node = new Node<>(data);
		current.next = node;
		tail = node;
		size ++;
		
		System.out.println("Successfully inserted " + data +  " in stack");
	}
	
	/**
	 * pop/remove value from stack
	 */
	public void pop() {
		if(head == null) {
			throw new StackException("no stack created");
		}else if (isEmptyStack()) {
			throw new StackException("stack underflow error");
		}else {
			topOfStack --;
			System.out.println("Successfully pop " + stack[topOfStack] + " from stack");
		}
	}
	
	/**
	 * is stack empty
	 */
	public boolean isEmptyStack() {
		return (size == 0 ? true : false) ;
	}


	/**
	 * is stack empty
	 */
	public boolean isFullStack() {
		if(stack != null) {
			return (topOfStack  == stack.length - 1 ? true : false);
		}
		return false;
		
	}
	
	/**
	 * delete stack
	 */
	public void delete() {
		stack  = null;
		topOfStack = -1;
		System.out.println("Stack successfully deleted");
	}
	
	/**
	 * returns the element at the top of the Stack else return null
	 */
	public E peek() {
		if(isEmptyStack()) {
			return null;
		}else {
			return stack[topOfStack];
		}
	}
	
	/**
	 * size of the stack
	 */
	public int size() {
		return size;
	}
	 
			
}

/**
 * 
 */
package com.stack.practice.array;

/**
 * @author tusharsaran
 * 
 *this is a stack class implemented using array
 */
public class Stack<E> {
	
	
	public int topOfStack = -1;
	public E[] stack  = null;
	
	
	/**
	 * creating a stack
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public void create(int size) {
		this.stack = (E[]) new Object[size];
		topOfStack = -1;
		System.out.println("Stack successfully cretaed");
	}
	
	/**
	 * pushing/inserting value in a stack
	 * @param data
	 */
	public void push(E data){
		if(stack == null) {
			throw new StackException("no stack created");
		}else {
			if(isFullStack()) {
				throw new StackException("stack overflow error");
			}else {
				stack[topOfStack + 1] = data;
				topOfStack ++;
				System.out.println("Successfully pushed " +  data + " in the stack");
			}
		}
	}
	
	/**
	 * pop/remove value from stack
	 */
	public void pop() {
		if(stack == null) {
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
		return (topOfStack == -1 ? true : false) ;
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
		if(isEmptyStack()) {
			return 0;
		}else {
			return topOfStack + 1;
		}
	}
			
}

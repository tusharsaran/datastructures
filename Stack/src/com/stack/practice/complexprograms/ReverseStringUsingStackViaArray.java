/**
 * 
 */
package com.stack.practice.complexprograms;

/**
 * @author tusharsaran
 *	this is a class to reverse string using Stack (Array)
 */
public class ReverseStringUsingStackViaArray {
	
	public class Stack<E>{
		int topOfStack = -1;
		E[] stack = null;
		
		@SuppressWarnings("unchecked")
		public void create(int size) {
			if(topOfStack == -1) {
				stack = (E[]) new Object[size];
				System.out.println("Stack created successfully");
			}
		}
		
		public void push(E data) {
			if(stack == null) {
				System.out.println("Stack is not created");
			}
			if(topOfStack == stack.length -1) {
				System.out.println("Stack overflow error ");
			}
			stack[topOfStack + 1] = data;
			topOfStack ++;
			System.out.println("Successfully inserted data  "+ data );
		}
		
		
		public E pop() {
			int count  = topOfStack;
			if(stack == null) {
				System.out.println("Stack is not created");
			}
			if(topOfStack == -1) {
				System.out.println("Stack underflow error ");
			}
			System.out.println("Successfully removed data  "+ stack[topOfStack] );
			topOfStack --;
			return stack[count];
			
			
		}
		
		public E peek() {
			if(stack == null) {
				System.out.println("Stack is not created");
			}
			if(topOfStack == -1) {
				System.out.println("Stack underflow error");
			}
			System.out.println("Successfully peek data  "+ stack[topOfStack] );
			return stack[topOfStack];
		}
		
	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		String word  = "Beautiful";
		reverseString(word);
		reverseStringBetterApproach(word);
		
		
		

	}
	
	/**
	 * this method is to reverese the string usingn Stack array
	 * @param word
	 * time Complexity  : O(n)
	 * space complexity  : O(n)
	 */
	public static void reverseString(String word) {
		char[] output = new char[word.length()];
		ReverseStringUsingStackViaArray rs = new ReverseStringUsingStackViaArray();
		
		Stack<Character> stack = rs.new Stack<>();
		stack.create(word.length());
		
		char[] wordChars =  word.toCharArray(); 
		
		for(int i = 0; i < wordChars.length; i++) {
			stack.push(wordChars[i]);
		}
		
		System.out.println("::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::");
		
		for(int j = 0; j < wordChars.length;  j++) {
			output[j] = stack.pop();
		}
	}
	
	
	/**
	 * this method is to reverese the string and is a better approach usinng Stack array
	 * @param word
	 * time Complexity  : O(n)
	 * space complexity  : O(1)
	 */
	public static void reverseStringBetterApproach(String word) {
		char[] output = new char[word.length()];
		char[] wordChars = word.toCharArray();
		int j = wordChars.length - 1;

		System.out.println("::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::");

		for (int i = 0; i < wordChars.length; i++) {
			if (i < j) {
				output[i] = wordChars[j];
				output[j] = wordChars[i];
				j --;
			}else {
				output[i] = wordChars[i];
				break;
			}
		}
		for (int x = 0; x < output.length; x++) {
			System.out.println("output value is " + output[x]);
		}

	}
}

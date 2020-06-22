/**
 * 
 */
package com.stack.practice.complexprograms;

/**
 * @author tusharsaran this is a class to check the Balance Parenthesis using
 *         Stack(via linked list). [A+B] - balanced [(]) - not balanced
 */
public class BalancedParenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expression = "[(A+B)+(C+D)]";
		System.out.println(isBalanced(expression));

	}

	public static Boolean isBalanced(String expression) {
		char[] expressionChar = expression.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expressionChar.length; i++) {
			if (expressionChar[i] == '{' || expressionChar[i] == '(' || expressionChar[i] == '[') {
				// inserting parenthesis in stack
				stack.push(expressionChar[i]);
			} else if (expressionChar[i] == '}' || expressionChar[i] == ')' || expressionChar[i] == ']') {
				if(stack.top ==  null){
					return false;
				}else {
					char topValue = stack.top.data;
					if((topValue == '{' && expressionChar[i] == '}') || (topValue == '(' && expressionChar[i] == ')') || (topValue == '[' && expressionChar[i] == ']')) {
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}
		return stack.top == null ? true : false;
	}
}

class Node<E> {

	public E data;
	public Node<E> next;

	public Node() {
	}

	public Node(E data) {
		this.data = data;
	}

	public E getData(E data) {
		return this.data;
	}

	public Node<E> getNext() {
		return this.next;
	}

	public String toString() {
		return "Node [data = " + data + "]";
	}

}

class Stack<E> {

	Node<E> top = null;
	Node<E> tail = null;
	int size = 0;

	/**
	 * creating a node
	 */
	public  Stack() {
			System.out.println("Success created stack");
	}

	// 5|10 10|null
	/**
	 * pushing or inserting record in stack
	 */
	public void push(E data) {
		Node<E> node = new Node<>(data);
		node.next = top;
		top = node;
		size++;
		System.out.println("Successfully inserted data  " + data + " in stack");

	}

	/**
	 * pop or removing record from stack
	 */
	public E pop() {
		if (top == null) {
			System.out.println("Stack underflow error");
		}
		Node<E> temp = top; // (|null
		top = top.next;
		System.out.println("Successfully removed data  " + temp.data + " in stack");
		size--;
		return temp.data;
	}

	/**
	 * return the size of a stack
	 */
	public int size() {
		return this.size;
	}

}

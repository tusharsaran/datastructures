/**
 * 
 */
package com.stack.practice.complexprograms;

import com.stack.practice.complexprograms.InfixToPostfix.Node;
import com.stack.practice.complexprograms.InfixToPostfix.Stack;

/**
 * @author tusharsaran
 * this class is to convert a postfix expression to infix expression
 *  
 *  logic for converting postfix to infix is
 *  	- loop the expression 
 *  	- enter the operand in stack
 *  	- once operator is found take the top 2 operand from the stack and append in string like  <Second top operand> <operator> <first top operand>   
 *
 */
public class PostfixToInfix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expression = "2 3 3 * + 5 6 / +";
		 //postfix output =   2+3*3+5/6; 
		System.out.println(infixtoPostfix(expression));
	}

	public static String infixtoPostfix(String exp) {
		StringBuilder output = new StringBuilder();
		Stack<String> stack = new Stack<String>();

		char[] expressionChar = exp.replaceAll("\\s", "").toCharArray();
		for (int i = 0; i < expressionChar.length; i++) {
			if (isExpressionCharOperand(expressionChar[i])) {
				stack.push(expressionChar[i] + "");
			}else {
				String firstTopStack = stack.pop(); 
				String SecondTopStack = stack.pop(); 
				stack.push(SecondTopStack + expressionChar[i]  + firstTopStack);
				}
			}
		while(stack.top != null) {
			output.append(stack.top.data);
			stack.pop();
			output.append(" ");
		}
		return output.toString();
	}

	
	private static boolean isExpressionCharOperand(char expressionChar) {
		return (expressionChar == '/' || expressionChar == '*' || expressionChar == '+' || expressionChar == '-'
				|| expressionChar == '^') ? false : true;
	}

	static class Node<E> {

		E data;
		Node<E> next;

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
			return "Node [data =" + data + "]";
		}

	}

	static class Stack<E> {

		Node<E> top = null;
		int size = 0;

		// 2 3 4
		public void push(E data) {
			if (top == null) {
				System.out.println("Stack underflow error");
			}
			Node<E> node = new Node<>(data); // 4|3 3|2 2|null
			node.next = top;
			top = node;
			size++;
			System.out.println("Successfully inserted data  " + data + " from stack");
		}

		public E pop() {
			System.out.println("Successfully removed data  " + top.data + " from stack");
			Node<E> current = top;
			top = top.next;
			size--;
			return current.data;
		}

		public int size() {
			return size;
		}

	}

}

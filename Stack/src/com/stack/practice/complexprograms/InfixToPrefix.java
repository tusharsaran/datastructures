/**
 * 
 */
package com.stack.practice.complexprograms;

import com.stack.practice.complexprograms.InfixToPostfix.Node;
import com.stack.practice.complexprograms.InfixToPostfix.Stack;

/**
 * @author tusharsaran
 *
 */
public class InfixToPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expression = "2+3*3+5/6";
		// prefix output =   + 2 *33 + / 5 6 =>  + + 2 * 33 /5 6
		System.out.println(infixtoPrefix(expression));
	}

	public static String infixtoPrefix(String exp) {
		StringBuilder output = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();

		char[] expressionChar = exp.toCharArray();
		for (int i = expressionChar.length - 1; i >= 0; i--) {
			if (isExpressionCharOperand(expressionChar[i])) {
				output.append(expressionChar[i]);
				output.append(" ");
			}else {
				while(stack.top != null && stackTopHasMoreprecence(expressionChar[i], stack.top.data)) {
					output.append(stack.top.data);
					stack.pop();
					output.append(" ");
				}
				stack.push(expressionChar[i]);
			}
		}
		while(stack.top != null) {
			output.append(stack.top.data);
			stack.pop();
			output.append(" ");
		}
		
		
		Stack<Character> finalStack = new Stack<>();
		char[] outputChar =  output.toString().toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(int j = 0; j < outputChar.length; j++) {
			finalStack.push(outputChar[j]);
		}

		while(finalStack.top != null) {
			result.append(finalStack.top.data);
			finalStack.pop();
			result.append(" ");
		}
		return result.toString();
	}

	private static boolean stackTopHasMoreprecence(char expChar , char stackTop) {
		int expCharValue = convertOperatorToInt(expChar);
		int stackTopValue = convertOperatorToInt(stackTop);
		if(stackTopValue > expCharValue) {
			return true;
		}
		return false;
		
	}
	
	private static int convertOperatorToInt(char operator) {
		int value = 0;
		switch(operator){
		
		case '+' : 
			value =  0;
			break;
		
		case '-' : 
			value =  0;
			break;	
		
		case '*' : 
			value =  1;
			break;
	
		case '/' : 
			value =  1;
			break;	
	
		case '^' : 
			value =  2;
			break;	
		
		default : 
			value  = -1;
			break;
		}
		
		return value;
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
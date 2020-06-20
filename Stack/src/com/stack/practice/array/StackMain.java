/**
 * 
 */
package com.stack.practice.array;

/**
 * @author tusharsaran
 * this is the main class of stack implemented uing array
 */
public class StackMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<Integer> empId = new Stack<>();
		System.out.println("Stack size " + empId.size());
		//stack created
		empId.create(5);
		
		System.out.println("Stack empty " + empId.isEmptyStack());
		System.out.println("Stack size " + empId.size());
		
		empId.push(22232);
		empId.push(102);
		empId.push(1);
		empId.push(10);
		
		System.out.println("Stack empty " + empId.isEmptyStack());
		System.out.println("Stack full " + empId.isFullStack());
		System.out.println("Stack size " + empId.size());
		
		empId.push(20);
		
		System.out.println("Stack full " + empId.isFullStack());
		System.out.println("Stack size " + empId.size());
		
		System.out.println("stack peek element is " + empId.peek());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		empId.pop();

		
		System.out.println("Stack full " + empId.isFullStack());
		System.out.println("Stack size " + empId.size());
		
		System.out.println("stack peek element is " + empId.peek());
		
		empId.delete();

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println("Stack size " + empId.size());
		System.out.println("Stack empty " + empId.isEmptyStack());
		System.out.println("Stack full " + empId.isFullStack());
		
		System.out.println("stack peek element is " + empId.peek());

	}

}

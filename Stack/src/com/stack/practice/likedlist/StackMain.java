/**
 * 
 */
package com.stack.practice.likedlist;

/**
 * @author tusharsaran
 * this is the main class of stack implemented using linked linked
 */
public class StackMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<Integer> empId = new Stack<>();
		System.out.println("Stack size " + empId.size());
		System.out.println("Stack empty " + empId.isEmptyStack());
		//stack created
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		empId.create(7);
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println("Stack empty " + empId.isEmptyStack());
		System.out.println("Stack size " + empId.size());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		empId.push(22232);
		empId.push(102);
		empId.push(1);
		empId.push(10);
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println("Stack empty " + empId.isEmptyStack());
		System.out.println("Stack full " + empId.isFullStack());
		System.out.println("Stack size " + empId.size());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		empId.push(20);
		
		System.out.println("Stack full " + empId.isFullStack());
		System.out.println("Stack size " + empId.size());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Node<Integer> current = empId.top;
		for(int i = 0; i< empId.size(); i++) {
			System.out.println("data is " + current.data );
			System.out.println("next node is " + current.next);
			current = current.next;
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		System.out.println("stack peek element is " + empId.peek());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		empId.pop();

		
		System.out.println("Stack full " + empId.isFullStack());
		System.out.println("Stack size " + empId.size());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Node<Integer> updatedNode = empId.top;
		for(int i = 0; i< empId.size(); i++) {
			System.out.println("data is " + updatedNode.data );
			System.out.println("next node is " + updatedNode.next);
			updatedNode = updatedNode.next;
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		System.out.println("stack peek element is " + empId.peek());
		
		empId.pop();
		empId.pop();
		empId.pop();
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		updatedNode = empId.top;
		for(int i = 0; i< empId.size(); i++) {
			System.out.println("data is " + updatedNode.data );
			System.out.println("next node is " + updatedNode.next);
			updatedNode = updatedNode.next;
		}
		
		empId.delete();

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println("Stack size " + empId.size());
		System.out.println("Stack empty " + empId.isEmptyStack());
		System.out.println("Stack full " + empId.isFullStack());
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		updatedNode = empId.top;
		for(int i = 0; i< empId.size(); i++) {
			System.out.println("data is " + updatedNode.data );
			System.out.println("next node is " + updatedNode.next);
			updatedNode = updatedNode.next;
		}
		
		System.out.println("stack peek element is " + empId.peek());

	}

}

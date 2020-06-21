/**
 * 
 */
package com.linkedlist.practice.complex.programs;

import com.linkedlist.model.Node;
import com.linkedlist.practice.SingleLinkedList;

/**
 * @author tusharsaran
 *  traversing singly linked list using recursion
 *
 */
public class TraversingUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 SingleLinkedList node = new  SingleLinkedList();
		 node.create(10);
		 node.add(3);
		 node.add(21);
		 node.add(23);
		 
		 Node current = node.head;
		 node.traversingLinkedListByRecursion(current);
		 System.out.println("::::::::::::::::::::::::::::::::");
		 System.out.println("::::::::::::::::::::::::::::::::");
		 
		 node.traversingReverseLinkedListByRecursion(current);
	}
	
	
	
	
	
	

}

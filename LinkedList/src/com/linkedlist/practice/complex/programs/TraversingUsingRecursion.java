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
		 node.create(2);
		 node.add(6);
		 node.add(5);
		 node.add(4);
		 
		 Node current = node.head;
		 node.traversingLinkedListByRecursion(current);
		 System.out.println("::::::::::::::::::::::::::::::::");
		 System.out.println("::::::::::::::::::::::::::::::::");
		 
		 node.traversingReverseLinkedListByRecursion(current);
		 
		 System.out.println("::::::::::::::::::::::::::::::::");
		 System.out.println("::::::::::::::::::::::::::::::::");
		 
		 Node currentNode = node.head;
		for(int i = 0;  i < node.size() ; i++) {
			 System.out.println("Before reversal the node is " + currentNode.data);
			 System.out.println("Before reversal the node next value  is " + currentNode.next);
			 currentNode = currentNode.next;
		 }
		 
		 System.out.println("::::::::::::::::::::::::::::::::");
		 System.out.println("::::::::::::::::::::::::::::::::");
		 
		 /*node.reverseLinkedListRecursion(node.head);
		
		 Node currentNodereversed = node.head;
		 for(int i = 0;  i < node.size() ; i++) {
			 System.out.println("After reversal the node is " + currentNodereversed.data);
			 System.out.println("After reversal the node next value  is " + currentNodereversed.next);
			 currentNodereversed = currentNodereversed.next;
		 }
		 */
		 
		 
		 System.out.println("::::::::::::::::::::::::::::::::");
		 System.out.println("::::::::::::::::::::::::::::::::");
		 
		 node.reverseAnotherApproach(node.head);
		
		 Node n = node.head;
		 for(int i = 0;  i < node.size() ; i++) {
			 System.out.println("After reversal the node is " + n.data);
			 System.out.println("After reversal the node next value  is " + n.next);
			 n = n.next;
		 }
	}
	
	
	
	
	
	

}

package com.linkedlist.practice;

import com.linkedlist.model.Node;


/**
 * @author tusharsaran
 * 
 *         this is the main class of circular Linked List from where we are going to invoke all the
 *         linked list operations
 */
public class CircularLinkedListMain {

	public static void main(String[] args) {
		CircularSingleLinkedList csll = new CircularSingleLinkedList();
		csll.create(21);
		
		csll.add(54);
		csll.addFirst(5);
		csll.add(100,2);
		csll.add(20,4);
		csll.add(1);
		try {
			System.out.println("getting data from node 2  :" + csll.get(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			csll.remove(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		csll.clear();
		Node current = csll.head;
		for(int i = 0 ; i < csll.size(); i++) {
			System.out.println(current.data);
			System.out.println(current.next.toString());
			current = current.next;
		}
		
	}

}

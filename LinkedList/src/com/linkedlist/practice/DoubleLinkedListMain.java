/**
 * 
 */
package com.linkedlist.practice;

import com.linkedlist.model.DoubleNode;

/**
 * @author tusharsaran
 *
 *this is double linked list main class
 */
public class DoubleLinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleLinkedList dll =  new DoubleLinkedList();
		dll.create(2);
		
		dll.addLast(6);
		dll.addFirst(100);
		dll.add(200,2);
		
		DoubleNode current = dll.head;
		for(int i =  0; i < dll.size ;  i++) {
			
			System.out.println(current.prev);
			System.out.println(current.data);
			System.out.println(current.next);
			
			current = current.next;
			
		}
		
		try {
			System.out.println("node is ::::::::: " + dll.get(1));
			System.out.println("reverse traversal is ::::::::: " + dll.get(4));
			dll.remove(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		dll.clear();
		DoubleNode current1 = dll.head;
		for(int i =  0; i < dll.size ;  i++) {
			
			System.out.println(current1.prev);
			System.out.println(current1.data);
			System.out.println(current1.next);
			
			current1 = current1.next;
			
		}

	}

}

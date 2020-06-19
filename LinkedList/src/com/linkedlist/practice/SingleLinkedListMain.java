package com.linkedlist.practice;

import com.linkedlist.model.Node;

/**
 * @author tusharsaran
 * 
 *         this is the main class from where we are going to invoke all the
 *         linked list operations
 */
public class SingleLinkedListMain {

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.create(24);

		// inserting nodes
		sll.add(4);
		sll.add(10);
		sll.add(1);
		sll.add(25);
		sll.addLast(96);
		sll.addFirst(32);
		sll.addLast(26);
		sll.add(56, 7);

		Node current = sll.head;
		for (int i = 0; i < sll.size(); i++) {
			System.out.println("values in linked list " + current.getData());
			System.out.println("nodes in linked list " + current.getNode());
			if (current.next != null)
				current = current.next;

		}

		System.out.println("first element :: " + sll.element());
		System.out.println("get first :: " + sll.getFirst());
		System.out.println("last element :: " + sll.getLast());
		System.out.println("get value based on index :: " + sll.get(6));
		System.out.println("index of :: " + sll.indexOf(960));
		System.out.println("size of the list before deleting "  + sll.size());
		//sll.removeFirst();
		System.out.println("size of the list after deleting first node "  + sll.size());
		//sll.removeLast();
		System.out.println("size of the list after deleting last node "  + sll.size());
		sll.remove(3);
		System.out.println("size of the list after deleting node from any location "  + sll.size());

		/*
		 * sll.clear(); 
		 */

		current = sll.head;
		for (int i = 0; i < sll.size(); i++) {
			System.out.println("values in linked list " + current.getData());
			System.out.println("nodes in linked list " + current.getNode());
			if (current.next != null)
				current = current.next;

		}
	}

}

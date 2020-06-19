/**
 * 
 */
package com.linkedlist.practice;

import com.linkedlist.model.Node;

/**
 * @author tusharsaran
 *
 *         this is a linked list class. Now before creating a linked list there
 *         are couple of steps to perform: - Create head and tail and assign the
 *         value as Null. - Create a node and assign the data and next value as
 *         null - Assign the head and tail to node.
 */
public class SingleLinkedList {

	Node head = null;
	Node tail = null;
	int size = 0;

	/**
	 * for creating a linked list
	 * 
	 * @param data
	 */
	public void create(int data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
			size++;
		} else {
			add(data);
		}
	}

	/**
	 * for inserting , adding or appending node in the list that is already created
	 * 
	 * @param data
	 */
	public void add(int data) {
		if (head == null) {
			create(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		tail = current.next;
		size++;
	}

	/**
	 * add first in linked list
	 * 
	 * @param data
	 */
	public void addFirst(int data) {
		if (head != null) {
			Node current = head;
			head = new Node(data);
			head.next = current;
			size++;
		} else {
			create(data);
		}
	}

	/**
	 * add Last in linked list
	 * 
	 * @param data
	 */
	public void addLast(int data) {
		add(data);
	}

	// size of linked list
	public int size() {
		return size;
	}

	/**
	 * add node in the specific location in linked list
	 * 
	 * @param data
	 * @param location
	 */
	public void add(int data, int location) {
		int count = 1;
		Node prev = null;
		Node current = head;
		while (count < location) {
			prev = current;
			current = current.next;
			count++;
		}
		Node node = new Node(data);
		node.next = current;
		prev.next = node;
		size++;

	}

	/**
	 * retrieving the first element or head of the list
	 */
	public int element() {
		return head.data;
	}

	/**
	 * deleting the node from the list and clearing out the entire list
	 */
	public void clear() {
		this.head = null;
		this.tail = null;
		size = 0;
	}

	/**
	 * retrieving the first element or head of the list
	 */
	public int getFirst() {
		return element();
	}

	/**
	 * retrieving the last element or tail of the list
	 */
	public int getLast() {
		return tail.data;
	}

	/**
	 * retrieving the element based on the index from the list
	 */
	public int get(int index) {
		int count = 0;
		Node current = head;
		while (count != index) {
			current = current.next;
			count++;
		}
		return current.data;
	}

	
	
	/**
	 * retrieving the index from the list
	 */
	public int indexOf(int data) {
		int index = 0;
		Node current = head;
		if (head != null) {
			while (current != tail) {
				if (current.data == data) {
					return index;
				} else {
					current = current.next;
					index++;
				}

			}
		}
		return current.data == data ? index++ : -1;
	}

	
	/**
	 * removing the first node from the list
	 */
	public void removeFirst() {
		Node current  = head;
		head = current.next;
		current = null;
		
		size--;
	}

	
	/**
	 * removing the last node from the list
	 */
	public void removeLast() {
		Node current  = head;
		Node prev = null;
		while (current !=  tail) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		tail = null;
		size--;
	}
	
	
	/**
	 * removing the node from the list based on the index
	 */
	public void remove(int index) {
		int count = 0;
		Node prev = null;
		Node current =  head;
		while (count < index - 1) {
			prev = current;
			current = current.next;
			count++;
		}
		prev.next = current.next;
		current = null;
		size--;
	}
	
	
	// TODO addall, addall, contains , contains all

}

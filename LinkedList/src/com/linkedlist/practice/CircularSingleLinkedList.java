package com.linkedlist.practice;

import com.linkedlist.model.Node;


/**
 * @author tusharsaran
 * 
 *         this is the class of Circular linked list operations
 */
public class CircularSingleLinkedList {
	Node head;
	Node tail;
	int size;

	/**
	 * creating linked list
	 * @param data
	 */
	public void create(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = head;
			tail  = head;
			size ++;
			
		}
	}
	
	
	/**
	 * adding node in linked list
	 * @param data
	 */
	public void add(int data) {
		if(head  ==  null) {
			create(data);
		}else {
			Node current = head;
			while(current.next != head) {
				current = current.next;
			}
			Node node = new Node(data);
			node.next = head;
			current.next = node;
			tail = node;
			size ++;
		}
	}
	
	/**
	 * adding node in first place in linked list
	 * @param data
	 */
	public void addFirst(int data) {
		if(head  ==  null) {
			create(data);
		}else {
			Node current = head;
			Node node = new Node(data);
			node.next = head;
			while(current.next !=  head) {
				current = current.next;
			}
			
			current.next = node;
			head = node;
			size ++;
		}
	}
	//5, 21, 54
	/**
	 * adding node in a particular location in linked list
	 * @param data
	 * @param location
	 */
	public void add(int data, int location) {
		if(head  ==  null) {
			create(data);
		}else {
			int count = 0;
			Node prev = null;
			Node current = head;
			while(count <  location - 1) {
				prev  = current;
				current = current.next;
				count ++;
			}
			Node node = new Node(data);
			node.next = current;
			prev.next = node;
			size ++;
		}
	}
	
	
	/**
	 * retrieving node based on location in linked list
	 * @param location
	 */
	public int get(int location) throws Exception{
		int count = 0;
		Node current = head;
		if(location <=  size) {
			while (count < location - 1) {
				current = current.next;
				count ++;
			}
			return current.data;
		}else {
			throw new Exception("no records available in this location");
		}
	}
	
	/**
	 * removing node based on location in linked list
	 * @param location
	 */
	public void remove(int location) throws Exception{
		int count = 0;
		Node prev = null;
		Node current = head;
		if(location <=  size) {
			while (count < location - 1) {
				prev = current;
				current = current.next;
				count ++;
			}
			prev.next = current.next;
			current  = null;
			if(location ==  size)
				tail  = prev;
			size --;
		}else {
			throw new Exception("no records available in this location");
		}
	}
	
	
	/**
	 * removing the entire list
	 */
	@SuppressWarnings("unused")
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
	
	
	/**
	 * linked list size
	 * 
	 */
	public int size() {
		return size;
	}
	

}

package com.linkedlist.practice;

import com.linkedlist.model.DoubleNode;

/**
 * @author tusharsaran
 *
 *         this is a Double linked list class. 
 */
public class DoubleLinkedList {

DoubleNode head = null;
DoubleNode tail = null;;
int size;

/**
 * creating double linked list
 * Now before creating a linked list there are couple of steps to perform: 
 * - Create head and tail and assign the
 *         value as Null. - Create a node and assign the data and next value as
 *         null - Assign the head and tail to node.
 * 
 * @param data
 */
public void create(int data) {
	if(head == null) {
		DoubleNode node =  new DoubleNode(data);
		head = node;
		tail = node;
		node.prev = node.next = null;
		size ++;
	}
}


/**
 * adding or inserting node as First node in double linked list
 * 
 * @param data
 */
public void addFirst(int data) {
	if(head == null) {
		create(data);
	}
	DoubleNode current =  head;
	DoubleNode node =  new DoubleNode(data);
	node.next = current;
	current.prev = node;
	head = node;
	size ++;
}


/**
 * adding or inserting node as Last element in double linked list
 * 
 * @param data
 */
public void addLast(int data) {
	if(head == null) {
		create(data);
	}
	DoubleNode current =  head;
	while(current.next !=  null) {
		current = current.next;
	}
	DoubleNode node =  new DoubleNode(data);
	node.prev =  current;;
	current.next = node;
	tail = node;
	size ++;
}

/**
 * adding or inserting node based on location in double linked list
 * 
 * @param data
 * @param location
 */
public void add(int data, int location) {
	if(head == null) {
		create(data);
	}
	int count = 0;
	DoubleNode current =  head;
	DoubleNode prev = null; 
	while(count <  location - 1) {
		prev = current;
		if(current.next != null) {
			current = current.next;
		}else {
			current = null;
		}
		count ++;
	}
	DoubleNode node =  new DoubleNode(data);
	node.next =  current;
	if(location > 1 && location <= size) {
		node.prev =  current.prev;
		prev.next = node;
		current.prev = node;
	}else if (location >  size){
		node.prev = tail;
		tail.next =  node;
		tail = node;
	}else {
		node.next = head;
		head.prev = node;
		head = node;
	}
	size ++;
}


/**
 * retrieving node data based on location
 * @param location
 */
public int get(int location) throws Exception {
	int count = 0;
	DoubleNode current = head;
	if(location <= size  ) {
	while(count < location - 1) {
		current  = current.next;
		count ++;
	}
	return current.data;
	}else {
		throw new Exception("no node found");
	}
}


/**
 * retrieving node data based on location
 * @param location
 */
public int reverseTraversal(int location) throws Exception {
	int count = size;
	DoubleNode current = tail;
	if(location <= size) {
	while(count > location) {
		current  = current.prev;
		count --;
	}
	return current.data;
	}else {
		throw new Exception("no node found");
	}
}


/**
 * removing node based on location
 * @param location
 */
public void remove(int location) throws Exception {
	int count = 0;
	DoubleNode current = head;
	if(location <= size ) {
	while(count < location - 1) {
		current  = current.next;
		count ++;
	}
	if(count != 0 && count < size) {
	current.prev.next = current.next;
	current.next.prev = current.prev;
	}else if(count == size) {
		current.prev.next = null;
		tail = current.prev;
	}else {
		current.next.prev = null;
		head = current.next;
	}
	current = null;
	size --;
	}else {
		throw new Exception("no node found");
	}
	
}


/**
 *  clearing the entire linked list
 */
public void clear() {
	head = null;
	tail = null;
	size = 0;
}




}

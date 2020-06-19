package com.linkedlist.model;

/**
 * @author tusharsaran
 *
 *this is a node class that consists of 3 parts in linked list : data, prev and node address (here we have given the name as next)
 */
public class DoubleNode {

public int data;
public DoubleNode prev;
public DoubleNode next;

public DoubleNode(int data){
	this.data = data;
}

public int getData() {
	return data;
}

public DoubleNode getPrev() {
	return prev;
}

public DoubleNode getNext() {
	return next;
}

@Override
public String toString() {
	return "DoubleNode [data=" + data + "]";
}

}

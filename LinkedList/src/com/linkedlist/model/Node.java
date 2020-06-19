package com.linkedlist.model;

/**
 * @author tusharsaran
 *
 *this is a node class that consists of 2 parts in linked list : data and node address (here we have given the name as next)
 */
public class Node {

public int data;
public Node next;


public Node(){
}

public Node(int data){
	this.data = data;
}

public int getData() {
	return this.data;
}

public Node getNode() {
	return this.next;
}

@Override
public String toString() {
	return "Node [data=" + data + "]";
}



}

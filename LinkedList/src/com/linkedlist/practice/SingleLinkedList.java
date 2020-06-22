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

	public Node head = null;
	public Node tail = null;
	public int size = 0;
	public Node tempNode  = null;

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
		Node current = head;
		head = current.next;
		current = null;

		size--;
	}

	/**
	 * removing the last node from the list
	 */
	public void removeLast() {
		Node current = head;
		Node prev = null;
		while (current != tail) {
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
		Node current = head;
		while (count < index - 1) {
			prev = current;
			current = current.next;
			count++;
		}
		prev.next = current.next;
		current = null;
		size--;
	}

	/**
	 * traversing linked list using Recursion
	 */
	 public  void traversingLinkedListByRecursion(Node node) {
		if(head ==  null) {
			System.out.println("linked list is empty");
		}
		if(node == null) {
			return;
		}else {
			System.out.println("Node data is "+ node.data);
			System.out.println("Next node is "+ node.next);
			traversingLinkedListByRecursion(node.next);
			
		}
	}
	 
		/**
		 * traversing linked list in reverse order using Recursion
		 * reverse order means we are just printing the values
		 */
		 public  void traversingReverseLinkedListByRecursion(Node node) {
			if(head ==  null) {
				System.out.println("linked list is empty");
			}
			if(node == null) {
				return;
			}else {
				traversingReverseLinkedListByRecursion(node.next);
				System.out.println("Next node is "+ node.next);
				System.out.println("Node data is "+ node.data);
				
				
			}
		}
		 
		 /**
		  * reversing the linked list using iterative approach
		  * head 000 --> 2|001     6|002   	5|003   4|null		<----- tail
		  * head 003 --> 4|002     5|001   	6|000	2|null		<----- tail
		  * Time complexity: O(n)
		  * Space complexity : O(1)
		  */
		 public void reverseLinkedList() {
			 if(head ==  null) {
				 System.out.println("linked list is empty");
			 }
			 //000
			 Node current =  head;
			 Node prev = null;
			 Node temp = null;
			 while(current != null) {
				 temp = current;
				 current = current.next;
				 temp.next = prev;
				 prev = temp;
			 }
			 head = prev;
			 
		 }
		 
		 
		 /**
		  * reversing the linked list using recursive approach
		  * head 000 --> 2|001     6|002   	5|003   4|null		<----- tail
		  * head 003 --> 4|002     5|001   	6|000	2|null		<----- tail
		  * 
		  * Time complexity: O(n)
		  * Space complexity : O(n)
		  */
		 public void reverseLinkedListRecursion(Node headNode) {
			 
			 Node current =  headNode;
			 //Node prev = null;
			 Node temp = null;
			 
			 if(current.next == null) {
				 head  = headNode;
				 return;
			 }
			 else {
				reverseLinkedListRecursion(current.next);
				temp =  current.next;
				temp.next = current;
				current.next = null;
			 }
			 
		 }
		 
		 
		 
		 /**
		  * reversing the linked list using recursive approach
		  * head 000 --> 2|001     6|002   	5|003   4|null		<----- tail
		  * head 003 --> 4|002     5|001   	6|000	2|null		<----- tail
		  * 
		  * Time complexity: O(n)
		  * Space complexity : O(n)
		  */
		 public void reverseAnotherApproach(Node headNode) {
			 
			 Node current =  headNode;
			 //Node prev = null;
			 
			 if(current.next == null) {
				 head  = headNode;
				 tempNode = head;
				 return;
			 }
			 else {
				 tempNode =  current;
				 reverseAnotherApproach(current.next);
				tempNode.next = current;
				tempNode = current;
				tempNode.next  = null;
			 }
			 
		 }
	// TODO addall, addall, contains , contains all
		 
		// 4|null
		 //5|003
		 //6|002  
		// 2|001 - prev  - null
		 //main
		

}

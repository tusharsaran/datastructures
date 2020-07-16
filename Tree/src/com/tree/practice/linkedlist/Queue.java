package com.tree.practice.linkedlist;

/**
 * @author tusharsaran
 * this is a Queue class for tree
 */
public class Queue<E> {

	BinaryNode<E> head;
	BinaryNode<E> tail;
	int size;

	/**
	 * enQueue : inserting data in queue
	 * @param : data
	 *            
	 */
		public void enQueue(E data) {
			BinaryNode<E> node = new BinaryNode<>(data);
			if(isEmpty()) {
				head = node;
				tail = node;
			}
			tail.right = node;
			tail = node;
			size ++;
			System.out.printf("%s\n", "Successfully inserted the data " + data);
		}


	/**
	 * deQueue : deleting or removing first data from queue
	 * 
	 */
		public E deQueue() {
			if(isEmpty()) {
				throw new QueueException("Queue is empty");
			}
			System.out.printf("%s\n", "Successfully removed data " + head.data);
			BinaryNode<E> temp  = head;
			head = head.right;
			if(head == null)
				tail = null;
			size --;
			return temp.data;
		}
	
	/**
	 * peekInQueue : peeking the first data from queue
	 * return : the current data;
	 *            
	 */
		public E peekInQueue() {
			if(isEmpty()) {
				System.out.printf("%s\n", "Queue is empty");
				throw new QueueException("Queue is empty");
			}else {
				System.out.printf("%s\n", "Queue current data is " + head.data);
				return head.data;
			}
		}

	/**
	 * isEmpty : if the queue is empty
	 * @return : Boolean - true or false
	 */
		public Boolean isEmpty() {
			return head == null && tail == null ? true : false;
		}
	
	/**
	 * deleteQueue : deleting a Queue
	 * 
	 */
	 	public void deleteQueue() {
	 		head = null;
	 		tail = null;
	 		size = 0;
	 		System.out.printf("%s\n", "Successflly deleted Queue...");
	 	}

	/**
	 * size : size of a queue
	 * 
	 */
		public int size() {
			return this.size;
		}

}

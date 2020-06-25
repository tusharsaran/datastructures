/**
 * 
 */
package com.queue.practice.array;

/**
 * @author tusharsaran
 *	this is a queue class which is completely based on the concept of FIRST IN FIRST OUT
 *	this class is implemented using Array Data structure	
 *
 * 	Following operations are mentioned in this class:
 * 	
 * 		- createQueue
 * 		- isFull ------------------ only implemented in Arrays and is not applicable in Linked List
 * 		- isEmpty
 * 		- deleteQueue
 * 		- enQueue (insert)
 * 		- deQueue (remove)
 * 		- peekInQueue (get Queue data)
 *
 */
public class Queue<E> {
	
	public int beginingQueue = -1;
	public int endQueue = -1;
	public  E[] queue;

	public Queue(){
	}
	
	@SuppressWarnings("unchecked")
	public Queue(int size){
		queue = (E[]) new Object[size] ;
	}
	
	
	/**
	 * creating a queue
	 * @param size
	 *
	 */
	public  Queue<E> create(int size) {
		System.out.printf("%s%n", "Successfully created queue.");
		return new Queue<>(size);
		
	}
	
	
	/**
	 * check if queue is Full
	 *
	 */
	public Boolean isFull() {
		return endQueue == queue.length - 1 ? true : false;
	}
	
	
	/**
	 * check if queue is Empty
	 *
	 */
	public Boolean isEmpty() {
		return (endQueue == -1 && beginingQueue == -1) ? true : false;
	}
	
	
	/**
	 * delete the queue
	 *
	 */
	public void deleteQueue() {
		queue = null;
	}
	
	
	/**
	 * inserting data in queue
	 * @param data
	 *
	 */
	public void enQueue(E data) {
		if(isFull()) {
			return;
		}else {
			if(isEmpty()) {
				beginingQueue  = endQueue + 1;
			}
			queue[endQueue + 1] = data;
			endQueue  = endQueue + 1;
		}
		System.out.printf("%s%n", "Successfully inserted data " + data + " in queue.");
	}
	
	
	/**
	 * deleting data from queue
	 *
	 */
	public void deQueue() {
		if(isEmpty()) {
			return;
		}else if (beginingQueue == endQueue){
			beginingQueue = -1;
			endQueue = -1;
		}else {
			System.out.printf("%s%n", "Successfully removed data " + queue[beginingQueue] + " in queue.");
			beginingQueue = beginingQueue + 1;
		}
	}
	
	
	/**
	 * peek data from queue
	 *
	 */
	public E peekInQueue() {
		if(isEmpty()) {
			return null;
		}else {
			return queue[beginingQueue];
		}
	}
	
}

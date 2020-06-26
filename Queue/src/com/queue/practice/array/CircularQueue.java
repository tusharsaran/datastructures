/**
 * 
 */
package com.queue.practice.array;

/**
 * @author tusharsaran
 * 
 *
 */
public class CircularQueue<E> {
	
	
	public int beginingQueue = -1;
	public int endQueue = -1;
	public  E[] queue;

	public CircularQueue(){
	}
	
	@SuppressWarnings("unchecked")
	public CircularQueue(int size){
		queue = (E[]) new Object[size] ;
	}
	
	
	/**
	 * creating a queue
	 * @param size
	 *
	 */
	public  CircularQueue<E> create(int size) {
		System.out.printf("%s%n", "Successfully created queue.");
		return new CircularQueue<>(size);
		
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
	 * check if queue is Full
	 *
	 */
	public Boolean isFull() {
		return (endQueue + 1) % queue.length == beginingQueue ? true : false;
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
			queue[(endQueue + 1) % queue.length ] = data;
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
			beginingQueue = (beginingQueue + 1)  % queue.length;
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

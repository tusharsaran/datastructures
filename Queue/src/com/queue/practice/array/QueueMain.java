/**
 * 
 */
package com.queue.practice.array;

/**
 * @author tusharsaran
 *
 */
public class QueueMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> queue =  new Queue<>();
		
		//creating a queue
		queue = queue.create(10);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + queue.isFull());
		
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + queue.isEmpty());
		
		//inserting data in queue
		queue.enQueue(2);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + queue.isFull());
				
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + queue.isEmpty());
		
		//inserting data in queue
		queue.enQueue(1);
		queue.enQueue(3);
		
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + queue.peekInQueue());
		
		//removing data from queue
		queue.deQueue();
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + queue.peekInQueue());
		
		//inserting data in queue
		queue.enQueue(5);
		
		//inserting data in queue
		queue.enQueue(6);
		
		//inserting data in queue
		queue.enQueue(23);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + queue.isFull());
						
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + queue.isEmpty());
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + queue.peekInQueue());
		
		
		System.out.printf("%s%n","array filled size is ::::: " + queue.endQueue);
		
		//removing data from queue
		queue.deQueue();
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + queue.peekInQueue());
		
		//inserting data in queue
		queue.enQueue(12);
		queue.enQueue(36);
		queue.enQueue(55);
		queue.enQueue(1432);
		queue.enQueue(67);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + queue.isFull());
		
		queue.enQueue(453);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + queue.isFull());
		
		//deleting a queue
		queue.deleteQueue();
		
				
	}

}

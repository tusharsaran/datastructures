/**
 * 
 */
package com.queue.practice.linkedlist;

/**
 * @author tusharsaran
 * this is main class of Queue implemented using Linked list. 
 * Here we are going to test all operations of queue
 *
 */
public class QueueMain {

	/**
	 * @param args
	 * 2|3  3|5 5|6 15|null
	 */
	public static void main(String[] args) {
		
	//creating a queue
	Queue<Integer> queue = new Queue<>();
	
	System.out.printf("Is Queue Empty  %s\n", queue.isEmpty());
	queue.create(2);
	
	System.out.printf("Is Queue Empty  %s\n", queue.isEmpty());
	System.out.printf("Current data in queue is  %d\n", queue.peekInQueue());
	
	queue.enQueue(3);
	queue.enQueue(6);
	queue.enQueue(11);
	queue.enQueue(51);
	
	System.out.printf("Queue size is   %d\n", queue.size());
	System.out.printf("Is Queue Empty  %s\n", queue.isEmpty());
	System.out.printf("Current data in queue is  %d\n", queue.peekInQueue());
	
	System.out.printf("%s\n", "::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.printf("%s\n", "::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	
	queue.deQueue();
	queue.enQueue(16);
	queue.enQueue(66);
	
	System.out.printf("Queue size is   %d\n", queue.size());
	System.out.printf("Is Queue Empty  %s\n", queue.isEmpty());
	System.out.printf("Current data in queue is  %d\n", queue.peekInQueue());
	
	System.out.printf("%s\n", "::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.printf("%s\n", "::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	
	queue.deQueue();
	queue.deQueue();
	queue.enQueue(21);
	
	System.out.printf("Queue size is   %d\n", queue.size());
	System.out.printf("Is Queue Empty  %s\n", queue.isEmpty());
	System.out.printf("Current data in queue is  %d\n", queue.peekInQueue());
	
	System.out.printf("%s\n", "::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.printf("%s\n", "::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	
	queue.deQueue();
	queue.deQueue();
	queue.deQueue();
	queue.deQueue();
	queue.deQueue();
	queue.enQueue(216);
	//queue.deQueue();
	//queue.deQueue();  //will throw query is empty exception
	queue.deleteQueue();

	}

}

/**
 * 
 */
package com.queue.practice.array;

/**
 * @author tusharsaran
 *
 */
public class CircularQueueMain {
	int size  = 5;

	public static void main(String[] args) {
		CircularQueue<Integer> cQueue =  new CircularQueue<>();
		CircularQueueMain cqMain = new CircularQueueMain();
		//creating a queue
		cQueue = cQueue.create(cqMain.size);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
		
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + cQueue.isEmpty());
		
		//inserting data in queue
		cQueue.enQueue(2);
		
		//is queue full 
		//System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
				
		//is queue empty 
		//System.out.printf("%s%n","Is queue empty : " + cQueue.isEmpty());
		
		//inserting data in queue
		cQueue.enQueue(1);
		cQueue.enQueue(3);
		
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		
		for(int  i = 0;  i < cqMain.size; i ++) {
			Object[] arry = cQueue.queue;
			System.out.println("Queue Result is  : " + arry[i]);
			
		}
		
		//removing data from queue
		cQueue.deQueue();
		
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		for(int  i = 0;  i < cqMain.size; i ++) {
			Object[] arry = cQueue.queue;
			System.out.println("Queue Result is  : " + arry[i]);
			
		}
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		//inserting data in queue
		cQueue.enQueue(11);
		
		//removing data from queue
		cQueue.deQueue();
		
		cQueue.enQueue(32);
		
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		for(int  i = 0;  i < cqMain.size; i ++) {
			Object[] arry = cQueue.queue;
			System.out.println("Queue Result is  : " + arry[i]);
			
		}
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
								
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + cQueue.isEmpty());
	
		cQueue.deQueue();
		cQueue.enQueue(102);
		
		for(int  i = 0;  i < cqMain.size; i ++) {
			Object[] arry = cQueue.queue;
			System.out.println("Queue Result is  : " + arry[i]);
			
		}
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		cQueue.enQueue(150);
		
		for(int  i = 0;  i < cqMain.size; i ++) {
			Object[] arry = cQueue.queue;
			System.out.println("Queue Result is  : " + arry[i]);
			
		}
		
		//peeking data from queue
				System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%s%n","::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		cQueue.deQueue();
		
		//peeking data from queue
				System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		cQueue.deQueue();

		//peeking data from queue
				System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		cQueue.deQueue();

		//peeking data from queue
				System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		

		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
								
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + cQueue.isEmpty());
		
		cQueue.deQueue();

		//peeking data from queue
				System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		cQueue.deQueue();

		//peeking data from queue
				System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
										
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + cQueue.isEmpty());
				
		
		//deleting a queue
				cQueue.deleteQueue();
		
		/*//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		//removing data from queue
		cQueue.deQueue();
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		//inserting data in queue
		cQueue.enQueue(5);
		
		//inserting data in queue
		cQueue.enQueue(6);
		
		//inserting data in queue
		//cQueue.enQueue(23);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
						
		//is queue empty 
		System.out.printf("%s%n","Is queue empty : " + cQueue.isEmpty());
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		
		System.out.printf("%s%n","array filled size is ::::: " + cQueue.endQueue);
		
		//removing data from queue
		cQueue.deQueue();
		
		//peeking data from queue
		System.out.printf("%s%n","current data in the queue is ::::: " + cQueue.peekInQueue());
		
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
		
		cQueue.enQueue(453);
		
		//is queue full 
		System.out.printf("%s%n","Is queue full : " + cQueue.isFull());
		
		
		
		*/
	}
}

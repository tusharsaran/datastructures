/**
 * 
 */
package com.queue.practice.linkedlist;

/**
 * @author tusharsaran
 *	this is a queue class , it has all the operations based on Linked list.
 */
public class Queue<E> {
	
	//head represents beginingQueue or front. Head is the end from where we are going to dequeue
	Node<E> head; 
	//tail represents endQueue or front. Tail is the end from where we are going to enqueue
	Node<E> tail;
	int size;
	
	/**
	 * create a queue
	 * @param data
	 */
	public void create(E data) {
		head = new Node<>(data); 
		tail = head;
		size ++;
		System.out.printf("Queue created successfully  %s\n",  data);
	}
	
	/**
	 * isEmpty : if the queue is empty
	 * @return : Boolean -  true or false
	 */
	public Boolean isEmpty() {
		return head ==  null && tail == null ? true : false;
	}
	
	
	/**
	 * deleteQueue : deleting a queue
	 * 
	 */
	public void deleteQueue() {
		if(head !=  null && tail !=  null) {
		 head =  null; 
		 tail = null;
		 size = 0;
		 System.out.printf("%s\n", "Queue deleted successfully");
		}else {
			throw new QueueException("no queue exists!");
		}
	}
	
	
	/**
	 * peekInQueue : peeking the current data in queue
	 * @return data
	 * 
	 */
	public E peekInQueue() {
		if(isEmpty()) {
			System.out.printf("%s\n", "queue is empty");
			throw new QueueException("queue is empty");
		}
		return head.data; 
	}
	
	

	/**
	 * deQueue : removing the current data in queue
	 * 
	 */
	public void deQueue() throws QueueException{
		if(isEmpty()) {
			System.out.printf("%s\n", "queue is empty");
			throw new QueueException("queue is empty");
		}
		E currentData = head.data;
		Node<E> temp =  head;
		head = null;
		head = temp.next;
		if(head == null)
			tail = null;
		size --;
		System.out.printf("Successfully removed data %d  from  queue \n"  ,  currentData );
	}
	
	
	/**
	 * enQueue : inserting data in queue
	 * Note:  We can enqueue the data using traversing but by traversing the TIme Of complexity will be O(n) which is costly and we have to make sure that our code should be implemented in such 
	 * a way where we are accomplishing the result in Time Complexity of Order of Constant i.e. O(1) 
	 * 
	 * @param data
	 * 
	 */
	public void enQueue(E data) throws QueueException{
		if(isEmpty()) {
			create(data);
			return;
		}
		Node<E> node  = new Node<>(data);
		tail.next = node;
		tail = node;
		size ++;
		System.out.printf("Successfully inserted data %d in queue \n" ,  data );
	}
	
	/**
	 * size of the queue
	 * 
	 */
	public int size() {
		return size;
	}
	
}

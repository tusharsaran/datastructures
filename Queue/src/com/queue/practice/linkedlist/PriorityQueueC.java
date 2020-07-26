/**
 * 
 */
package com.queue.practice.linkedlist;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author tusharsaran
 *
 * Priority Queue is a queue data structure implementation in which objects are processed based on their priority. 
 * It is different from standard queues where FIFO (First-In-First-Out) algorithm is followed.
 * 
 * In a priority queue, added objects are according to their priority. 
 * By default, the priority is determined by objects’ natural ordering. Default priority can be overridden by a Comparator provided at queue construction time.
 */
public class PriorityQueueC {
	
	
	
	static class Employee implements Comparable<Employee> {
		 
	    private Long id;
	    private String name;
	    private LocalDate dob;
	 
	    public Employee(Long id, String name, LocalDate dob) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.dob = dob;
	    }
	     
	    @Override
	    public int compareTo(Employee emp) {
	        return this.getId().compareTo(emp.getId());
	    }
	 
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		@Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	    }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator<Employee> nameSorter = Comparator.comparing(Employee::getName);
		
		Comparator<Employee> dateComp = new Comparator<>(){
			
			@Override
			public int compare(Employee e, Employee e1) {
				return e.getDob().compareTo(e1.getDob());
			}
			
		};
		
		PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(dateComp);
		
		priorityQueue.add(new Employee(1l, "AAA", LocalDate.now().plusDays(1)));
		priorityQueue.add(new Employee(4l, "CCC", LocalDate.now().plusDays(2)));
		priorityQueue.add(new Employee(5l, "BBB", LocalDate.now().plusDays(112)));
		priorityQueue.add(new Employee(2l, "FFF", LocalDate.now().plusDays(645)));
		priorityQueue.add(new Employee(3l, "DDD", LocalDate.now().plusDays(2342)));
		priorityQueue.add(new Employee(6l, "EEE", LocalDate.now().plusDays(64)));
		 
		while(true) 
		{
		    Employee e = priorityQueue.poll();
		    if(e !=  null)
		    System.out.println(e);
		     
		    if(e == null) break;
		}
	}

}

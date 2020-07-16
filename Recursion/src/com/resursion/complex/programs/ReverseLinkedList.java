/**
 * 
 */
package com.resursion.complex.programs;

/**
 * @author tusharsaran
 *
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		head.next = node;
		head.next.next = node1;
		head.next.next.next = node2;
		head.next.next.next.next = node3;
		
		ListNode output =  reverseViaIteration(head);
	}
	
	public static ListNode reverseList(ListNode head) {
	if (head == null || head.next == null) 
		return head;
    ListNode p = reverseList(head.next);
    System.out.println(p.val);
    head.next.next = head;
    head.next = null;
    return p;
	}
	
	
	 public static ListNode reverseViaIteration(ListNode head){
		 ListNode current =  head;
		 ListNode prev =  null;
	        while (current !=  null) {
	        	ListNode temp = current.next; 
	        	current.next = prev;
	        	prev = current;
	        	current = temp;
	        }
	        return prev;
	    }
}

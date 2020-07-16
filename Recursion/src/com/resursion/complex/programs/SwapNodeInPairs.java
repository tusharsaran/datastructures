/**
 * 
 */
package com.resursion.complex.programs;

/**
 * @author tusharsaran
 *
 */
/*
 * Definition for singly-linked list.
 *
 */
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class SwapNodeInPairs {
	
	
	public static void main (String [] args){
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		head.next = node;
		head.next.next = node1;
		head.next.next.next = node2;
		
		swap(head);
	}
	

	public static void swap(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode temp = head.next.next;
		int firstValue =  head.val;
		int secondValue = head.next.val;
		
		head.val = secondValue;
		head.next.val =  firstValue;
		
		swap(temp);
		head.next.next = temp;
	}

}

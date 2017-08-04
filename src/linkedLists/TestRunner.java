package linkedLists;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRunner {

	@Test 
	public void RemoveDupesTest() {
		Node head = null;		
		int[] initArr = new int[] {2,2,4,5,2,8,5};
		int[] finalArr = new int[] {2,4,5,8};
		
		for (int i = 0; i < initArr.length; i++) {
			// should only be null on 0 index
			if (head == null) {
				head = new Node(initArr[i]);
				continue;
			}
			head.appendToTail(initArr[i]);
		}
		
		head = LinkedLists.RemoveDupes(head);
		
		int index = 0;
		while (head != null) {
			if (head.data != finalArr[index]) {
				fail("Linked List should be unique, but is not.");
			}
			
			index++;
			head = head.next;
		}
		
	}
	
	@Test
	public void FindKthToLastTest() {
		Node head = null;
		int[] initArr = new int[] {5, 6, 7, 8, 9};
		int k = 3; // 3rd to last
		
		for (int i = 0; i < initArr.length; i++) {
			if (head == null) {
				head = new Node(initArr[i]);
				continue;
			}
			head.appendToTail(initArr[i]);
		}
		
		head = LinkedLists.FindKthToLast(head, k);
		
		if (head.data != initArr[k-1]) {
			fail("Expected:" + initArr[k-1] + " But retrieved: " + head.data);
		}
		
	}
	
	@Test
	public void DeleteNode() {
		Node head = null;
		Node runner = null;
		int[] initArr = new int[] {1, 2, 3, 4, 5};
		int[] finalArr = new int[] {1, 2, 4, 5};
		
		for (int i = 0; i < initArr.length; i++) {
			if (head == null) {
				head = new Node(initArr[i]);
				runner = head;
				continue;
			}
			head.appendToTail(initArr[i]);
		}
		
		while (runner != null) {
			if (runner.data == 3) {
				LinkedLists.DeleteNode(runner); 
			}
			runner = runner.next;
		}
		
		
		int index = 0;
		while (head != null) {
			if (head.data != finalArr[index]) {
				fail("Expected:" + finalArr[index] + " but list contains:" + head.data);
			}
			head = head.next;
			index++;
		}
		
		
	}
	
	@Test 
	public void PartitionTest() {
		// input: 3,5,8,5,10,2,1
		// output: 3,2,1,5,8,5,10 
		int[] initArr = new int[] {3,5,8,5,10,2,1};
		int[] finalArr = new int[] {3,2,1,5,8,5,10};
		int pivot = 5;
		Node head = null;
		
		
		for (int i=0; i < initArr.length; i++) {
			if (head == null) {
				head = new Node(initArr[i]);
				continue;
			}
			head.appendToTail(initArr[i]);
		}
		
		head = LinkedLists.Partition(head, pivot);
		
		int index = 0;
		while (head != null) {
			if (head.data != finalArr[index]) {
				fail("Expected:" + finalArr[index] + " but list contains:" + head.data);
			}
			head = head.next;
			index++;
		}
		
	}
	
	@Test
	public void SumListsTest() {
		int[] ll1 = new int[] {1, 5, 9};
		int[] ll2 = new int[] {2, 3, 6, 7};
		int[] sumArr = new int[] {3, 8, 5, 8};
		
		Node head1 = new Node(ll1[0]);
		Node head2 = new Node(ll2[0]);
		
		for (int i = 1; i < ll1.length; i++) {
			head1.appendToTail(ll1[i]);
		}
		
		for (int i = 1; i < ll2.length; i++) {
			head2.appendToTail(ll2[i]);
		}
		
		Node sum = LinkedLists.SumLists(head1, head2);
		
		int index = 0;
		while (sum != null) {
			if (sum.data != sumArr[index]) {
				fail("Expected:" + sumArr[index] + " but list contains:" + sum.data);
			}
			sum = sum.next;
			index++;
		}
		
	}
	
	@Test
	public void SumListsReverseTest() {
		int[] ll1 = new int[] {0, 9, 5, 1}; //pre-padded with 0s. 
		int[] ll2 = new int[] {7, 6, 3, 2};
		int[] sumArr = new int[] {8, 5, 8, 3};
		
		Node head1 = new Node(ll1[0]);
		Node head2 = new Node(ll2[0]);
		
		for (int i = 1; i < ll1.length; i++) {
			head1.appendToTail(ll1[i]);
		}
		
		for (int i = 1; i < ll2.length; i++) {
			head2.appendToTail(ll2[i]);
		}
		
		Node sum = LinkedLists.SumListsReverse(head1, head2);
		
		int index = 0;
		while (sum != null) {
			if (sum.data != sumArr[index]) {
				fail("Expected:" + sumArr[index] + " but list contains:" + sum.data);
			}
			sum = sum.next;
			index++;
		}
	}
}

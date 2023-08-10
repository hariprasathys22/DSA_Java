package com.doublelinkedlist;

public class DoubleLinkedList {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int val){
			data = val;
			next = null;
			prev = null;
		}
	}
	
	DoubleLinkedList(){
		head = null;
		tail = null;
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		if(head == null) {
			tail = newNode;
		}
		else {
			head.prev = newNode;
		}
		head = newNode;
	}
}

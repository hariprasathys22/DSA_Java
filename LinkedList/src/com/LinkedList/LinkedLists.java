package com.LinkedList;

import java.util.Iterator;

public class LinkedLists<T> implements Iterable<T> {
	Node head;
	
	class Node{
		T data;
		Node next;
		Node(T val){
			data = val;
			next = null;
		}
	}
	
	LinkedLists(){
		head = null;
	}
	public void addFirst(T val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode; 
		}
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}	
	}
	public void insertpos(int pos, T val) {
		if(pos==0) {
			addFirst(val);
			return;
		}
		
		
		Node newNode = new Node(val);
		Node temp = head;
		for(int i = 1; i<pos; i++) {
			temp = temp.next;
			if(temp == null) {
				throw new IllegalArgumentException("Invalid position " + pos);
			}
		}
		newNode.next = temp.next;
		temp.next = newNode; 
	}
	public void deletePos(int pos) {
		
		if(head == null) {
			throw new IndexOutOfBoundsException("list is empty");
		}
		if(pos == 0) {
			head = head.next; 
			return;
		}
		Node temp = head;
		Node prev = null;
		
		for(int i = 1; i<=pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
		
		
	}
	public void deleteBegining() {
		if(head == null) {
			throw new IndexOutOfBoundsException("list is empty");
		}
			head = head.next;
		
	}
	public void get(int pos) {
		 Node temp = head;
		 Node returnNode = null;
		 
		 if(pos == 0) {
			 returnNode = head;
			 System.out.println(returnNode.data);
			 return;
		 }
		 for(int i= 1; i< pos; i++) {
			 temp = temp.next;
			 if(temp== null) {
				 throw new IndexOutOfBoundsException("Position value exceeded");
			 }
		 }
		 returnNode = temp.next;
		 System.out.println(returnNode.data);
	}
	public void deleteAtEnd() {
		Node temp = head;
		Node prev = null;
		if(head == null) {
			throw new IndexOutOfBoundsException("noo element in list");
		}
		while(temp.next != null) {
			prev = temp;
			temp= temp.next;
			
		}
		prev.next = null;
		
	}
	public void insertAtEnd(T val) {
		
		Node newNode = new Node(val);
		Node temp = head;
	
		 if (head == null) {
		        // List is empty, make the new node the head
		        head = newNode;
		    }else {
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		
	}}
	public void search(T val) {
		Node temp = head;
		int index = 0;
		while(temp != null) {
			if(temp.data == val) {
				System.out.println(index);
				return;
			}
			temp = temp.next;
			index++;
		}
			System.out.println("The value is not in the list");
		
	}
	public boolean contains(T val) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == val) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;		
	}
	public Iterator<T> iterator(){
		return new Iterator<T>() {
			
			Node temp = head;
			public boolean hasNext() {
				return temp!= null;
			}
			public T next() {
				T val = temp.data;
				temp = temp.next;
				return val;
				
			}
		};
	}
	
	
}

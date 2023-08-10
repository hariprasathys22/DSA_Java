package com.LinkedList;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLists<Integer> linkedlist = new LinkedLists<Integer>();
		
		linkedlist.addFirst(10);
		linkedlist.addFirst(20);
		linkedlist.addFirst(30);
		
		linkedlist.insertpos(2,40);
		
//		for(int a:linkedlist) {
//			System.out.print(a + " ");
//		}
		
		//another way of accessing elements in a linkedlist is by using the function we have created;
		
//		Iterator<Integer> it =  linkedlist.iterator();
//		
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
//		linkedlist.insertAtEnd(90);
		linkedlist.insertAtEnd(105);
//		linkedlist.search(105);
		linkedlist.display();
		System.out.println(" ");
		System.out.println(linkedlist.contains(106));
		
	}

}

package LinkedList;

import Recursion.printSubsetOfNaturalNumber;

class SingleLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// implementation of insertion of a node at end

	public void insertAtEnd(int newData) {
		Node newNode = new Node(newData);
		// checking linkedList is empty or not
		// for linked list is empty
		if (head == null) {
			head = new Node(newData);
			return;
		}
		newNode.next=null;
		// for linked list is not empty
		// creating a temp Node
            Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		return;
	}
	// implementation of insertion of a node at First

	public void insertAtFirst(int newData) {
		Node newNode = new Node(newData);
		// checking linkedList is empty or not
		// for linked list is empty
		if (head == null) {
			head = new Node(newData);
			return;
		}
		//newNode.next=null;
		// for linked list is not empty
		// creating a temp Node
            Node temp=newNode;
           temp.next=head;
           head=temp;
		return;
	}

// implementation of the printing a linked List
	public void printLnikedList() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
	SingleLinkedList list=new SingleLinkedList();
	
	list.insertAtEnd(2);
	list.insertAtEnd(3);
	list.insertAtEnd(4);
	list.insertAtEnd(5);
	list.insertAtEnd(6);
	list.insertAtEnd(7);
	list.insertAtEnd(8);
	list.insertAtEnd(9);
	list.printLnikedList();
	
	list.insertAtFirst(22);
	System.out.println();
	list.printLnikedList();
list.insertAtFirst(20);
System.out.println();
list.printLnikedList();
	}
}

//public class SingleLinkedList {
//	
//	static Node head;
//	class Node{
//		String Data;
//		Node next;
//		
//		
//		public Node(String data) {
//
//			this.Data = data;
//			this.next = next;
//		}
//		
//	}
//	
//	
//	// add first
//	
//	public static void addFirst(String data) {
//		Node newNode=new Node(data);
//		if(head == null) {
//			head=newNode;
//		}
//		newNode.next=head;
//		head=newNode;
//		
//	}
//	// add Last
//	
//		public static void addLast(String data) {
//			Node newNode=new Node(data);
//			if(head == null) {
//				head=newNode;
//			}
//			Node currNode=head;
//			while(currNode!= null) {
//				currNode=currNode.next;
//			}
//			currNode.next=newNode;
//		}
//		
//		// print
//		public static void printLinkedList() {
//			Node currNode=head;
//			if(head==null) {
//				System.out.println("List is empty");
//				return;
//			}
//			while(currNode !=null) {
//			System.out.print(currNode.Data+" -> ");
//				currNode = currNode.next;
//				
//			}
//			currNode.next=newNode;
//			System.out.println("null");
//		}
//public static void main(String[] args) {
//	SingleLinkedList sll=new SingleLinkedList();
//	sll.addFirst(" A ");
//	sll.addFirst(" IS ");
//	sll.printLinkedList();
//}
//}

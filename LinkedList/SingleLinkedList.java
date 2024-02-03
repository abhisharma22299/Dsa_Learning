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
		newNode.next = null;
		// for linked list is not empty
		// creating a temp Node
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
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
		// newNode.next=null;
		// for linked list is not empty
		// creating a temp Node
		Node temp = newNode;
		temp.next = head;
		head = temp;
		return;
	}

	// implementation of insertion of a node at any any node
	public void insertAtIndex(Node prev, int data) {
		Node newNode = new Node(data);
		newNode.next = prev.next;
		prev.next = newNode;

	}

	// loops
	public void inserti(int data, int idx) {
		Node temp = new Node(data);
		int i = 1;
		temp = head;
		while (i < idx) {
			temp = temp.next;

			i++;

		}
		insertAtIndex(temp, data);
	}

	// implementation of the printing a linked List
	public void printLnikedList() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

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

		// at index
		list.inserti(121, 1);
		System.out.println();
		list.printLnikedList();
	}
}

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
	public static SingleLinkedList list = new SingleLinkedList();
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

	// deletion
	public void deletionFromHead() {
		Node temp = head;
		head = temp.next;
	}

	public void deletionAtIndex(int idx) {
		if(idx==0) {
			Node temp2=head;
			head=temp2.next;
			return;
		}
		
		if (head == null ) {
			return;
		}
		int i = 1;
		Node temp = head;
		while (temp.next != null && idx != i) {

			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return;
	}
// 
	
	public void reversalLinkedList() {
		//SingleLinkedList li=new SingleLinkedList();
		Node curr =head;
		Node prev=null;
		Node nextPtr=null;
		
		while(curr!= null) {
			nextPtr=curr.next;
			curr.next=prev;
		prev=curr;
	curr=nextPtr;
//		System.out.println("");

		}
		head=prev;
		return;
	}
	public static void main(String[] args) {

		
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
		System.out.println();
		list.deletionFromHead();
		list.printLnikedList();
		System.out.println();
		list.deletionAtIndex(4);
		list.printLnikedList();
		System.out.println();
		//list.deletionAtIndex(5);
		list.printLnikedList();
		System.out.println("\nReversal in a linked list");
		list.reversalLinkedList();
		list.printLnikedList();
	}
}

package LinkedList;
import LinkedList.SingleLinkedList.Node;
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
		while (temp!= null) {
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
	public void printMiddleElement() {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null &&fast.next!=null&&fast.next.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println();
		System.out.println(slow.data);
	}
	public  boolean palindrome() {
		Node curr = head;
		int i=0;
		
		while(curr!=null) {
			i++;
			curr=curr.next;
		}
		System.out.println(i);
		int arr[]= new int[i];
		int rev[]=new int [i];
		int j=0;
		curr=head;
		while(curr!=null) {
			arr[j++]=curr.data;
			curr=curr.next;
		}
		int n=0;
		for(int k=i-1;k>=0;k--) {
			rev[n++]=arr[k];
		}
		
		for(int k:arr)
			System.out.print(k+" ");
		System.out.println();
		for(int k:rev)
			System.out.print(k+" ");
		for(int k=0;k<arr.length;k++) {
			if(arr[k]!=rev[k])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {

		
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(0);
		list.insertAtEnd(1);
		list.printLnikedList();
		System.out.println("Testing Palindrome");

		System.out.println(list.palindrome());

		
	}
}

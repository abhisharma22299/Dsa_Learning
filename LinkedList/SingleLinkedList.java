package LinkedList;
class SingleLinkedList{
	
	Node head;
	class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
		}
	}
	
	
	// implementation of insertion of a node at end
	
	public void insertAtEnd(int newData) {
		Node newNode=new Node(newData);
		// checking linkedList is empty or not 
	if(head==null) {
		head=new Node(newData);
		return;
	}
	}
	public static void main(String[] args) {
			
		
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

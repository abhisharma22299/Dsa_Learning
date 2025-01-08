package LinkedList;

public class newSingleLinkedList {
	Node head;
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// add first
	public void addFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	// add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;

		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// print a linked list
	public  void printLL() {
		if (head == null) {
			System.out.println("list is empty ");

			return;
		}

		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.print("NULL");
	}

	// at index
	public void addAtIndex(String data, int idx) {

		Node newNode = new Node(data);
		int i = 1;

		if (idx == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (idx != i && currNode.next != null) {
			currNode = currNode.next;
			i++;
		}
		if (currNode.next == null) {
			currNode.next = newNode;
		} else {

			newNode.next = currNode.next;
			currNode.next = newNode;
		}
	}

	// delete at first
	public void deleteAtHead() {
		if (head == null) {
			System.out.println("LinkList is empty");
			return;
		}
		head = head.next;
	}

	// delete at the index
	public void deleteAtIdx(int idx) {
		if (head == null) {
			System.out.println("LinkList is empty");
			return;
		}
		if (idx == 0) {
			head = head.next;
		}
		Node currNode = head;
		int i = 0;

		while (currNode.next != null && i == idx) {

			if (currNode.next == null) {
				break;
			}
			currNode = currNode.next;
			i++;
		}
		if (currNode.next == null) {
			currNode.next = null;
		} else {
			currNode.next = currNode.next.next;
		}
	}

	// delete at the end
	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("LinkList is empty");
			return;
		}

		Node currNode = head;

		while (currNode.next.next != null) {

			currNode = currNode.next;

		}

		currNode.next = null;

	}

	// reversal of linked list
	public void resversal() {
		if (head == null || head.next == null) {
			return;
		}

		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
// update
			prevNode = currNode;
			currNode = nextNode;

		}
		head.next = null;
		head = prevNode;
	}

	// rev2
	public void rev2() {
		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node next = currNode.next;
			currNode.next = prevNode;
			// update
			prevNode = currNode;
			currNode = next;
		}
		head.next = null;
		head = prevNode;
	}

	
	// rev recurrsion
	
	public Node revRecurrsive(Node head) {
		if(head==null || head.next ==null) {
			return head;
		}
		Node newNode=revRecurrsive(head.next);
		head.next.next=head;
		head.next=null;
		return newNode;
	}
	public int  countSize() {
		if(head==null) {
			return 0;
		}
		int count=0;
		Node temp=head;
		while(temp !=null) {
			count++;
			temp=temp.next;
		}
		
		return count;
	}
	public void deleteNthNodeFromLast(int idx,int size) {
		
		
		
     int count =size-idx;
      if(head==null) {
    	  return;
      }
Node currNode=head;

		int i=0;
      while(currNode.next!=null && i<count-1 )
      {
    	
    	  currNode=currNode.next;
    	  i++;
      }

//      System.out.println();
//System.out.println(currNode.data);        
//	
      Node prev=currNode;
      currNode.next=prev.next.next;
//      System.out.println(prev.data);
      }
	
	public  Node simplerev() {
		  if (head == null) {
	            return head;
		  }
		  
	        Node temp = head;

	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        head.next=temp;
	        head = temp.next;
	        newSingleLinkedList l = new newSingleLinkedList();
	        
	        return head;
	}
	
	
	public static void main(String[] args) {
		newSingleLinkedList l = new newSingleLinkedList();
		l.addFirst("hello");
		l.addFirst("Abhishek");
		l.addLast("sharma");
		l.addLast("Mca");
		l.addLast("Student");
		l.addLast("IMSEC");
//l.resversal();
//l.simplerev();
l.printLL();
System.out.println();
	l.printLL();
		l.deleteNthNodeFromLast(3,l.countSize());
		System.out.println();
l.printLL();
	}
}

package QueueOperation;

public class QueueWithLinkedlist {
	static Queue head;
	static  Queue tail;

	static class Queue {

		int data;
		Queue next;
		Queue() {
		}
		Queue(int data) {
			this.data = data;
			this.next = null;
		}

		public static void add(int data) {
			Queue newNode=new Queue(data);
			
          if(head==null) {
        	  
        	head=tail=newNode;  
         return;
          }
         
          tail.next=newNode;
          tail=newNode;
          
		}

		public static int remove() {

			if(head==null) {
				return -1;
			}
			int fro=head.data;
			head=head.next;
			System.out.println("Remove the "+ fro + " from the queue");
			return fro;
		}
		public static void display() {
			if(head==null) {
				return;
			}
			System.out.println("Displaying the new Queue");
			Queue temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				
				temp=temp.next;
			}
		}
		public static int peek() {
			if(head==null) {
				return -1;
			}
			return head.data;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new Queue();
	
	q.add(1);
	q.add(2);
	q.add(3);q.add(4);
	
	q.display();
q.remove();
q.display();
	}
	

}

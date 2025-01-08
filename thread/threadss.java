package thread;

public class threadss extends Thread {

//	public void run() {
//		System.out.println("thread");
//	}
//	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread();
		Thread t2 = new Thread();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());

	t1.setPriority(MAX_PRIORITY);
System.out.println(	t1.getPriority()); 

	}

}

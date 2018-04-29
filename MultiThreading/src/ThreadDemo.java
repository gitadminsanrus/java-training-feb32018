
public class ThreadDemo {

	public static void main(String[] args) {
		
		LongRunningTask longRunningTask = new LongRunningTask();
//		Thread t = new Thread(longRunningTask);
//		t.start();
		
		MyThread myThread1 = new MyThread(1);
		MyThread myThread2 = new MyThread(2);
		MyThread myThread3 = new MyThread(3);
		
		myThread1.setPriority(Thread.MIN_PRIORITY);
		myThread2.setPriority(Thread.MAX_PRIORITY);
		myThread3.setPriority(4);
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
		System.out.println("MyThread1.isAlive() => " + myThread1.isAlive());
		try {
			myThread1.join();
			myThread2.join();
			myThread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Main thread is completed with its task.");
		
//		for (int index = 0; index < 100000; index++) {
//			System.out.println("For Loop 1: " + index);
//		}	

	}
}

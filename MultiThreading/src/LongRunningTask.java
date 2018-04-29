
public class LongRunningTask implements Runnable {

	public void run() {
		Thread threadRunningThisTask = Thread.currentThread();
		System.out.println(threadRunningThisTask.getName());
		
		for (int index = 0; index < 100000; index++) {
			System.out.println("For Loop 2: " + index);
		}
	}

}

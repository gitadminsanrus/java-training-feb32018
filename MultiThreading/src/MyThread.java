
public class MyThread extends Thread {
	
	private int position;
	
	public MyThread(int position) {
		this.position = position;
	}
	
	public void run() {
		for (int index = 0; index < 10; index++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("[MyThread => " + position + "] index = " + index);
		}
	}

}

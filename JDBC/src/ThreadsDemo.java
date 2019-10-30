
public class ThreadsDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run: " +Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsDemo t = new ThreadsDemo();
		t.start();
		
		t.run();
		
		System.out.println("Main: " +Thread.currentThread());
	}

}

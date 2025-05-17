package Threads;

public class ThreadRunnable implements Runnable {

	public static void main(String[] args) {

		Thread thread = new Thread(new ThreadRunnable ());
		thread.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread "+i);
		}
	
	}
	
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("New Thread "+i);
		}
	}

}

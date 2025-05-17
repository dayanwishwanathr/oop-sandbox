package Threads;

public class TestThreads extends Thread {

	public static void main(String[] args) {

		TestThreads t1 = new TestThreads();
		t1.start();
		
		for(int i =0; i<10; i++) {
			System.out.println("Main Thread "+i);
		}
	
	
	}
	
	public void run() {
		
		
		for(int i =0; i<10; i++) {
			System.out.println("New Thread "+i);
		}
	}
	

}

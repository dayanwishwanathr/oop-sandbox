package Threads;

public class Threads extends Thread {

	public static void main(String[] args) {

		Threads t = new Threads();
		t.start();
		
		for (int i = 0; i< 10; i++) {
			System.out.println("Main Thread "+i);
		}
		
	}
	
		public void run() {
			for(int i =0; i<10; i++) {
				System.out.println("New Thread "+i);
			}
		}

}

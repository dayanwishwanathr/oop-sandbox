package TheredsTest;

public class MainThread {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		
		t1.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Main theread "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		
	}

}

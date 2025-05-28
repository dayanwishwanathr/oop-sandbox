package TheredsTest;

public class MainThread extends Thread {
	
	@Override
	public void run() {
		
		MyThread1 ob1 = new MyThread1();
		//ob1.start();
		Thread ob = new Thread(ob1);
		ob.start();
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("Child theread "+i);
			
			try {
			Thread.sleep(3000);
			} catch (Exception e){
				System.out.println(e);
			}
		}
		
	}
	

	public static void main(String[] args) {

		MainThread ob1 = new MainThread();
		ob1.start();
		
		
		
		MyThread1 t1 = new MyThread1();
		Thread t2 = new Thread(t1);
		t2.start();
		
		Thread t3 = new Thread(new MyThread1());
		t3.start();
		
		
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

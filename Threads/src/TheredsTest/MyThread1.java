package TheredsTest;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Child theread "+i);
			
			try {
			Thread.sleep(3000);
			} catch (Exception e){
				System.out.println(e);
			}
		}
		
		
	}
	
}

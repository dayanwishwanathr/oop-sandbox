package TheredsTest;

public class MyThread1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child theread "+i);
			
			try {
			Thread.sleep(3000);
			} catch (Exception e){
				System.out.println(e);
			}
		}
		
		
	}
	
}

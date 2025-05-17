package Threads;

class Sample {
	
	public synchronized void displayOutput (Sample sample) {
		
		try {
			for (int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLocks extends Thread{

	Sample sample;
	String name;
	
	public static final String THREAD0 = "Thread 0";
	public static final String THREAD1 = "Thread 1"; 
	
	public ThreadLocks(Sample sample, String name) {
		
		this.sample= sample;
		this.name=name;
		
	}
	
	public static void main(String[] args) {

		Sample sample = new Sample();
		
		ThreadLocks threadLocks1 = new ThreadLocks(sample,THREAD0);
		ThreadLocks threadLocks2 = new ThreadLocks(sample,THREAD1);
		
		threadLocks1.start();
		threadLocks2.start();
		
		
	}
	
	public void run() {
		sample.displayOutput(sample);
	}
	
	
	
	

}

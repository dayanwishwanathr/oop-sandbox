package Generics;

class TwoGen <T,V> {
	
	T ob1;
	V ob2;
	
	public TwoGen (T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	
	public void print() {
		System.out.println(this.ob1);
		System.out.println(this.ob2);
		
	}
	
	public T getOb1() {
		return ob1;
		
	}
	
	public V getOb2() {
		return ob2;
		
	}
	
}


public class TwoGenMain {
 
	public static void main(String args[]) {
		
		TwoGen<String, Integer> tg = new TwoGen("Dayan", 5000);
		
		tg.print();
		
		
		
		
	}
	
}

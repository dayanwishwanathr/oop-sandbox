package Generics;

class Stats <T extends Number> {
	T [] num;
	
	public Stats(T [] obj) {
		this.num=obj;
	}

	
	public double avg() {
		double sum = 0;
		
		for(int i=0; i <num.length; i++) {
			sum = (double) sum + num[i].doubleValue();
			
		}
		
		return sum/num.length;
	}

}

public class BoundeDemo {
	
	public static void main(String[] args) {
		
	Integer intNum[] = {1,2,3,4,5,6};
	Double doubleNum[] = {1.22,41.5,0.34,12.54};
		
	Stats intObj = new Stats(intNum);
	Stats doubleObj = new Stats(doubleNum);
	
	System.out.println(intObj.avg());
	System.out.println(doubleObj.avg());
		
	}

}

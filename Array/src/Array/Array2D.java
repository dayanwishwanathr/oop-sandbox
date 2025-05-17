package Array;

public class Array2D {

	public static void main(String[] args) {
		
		int [][]v = new int [2][4];
		
		int x=10;
		
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=3; j++) {
				v[i][j]=x;
				x++;
				
			}
			
		}
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=3; j++) {
				System.out.print(v[i][j]);
				
			}
			System.out.println();
		}
		
	}

}

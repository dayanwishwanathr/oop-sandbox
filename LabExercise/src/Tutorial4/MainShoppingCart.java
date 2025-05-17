package Tutorial4;


class ShoppingCart {
	 
	private double total;
	private int itemCount;
	 
	public ShoppingCart() {
	
		total = 0.0;
		itemCount = 0;
		
	 }
	
	 public void addItem(double price) throws IllegalArgumentException {
		 
		 if(price > 0 & price < 1000) {
			 
			 total += price;
			 itemCount++;
			 
			 System.out.println("Added item price: "+price);
			 
			 
		 }else {
			 throw new IllegalArgumentException();
			 
		 }
			 
		 
	 }
	 
	 public double calculateTotalPrice() throws ArithmeticException {

		 if(itemCount==0) {
			 throw new ArithmeticException();
		 }	
		 
		 return total;
	 }
	 
	}






public class MainShoppingCart {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		
        
		try {
			
			//cart.addItem(56);
	        cart.calculateTotalPrice();
			
		} catch (IllegalArgumentException e) {
			
			System.out.println("Enter between 0 to 1000 price");
			
		} catch (ArithmeticException e ) {
			
			System.out.println("Cart Empty");
			
		}
		
	}

}

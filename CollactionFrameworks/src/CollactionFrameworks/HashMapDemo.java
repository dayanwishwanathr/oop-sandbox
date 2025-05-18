package CollactionFrameworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	 public static void main(String args[]) {
		 
	 // Create a hash map.
	 HashMap<String, Double> hm = new HashMap<String, Double>();
	 
	 // Put elements to the map
	 hm.put("John Doe", 100.21);
	 hm.put("Tom Smith", 572.48);
	 hm.put("Jane Baker", 154.00);
	 hm.put("Tod Hall", 99.22);
	 hm.put("Ralph Smith", -19.08);
	 
	 
	 // Get a set of the entries.
	 Set<Map.Entry<String, Double>> set = hm.entrySet();
	 
	 // Display the set.
	 for (Map.Entry<String, Double> me : set) {
		 
	
		 System.out.print(me.getKey() + ": ");
		 System.out.println(me.getValue());
	 
	 }
	 
	 // Deposit 1000 into John Doe's account.
	 double balance = hm.get("John Doe");
	 hm.put("John Doe", balance + 1000);
	 
	 System.out.println("John Doe's new balance: " + hm.get("John Doe"));
	 
	 } 
	 
}





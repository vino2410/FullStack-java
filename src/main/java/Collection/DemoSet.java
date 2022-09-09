package Collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;
public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> tech=new HashMap<String,Integer>();
		TreeMap<String,Integer> tech1=new TreeMap<String,Integer>();
		tech.put("Vinod", 24);
		tech.put("Vikram",32);
		tech.put("Surya",23);
		tech1.putAll(tech);
		tech.remove("Surya");
		System.out.println(tech.containsKey("Vikram"));
		System.out.println(tech1.containsValue(42));
		System.out.println(tech.containsValue(24));
		System.out.println(tech);
		System.out.println(tech1);
		
		
		

	}

}

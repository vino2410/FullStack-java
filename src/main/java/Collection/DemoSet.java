package Collection;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		TreeSet set1=new TreeSet();
		set.add("Vinod");
		set1.addAll(set);
		System.out.println(set);
		System.out.println(set1);
		

	}

}

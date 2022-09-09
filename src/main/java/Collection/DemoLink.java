package Collection;
import java.util.LinkedList;

public class DemoLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.add("vinod");
		obj.addLast(24);
		obj.add('A');
		obj.add(5.1);
		obj.add(345678);
		obj.remove(2);
		obj.set(2, "Name");
		System.out.println(obj.get(2));
		System.out.println(obj);
		System.out.println(obj.contains(32));
		
	   
		

	}

        
}

package Constructor;

public class DemoConstructor {
	String name;        //instance of the Class....
	double salary;
	
	public DemoConstructor()
	{   //Constructor with same name as class and without return type...
		
		System.out.println("Constructor called:)");
		name = "Vinod";
		salary = 6.0;
	}
	
	public static void main(String[] args) //Creating Object....
	{
		
		DemoConstructor obj=new DemoConstructor();
		System.out.println("my name is "+obj.name);
		System.out.println("my salary is "+obj.salary);
		
		
		
		
		 
		
	}

}

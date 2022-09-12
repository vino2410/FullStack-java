package Constructor;

public class ParaConstructor {
	int age;
	String name;
	double salary;
	
	public ParaConstructor(int age,double incentive)
	{
		this.age=age;
		salary=incentive;
		System.out.println("paraConstructor is called");
		System.out.println("my age is "+age);
		System.out.println("my salary is "+incentive);
	}
	public ParaConstructor(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("my age is "+age);
		System.out.println("my name is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor obj=new ParaConstructor(22,6.0);
		ParaConstructor obj1=new ParaConstructor("vinod", 21);

	}

}

package Project.JavaProject;

public class Variables 
{
	static int a=10;//static variable
	public void use()//local variables
	{
		int d=90;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Variables obj=new Variables();
		obj.use();
		int c=10;//global variable
		System.out.println(c);
		System.out.println(a);
	}

}

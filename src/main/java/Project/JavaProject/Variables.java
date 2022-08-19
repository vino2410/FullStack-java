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
		int g=10;//global variable
		System.out.println(g);
		System.out.println(a);
	}

}

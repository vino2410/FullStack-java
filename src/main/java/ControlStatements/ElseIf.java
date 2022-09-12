package ControlStatements;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		double b = 23.5;
		String name = "vinod";
		float c = 2.5f;
		
		if (a<c)
		{
			System.out.println("a is lessthan c");
		}
		else if (name=="Raja")
		{
			System.out.println("my name is Raja");
		}else if (b>c)
		{
			System.out.println("b is greaterthan c");
		}else
		{
			System.out.println("a is greaterthan c "+"My name is Vinod "+"b is greaterthan c");
		}

	}

}

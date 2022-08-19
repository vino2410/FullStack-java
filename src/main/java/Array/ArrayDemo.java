package Array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"Vinod","Raju","Somu","Vijay","Ajith"};
		int [] age = {21,22,23,24,25};
		int [] age1 = new int[5];
		for (int index=0;index<age.length;index++)
		{
			//System.out.println("age is "+age[index]);
		}
		for (int Values:age)
		{
			System.out.println("Age is "+Values);
		}
		for (String Values1:name)
		{
			System.out.println(Values1);
		}

	}

}

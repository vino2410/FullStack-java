
public class ForInnerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 5;
		int b = 5;
		
		for (int i=0;i<a;i++)
		{
			for (int j=0;j<b;j++)
			{
				System.out.print(j+1);
			}
			b=b-1;
			System.out.println();
		}
			

	

}
} 

package Array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][];
		a[0] = new int [3];
		a[1] = new int[4];
		
		int count = 0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
		{
				a[i][j] = count+=1;
		}
		}
        for (int i=0;i<a.length;i++)
        {
        	for (int j=0;j<a[i].length;j++)
        {
        		System.out.print(a[i][j]+" ");
        }
        	 System.out.println();
        }
       
	}

}

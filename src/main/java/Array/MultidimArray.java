package Array;

public class MultidimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int[3][3];
		int [][] b = {{1,2},{2,3},{3,4}};
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j<b[i].length;j++)
					{
				System.out.print(b[i][j]+" ");
					}
					System.out.println();
		}

	}

}

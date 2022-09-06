package Thread;

public class Connection1 extends Thread
{
	

	public void run()
	{
		System.out.println("Iam vinod kumar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection1 th=new Connection1();
//		Thread th1=new Thread();
//		th1.start();
		th.start();

	}

}

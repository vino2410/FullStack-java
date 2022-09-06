package Thread;

public class Connection2 implements Runnable
{
	public void run()
	{
		System.out.println("Vinod is a good boy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection2 th2=new Connection2();
		Thread th1=new Thread(th2);
		th1.start();

	}

}

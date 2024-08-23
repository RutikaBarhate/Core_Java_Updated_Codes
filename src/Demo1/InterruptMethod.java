package Demo1;

public class InterruptMethod extends Thread
{
	public void run()
	{
		System.out.println("0th Statement");
		for(int i=1;i<=2;i++)
		{
			System.out.println(+i+ "th Statement");
		}
		try 
		{
			Thread.sleep(10000);
		} 
		catch (Exception e) 
		{
			System.out.println("Catch block executed");
		}
		System.out.println("Done");
	}
	public static void main(String[] args) 
	{
		InterruptMethod obj = new InterruptMethod();
		Thread t = new Thread(obj);
		t.start();
		t.interrupt();
	}
}

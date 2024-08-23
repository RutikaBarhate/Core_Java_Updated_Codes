package Demo1;

public class YieldMethod extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
		System.out.println("Yield method called "+i);
		}
	}
	public static void main(String[] args) 
	{
		YieldMethod obj = new YieldMethod();
		obj.start();
		Thread.yield();
	}
	
}

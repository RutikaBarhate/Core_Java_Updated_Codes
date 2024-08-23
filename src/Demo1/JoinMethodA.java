package Demo1;

public class JoinMethodA extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("JoinMethodA called "+i);
		}
		
	}
}

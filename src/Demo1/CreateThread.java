package Demo1;

import java.security.DomainCombiner;

public class CreateThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("run() called" +i);
		}
		
	}
	public static void main(String[] args) 
	{
		CreateThread obj = new CreateThread();
		Thread t = new Thread(obj);
		t.start();
	}
}

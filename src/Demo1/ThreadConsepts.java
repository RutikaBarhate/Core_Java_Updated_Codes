package Demo1;

public class ThreadConsepts extends Thread 
{
	public void run()
	{
		String Name = Thread.currentThread().getName();
		int Priority = Thread.currentThread().getPriority();
		for(int i=0;i<=5;i++)
		{
			System.out.println(Name+ "(" +Priority+ ")"+"run() executed " +i);
		}
	}
	public static void main(String[] args) 
	{
		ThreadConsepts obj = new ThreadConsepts();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
	}
}

package Demo1;

public class SynchronizedMethod extends Thread
{
	public void run()
	{
		meth();
	}
	synchronized void meth()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(name+ " Synchronization method called "+i);
		}
	}
	public static void main(String[] args) 
	{
		SynchronizedMethod obj = new SynchronizedMethod();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.start();
		t2.start();
		
	}
}

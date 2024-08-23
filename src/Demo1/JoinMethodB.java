package Demo1;

public class JoinMethodB 
{
	public static void main(String[] args) throws InterruptedException
	{
		JoinMethodA aobj = new JoinMethodA();
		aobj.start();
		aobj.join();
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("JoinMethodB called "+i);
		}
	}
}

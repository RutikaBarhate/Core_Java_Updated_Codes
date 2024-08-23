package Demo1;

public class OverrideA 
{
	public void meth1()
	{
		System.out.println("meth1 is Executed");
	}
	static void meth2(int a)
	{
		System.out.println("meth2 is Exicuted " +a);
	}
	 int meth3(int a, String s)
	{
		System.out.println("meth3 is Exicuted "+a);
		System.out.println("s " +s);
		return 100;
	}
	String meth4(String s)
	{
		System.out.println("meth4 is Exicutes "+s);
		return s;
	}
}

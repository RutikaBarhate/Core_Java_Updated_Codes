package Demo1;

public abstract class AbstractA 
{
	abstract void meth1();
	abstract void meth2(String s);
	
	static void meth3()
	{
		System.out.println("Normal method 3 called");
		System.out.println("Rutika");
	}
	
	void meth4()
	{
		System.out.println("meth4 is called");
	}
	
	AbstractA()
	{
		System.out.println("Constructor is called");
	}
	public static void main(String[] args) 
	{
		AbstractA.meth3();
	}
}

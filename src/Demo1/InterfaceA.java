package Demo1;

public interface InterfaceA 
{
	void meth1();
	
	default void meth2()
	{
		System.out.println("Default Method called");
		this.meth4();
	}
	static void meth3()
	{
		System.out.println("ststic method called");
	}
	private void meth4()
	{
		System.out.println("Private method called");
	}
	public static void main(String[] args) 
	{
		InterfaceA.meth3();
		
	}
}

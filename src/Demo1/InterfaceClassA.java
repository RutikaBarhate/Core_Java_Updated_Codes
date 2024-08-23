package Demo1;

public class InterfaceClassA implements InterfaceA
{
	public void meth1()
	{
		System.out.println("Abstract meth1 called");
	}
	public static void main(String[] args) 
	{
		InterfaceA aobj = new InterfaceClassA();
				aobj.meth2();
				aobj.meth1();
	}
}

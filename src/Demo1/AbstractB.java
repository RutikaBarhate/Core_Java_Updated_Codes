package Demo1;

public class AbstractB extends AbstractA 
{
	@Override
	void meth1()
	{
		System.out.println("Abstract meth1 called");
	}
	
	void meth2(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		AbstractA aobj = new AbstractB();
		aobj.meth1();
		aobj.meth2("I Love Java");
		aobj.meth4();
	}
}

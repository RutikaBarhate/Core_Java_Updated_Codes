package Demo1;

public class OverrideB extends OverrideA
{
	@Override
	public void meth1()
	{
		System.out.println(10);
	}
	static void meth2(int a)
	{
		System.out.println(20);
	}
	int meth3(int a, String s)
	{
		System.out.println(30);
		return a;
	}
	String meth4(String s)
	{
		System.out.println(40);
		return s;
	}
	public static void main(String[] args) 
	{
		OverrideA aobj = new OverrideA();
		aobj.meth1();
		aobj.meth2(100);
		aobj.meth3(100, "java");
		aobj.meth4("java");
		System.out.println("-------------------------------------");
		OverrideA aobj1 = new OverrideB();
		aobj1.meth1();
		aobj1.meth2(200);
		aobj1.meth3(500, "java");
		aobj1.meth4("rutika");
		
	}
	
}

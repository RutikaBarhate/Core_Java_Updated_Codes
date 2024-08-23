package Demo1;

public class InheritanceB extends InheritanceA
{
	void meth2()
	{
		System.out.println("InheritanceB called");
	}
	public static void main(String[] args) 
	{
		InheritanceA aobj = new InheritanceA();
		aobj.meth1();
		
		InheritanceA aobj1 = new InheritanceB();
		aobj1.meth1();
		
		InheritanceB bobj = new InheritanceB();
		bobj.meth1();
		bobj.meth2();
	}
}

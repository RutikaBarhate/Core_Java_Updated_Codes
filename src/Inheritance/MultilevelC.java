package Inheritance;
import Demo1.MultilevelB;
public class MultilevelC extends MultilevelB 
{
	public void meth3()
	{
		System.out.println("Meth3 called");
	}
	public static void main(String[] args) 
	{
		MultilevelC cobj = new MultilevelC();
		cobj.meth3();
		cobj.meth2();
		cobj.meth1();
	}
}

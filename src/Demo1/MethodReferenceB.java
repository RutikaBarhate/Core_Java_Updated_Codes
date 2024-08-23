package Demo1;

public class MethodReferenceB 
{
	void meth1()
	{
		System.out.println("Implementing Method Reference");
		
		MethodRefInter x = new MethodReferenceA()::display; //Non Static method referencing
		//MethodRefInter x = MethodReferenceA::meth1; // Static method referencing 
		//MethodRefInter x = MethodReferenceA::new; //Constructor referencing
		x.show();
		
	}
	public static void main(String[] args) 
	{
		new MethodReferenceB().meth1();
	}
}

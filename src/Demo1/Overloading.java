package Demo1;

public class Overloading 
{
	public int meth1(int a, int b) 
	{
		System.out.println(a+b);
		return b;
	}
	public int meth1(int a, int b, int c)
	{
		System.out.println(a+b+c);
		return a;
	}
	public static void main(String[] args) 
	{
		Overloading obj = new Overloading();
		obj.meth1(10 , 20);
		obj.meth1(12, 20, 30);
		
	}
}

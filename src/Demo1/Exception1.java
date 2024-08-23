package Demo1;
import java.util.Scanner;

public class Exception1 
{
	Scanner sc = new Scanner(System.in);
	void meth1()
	{
		System.out.println(10);
	
	try
	{
		System.out.println("Try Block Executed");
		System.out.println("Please enter a Number");
		System.out.println("====>" +20/sc.nextInt());
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch block Exicuted");
		//System.out.println(e.getMessage());
		//System.out.println(e.toString());
		//e.printStackTrace();
	}
	finally
	{
		System.out.println("Finally Bloc exicuted");
	}
	System.out.println(30);
	sc.close();
	}
	
	public static void main(String[] args) 
	{
		Exception1 obj = new Exception1();
		obj.meth1();
	}
			
}

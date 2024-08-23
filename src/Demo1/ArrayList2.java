package Demo1;
//Example program for override toString() method
public class ArrayList2 
{
	public String toString()
	{
		return "Java is Awesome";
	}
	
	public static void main(String[] args) 
	{
		ArrayList2 al = new ArrayList2();
		System.out.println(al);
		System.out.println(al.toString());
	}
}

package Demo1;

public class ReverseString 
{
	void meth()
	{
		System.out.println("Implementing Reverse String");
		String s = "Rutika";
		String ReverseString = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			ReverseString = ReverseString + s.charAt(i);
		}
		System.out.println("the Reverse String of "+s+" is: ");
		System.out.println(ReverseString);
	}
	public static void main(String[] args) 
	{
		new ReverseString().meth();
	}
}

package Demo1;
//TO Check less than equal to 5 length of string Count

import java.util.ArrayList;

public class StramAPI2 
{
	void meth()
	{
		System.out.println("Implementing Stream API");
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rutika");
		al.add("Riya");
		al.add("Aarrya");
		al.add("Sakshi");
		al.add("Anjalii");
		al.add("Bhagyashree");
		
		long result=al.stream().filter(data-> data.length()<=6).count();
		System.out.println("There are "+result+" element whos length is <=6");
		
	}
	public static void main(String[] args) 
	{
		new StramAPI2().meth();
	}
}

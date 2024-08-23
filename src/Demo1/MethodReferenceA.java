package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class MethodReferenceA 
{
	void display()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 Integer Element");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("al : "+al);
		Collections.sort(al);
		System.out.println();
		
		System.out.println("Implementing Element in Normal and Forward Direction");
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println();
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		sc.close();
	}
	static void meth1()
	{
		System.out.println("Static Method Referance Executed");
	}
	
	public MethodReferenceA() 
	{
		System.out.println("Constructor Reference Executed ");
	}
}

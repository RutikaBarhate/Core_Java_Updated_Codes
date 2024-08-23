package Demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Set 
{
	void meth()
	{
		System.out.println("Implementingn set implement classes");
		HashSet<Object> set = new HashSet<Object>();
		
		set.add(10);
		set.add(20);
		set.add("java");
		set.add(null);
		set.add(10);
		set.add(30);
		System.out.println(set);
		System.out.println();
		
		System.out.println("Retriving Data by using Iterator");
		Iterator<Object> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("Passing Hasset into ArrayList");
		ArrayList<Object> al = new ArrayList<Object>(set);
		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println();
		
		System.out.println("In Reverse Oeder");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println();
		
	}
	public static void main(String[] args) 
	{
		Set obj = new Set();
		obj.meth();
	}
}

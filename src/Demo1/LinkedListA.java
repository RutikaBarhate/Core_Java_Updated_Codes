package Demo1;

import java.util.ListIterator;
import java.util.LinkedList;

public class LinkedListA 
{
	void meth1()
	{
		System.out.println("Implementing LinkedList");
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("Java");
		ll.add(40);
		ll.add(null);
		ll.add(50);
		
		System.out.println(ll);
		System.out.println();
		
		System.out.println("Retriving Data by using ListIterator");
		ListIterator<Object> li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println();
		
		System.out.println("Retriving Data by using ListIterator in Reverse Order");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		LinkedListA obj = new LinkedListA();
		obj.meth1();
		
	}
}

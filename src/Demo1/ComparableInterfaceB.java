package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableInterfaceB 
{
	void meth()
	{
		System.out.println("Sorting Data From user Defined Class Object");
		ArrayList<ComparableInterfaceA> al = new ArrayList<ComparableInterfaceA>();
		
		ComparableInterfaceA obj1 = new ComparableInterfaceA("Rutika",101,"Java");
		ComparableInterfaceA obj2 = new ComparableInterfaceA("Riya",102,"AWS");
		ComparableInterfaceA obj3 = new ComparableInterfaceA("Arrya",103,"SQL");
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		Collections.sort(al);
		
		Iterator<ComparableInterfaceA> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		new ComparableInterfaceB().meth();
	}
}

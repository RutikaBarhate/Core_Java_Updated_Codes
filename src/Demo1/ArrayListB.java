package Demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListB 
{
	void meth1()
	{
		System.out.println("passing user define class object into an arraylist");
		ArrayList<ArrayListA> ar = new ArrayList<ArrayListA>();
		
		ArrayListA obj1 = new ArrayListA(10, "Rutika", "Entc");
		ArrayListA obj2 = new ArrayListA(20, "yukta", "Entc");
		ArrayListA obj3 = new ArrayListA(30, "kajal", "Entc");
		ArrayListA obj4 = new ArrayListA(40, "kalyani", "Entc");
		
		ar.add(obj1);
		ar.add(obj2);
		ar.add(obj3);
		ar.add(obj4);
		
		System.out.println(ar);
		System.out.println();
		
		System.out.println("Retriving the data by using Iterator Interface");
		Iterator<ArrayListA> i = ar.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	public static void main(String[] args) 
	{
		ArrayListB bobj = new ArrayListB();
		bobj.meth1();
	}
}

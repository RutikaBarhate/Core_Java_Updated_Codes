package Demo1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StramAPI1 
{
	void meth1()
	{
		System.out.println("Implementing Stream API");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(33);
		al.add(99);
		al.add(77);
		al.add(22);
		
		//System.out.println("Implementing Data in Sorted Format");
		//Collections.sort(al);
		System.out.println("Impelementing data in reverse order");
		Collections.sort(al,Collections.reverseOrder());
		//System.out.println(al);
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("Implementing data by using forEach Method");
		al.forEach(data-> System.out.println(data));
	}
	public static void main(String[] args) 
	{
		new StramAPI1().meth1();
	}
}

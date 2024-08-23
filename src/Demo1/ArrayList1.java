package Demo1;
//same for Vector
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{
	void meth1()
	{
		System.out.println("Implementing ArrayList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		//al.add("java");
		al.add(20);
		//al.add(null);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(90);
		
		System.out.println(al+ "\n");
		
		System.out.println("size():" +al.size());
		System.out.println("get():" +al.get(0));
		System.out.println("get():" +al.get(al.size()-1) +"\n");
		
		System.out.println("Retriving Data by using for loop");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Retriving data by using for loop in reverse order");
		for(int i=al.size()-1;i>0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("Retriving data by using for each loop");
		for (int o:al)  //(Object o: al) - use for print all type of data
		{
			System.out.print(o+" ");
		}
		System.out.println();
		
		System.out.println("Retriving the data by using Iterator interface");
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		
		System.out.println("_____________________METHODS_________________________");
		System.out.println("isEmpty(): "+al.isEmpty());
		System.out.println("Contains(): "+al.contains(60));
		System.out.println("Contains(): "+al.contains(100));
		System.out.println("remove(): "+al.remove((Object)90));
		System.out.println("remove(): "+al.remove(2));
		
	}
	public static void main(String[] args) 
	{
		ArrayList1 ar = new ArrayList1();
		ar.meth1();
	}
}

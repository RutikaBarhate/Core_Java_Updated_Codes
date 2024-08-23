package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI3 
{
	void meth()
	{
		System.out.println("Implementing stream API \n");
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(11);
		al.add(22);
		al.add(44);
		al.add(33);
		al.add(88);
		al.add(66);
		
		//Stream<Integer>s1 = al.stream();
		//Stream<Integer> s2 = s1.map(x->x-10);
		//List li = s2.collect(Collectors.toList());
		
		List li = al.stream().map(x->x-10).collect(Collectors.toList());
		
		System.out.println(li);
		
		List li2= (List)li.stream().sorted().collect(Collectors.toList());
		System.out.println(li2);
	}
	public static void main(String[] args) 
	{
		new StreamAPI3().meth();
	}
}

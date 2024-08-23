package Demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class HashMapA 
{
	void meth()
	{
		System.out.println("Implementing map Implemented classes");
		HashMap<Object, Object> map = new HashMap<Object,Object>();
		//LinkedHashMap<Object, Object> map = new LinkedHashMap<Object,Object>();
		
		map.put(101,"Rutika");
		map.put(102,"Shruti");
		map.put(103,"Riya");
		map.put(null,null);
		map.put(104,"Rutika");
		System.out.println(map);
		System.out.println();
		
		System.out.println("get(): "+map.get(103));
		System.out.println();
		
		System.out.println("Rtriving Keys Using HashSet");
		HashSet<Object> hs = new HashSet<Object>(map.keySet());
		Iterator<Object> i1 = hs. iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println();
		
		System.out.println("Retriving Keys Using LinkedHashSet");
		LinkedHashSet<Object> lh1 = new LinkedHashSet<Object>(map.keySet());
		Iterator<Object> i2 = lh1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println();
		
		System.out.println("Retriviarrayng key using ArrayList");
		ArrayList<Object> al = new ArrayList<Object>(map.keySet());
		Iterator<Object> i3 = al.iterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		System.out.println();
		
		System.out.println("Retriving Key-Value Pairs");
		LinkedHashSet<Object> lh2 = new LinkedHashSet<Object>(map.entrySet());
		Iterator<Object> i4 = lh2.iterator();
		while(i4.hasNext())
		{
			Entry e = (Entry)i4.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		HashMapA obj = new HashMapA();
		obj.meth();
	}
}


package Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SortingMethods 
{
	void meth()
	{
		System.out.println("Sorting Data by using Array");
		int arr[] = {12,80,50,30,56,39};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		System.out.println();
		
		System.out.println("Sorting Data by using ArrayList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(90);
		al.add(50);
		al.add(30);
		al.add(10);
		System.out.println("Before Sorting: "+al);
		Collections.sort(al);
		System.out.println("After Sorting: "+al);
		System.out.println();
		
		System.out.println("Sorting Data by using Hashset");
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(20);
		hs.add(70);
		hs.add(30);
		hs.add(60);
		hs.add(50);
		System.out.println("Before Sorting: "+hs);
		ArrayList<Integer> al1 = new ArrayList<Integer>(hs);
		Collections.sort(al1);
		System.out.println("After Sorting: "+al1);
		
		
	}
	public static void main(String[] args) 
	{
		SortingMethods obj = new SortingMethods();
		obj.meth();
	}
}

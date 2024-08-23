package Demo1;

import java.util.Arrays;

public class ParalleSorting 
{
	void meth()
	{
		System.out.println("Implementing Parallel Sorting");
		
		int arr[]= {70,50,90,40,20,30};
		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println();
		
		Arrays.parallelSort(arr,1,4);
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) 
	{
		new ParalleSorting().meth();
	}
}

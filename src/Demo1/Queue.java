package Demo1;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Queue 
{
	void meth()
	{
		System.out.println("Implementing PriorityQueue");
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		
		pq.add(20);
		pq.add(10);
		pq.add(50);
		pq.add(90);
		pq.add(80);
		
		System.out.println(pq);
		System.out.println();
		
		System.out.println("remove(): "+pq.remove());
		System.out.println(pq);
		
		System.out.println("peek(): "+pq.peek());
		System.out.println(pq);
		
		System.out.println("poll(): "+pq.poll());
		System.out.println(pq);
		
		TreeSet<Object> ts = new TreeSet<Object>(pq);
		System.out.println("TreeSet: "+ts);
	}
	public static void main(String[] args) 
	{
		Queue obj = new Queue();
		obj.meth();
	}
}

package Demo1;

public class LargestElement 
{
	void meth()
	{
		int arr[] = {10,100,50,990,30,68};
		int max = arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}	
	public static void main(String[] args) 
	{

		LargestElement obj = new LargestElement();
		obj.meth();
	}
}

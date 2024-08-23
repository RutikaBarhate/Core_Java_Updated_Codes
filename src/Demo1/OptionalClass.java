package Demo1;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalClass 
{
	void meth()
	{
		System.out.println("Implementing Optional Class");
		
		String arr[] = new String[5];
		arr[1]="Rutika";
		arr[2]="Riya"; 
		
		//System.out.println(arr[0].toUpperCase());
		
		Optional<String> o = Optional.ofNullable(arr[3]);
		//System.out.println(o);
		
		if(o.isPresent())
		{
			System.out.println("Data is Present");
			System.out.println(o.get());
		}
		else 
		{
			System.out.println("Its Empty");
		}


	}
	public static void main(String[] args)
	{
		new OptionalClass().meth();
	}
}

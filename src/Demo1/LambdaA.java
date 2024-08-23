package Demo1;


public class LambdaA 
{
	void display()
	{
		System.out.println("Implementing Lambda Expression");
		LambdaInterA x = ()-> System.out.println("Hello Word");
		x.meth1();
		System.out.println();
		
		LambdaInterB y = (int s, int t)-> System.out.println("Addition : "+(s+t));
		y.meth2(10, 20);
		System.out.println();
		
		LambdaInterC z = (int p, int q)->
		{
			if(p<=q)
			{
				System.out.println("q : "+q);
				System.out.println("if Block Executed");
				return p+100;
			}
			else
			{
				System.out.println("p : "+p);
				System.out.println("Else Block Executed");
				return q+500;
			}
		};
		int result = z.meth3(5,10);
		System.out.println("Result : "+result);
	}
	public static void main(String[] args) 
	{
		new LambdaA().display();
	}
}

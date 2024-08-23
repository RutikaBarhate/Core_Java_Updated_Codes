package Demo1;

import java.util.Scanner;

public class EncapsulationB 
{
	Scanner sc = new Scanner(System.in);
	void meth1()
	{
		EncapsulationA aobj = new EncapsulationA();
		System.out.println("Enter your name ");
		aobj.setEmpName(sc.nextLine());
		
		System.out.println("Enter your Id");
		aobj.setEmpId(sc.nextInt());
		
		System.out.println("Enter your Dept");
		aobj.setEmpDept(sc.next());
		
		
		System.out.println("____________________________");
		
		System.out.println("name :" +aobj.getEmpName());
		
		System.out.println("Id : " +aobj.getEmpId());
		
		System.out.println("Dept :" +aobj.getEmpDept());
		
	}
	public static void main(String[] args) 
	{
		new EncapsulationB().meth1();
	}
}

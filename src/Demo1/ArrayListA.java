package Demo1;

public class ArrayListA 
{
	int empId;
	String empName;
	String empDept;
	
	public ArrayListA(int empId, String empName, String empDept)
	{
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
	}
	@Override
	public String toString()
	{
		return empId+ " " +empName+ " " +empDept;
	}
}

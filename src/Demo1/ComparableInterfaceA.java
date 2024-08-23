package Demo1;

public class ComparableInterfaceA implements Comparable<ComparableInterfaceA>
{
	String empName;
	int empId;
	String empDept;
	
	public ComparableInterfaceA(String empName,int empId, String empDept)
	{
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
	}
	@Override
	public String toString()
	{
		return empName+ " " +empId+ " " +empDept;
	}
	@Override
	public int compareTo(ComparableInterfaceA o) 
	{
		return this.empId-o.empId; //Sorting Basing on empId
		//return this.empName.compareTo(o.empName); //Sorting Basing on empName
		//return this.empDept.compareTo(o.empDept); // Sorting Basing on empDept
		
	}
}

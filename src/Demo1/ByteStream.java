package Demo1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ByteStream 
{
	void ReadMethod() throws Exception
	{
		System.out.println("reading The Data From The file");
		FileInputStream fis = new FileInputStream("C:\\Users\\Rutika Barhate\\Downloads\\file1.txt");
		System.out.println("Connection Created");
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.println((char)x);
		}
		System.out.println("Data Retrived");
		fis.close();
	}
	
	void writeMethod() throws Exception
	{
		System.out.println("Writing the data into a file");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rutika Barhate\\Downloads\\file2.txt",true);
		System.out.println("Connection Created");
		String name = " is My Name";
		byte arr[] = name.getBytes();
		fos.write(arr);
		System.out.println("Data Entered");
		fos.close();
	}
	
	void CopyMethod() throws Exception
	{
		System.out.println("Copying the data one file into another file");
		FileInputStream fis = new FileInputStream("C:\\Users\\Rutika Barhate\\Downloads\\file2.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rutika Barhate\\Downloads\\file3.txt");
		System.out.println("Connection created");
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write(x);
		}
		System.out.println("Data copied");
		fis.close();
		fos.close();
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		ByteStream obj = new ByteStream();
		obj.ReadMethod();
		obj.writeMethod();
		obj.CopyMethod();
	}
	
}

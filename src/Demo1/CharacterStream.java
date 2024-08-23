package Demo1;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream
{
	void ReadData() throws Exception
	{
		System.out.println("Reading the data into a file");
		FileReader fr = new FileReader("C:\\Users\\Rutika Barhate\\Downloads\\file1.txt");
		System.out.println("Connection Created");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Data Retrived");
		fr.close();
	}
	
	void WriteData() throws Exception
	{
		System.out.println("Write the data into a file");
		FileWriter fw = new FileWriter("C:\\Users\\Rutika Barhate\\Downloads\\file4.txt",true);
		System.out.println("Connection Created");
		String data = ", because this is awesome";
		fw.write(data);
		System.out.println("Data Entered");
		fw.close();
	}
	
	void CopyData() throws Exception
	{
		System.out.println("Copying the data from one file into another file");
		FileReader fr = new FileReader("C:\\Users\\Rutika Barhate\\Downloads\\file4.txt");
		FileWriter fw = new FileWriter("C:\\Users\\Rutika Barhate\\Downloads\\file5.txt");
		System.out.println("Connection Created");
		int x;
		while((x=fr.read())!=-1)
		{
			fw.write(x);
		}
		System.out.println("data Copied");
		fr.close();
		fw.close();
	}
	
	public static void main(String[] args) throws Exception
	{
		CharacterStream obj = new CharacterStream();
		obj.ReadData();
		obj.WriteData();
		obj.CopyData();
	}
}

package Demo1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStream 
{
	void ReadData() throws Exception
	{
		System.out.println("Reading data From the file");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Rutika Barhate\\Downloads\\file1.txt"));
		System.out.println("Connection Created");
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("data Retrived");
		bis.close();
	}
	
	void WriteData() throws Exception
	{
		System.out.println("Write a data into a file");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Rutika Barhate\\Downloads\\file6.txt"));
		System.out.println("Connection Created");
		String data = "Today is High Alert in Nashik";
		byte arr[] = data.getBytes();
		bos.write(arr);
		bos.close();
	}
	
	void CopyData() throws Exception
	{
		System.out.println("Copy Data From one file into another file");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Rutika Barhate\\Downloads\\file6.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Rutika Barhate\\Downloads\\file7.txt"));
		System.out.println("Connection Created");
		int x;
		while((x=bis.read())!=-1)
		{
			bos.write(x);
		}
		System.out.println("Data Copied");
		bis.close();
		bos.close();
		
	}
	
	public static void main(String[] args) throws Exception
	{
		BufferedStream obj = new BufferedStream();
		obj.ReadData();
		obj.WriteData();
		obj.CopyData();
	}
}

package Demo1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream 
{
	void WriteData() throws Exception
	{
		System.out.println("Writing primitive datatype into a file");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Rutika Barhate\\Downloads\\file1.txt"));
		System.out.println("Connection Created");
		dos.writeInt(10);
		dos.writeChar('R');
		dos.writeBoolean(true);
		System.out.println("Data Entered");
		dos.close();
		
		System.out.println("Reading Secure data from the file");
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Rutika Barhate\\Downloads\\file1.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println("data retrived");
		dis.close();
	}
	
	public static void main(String[] args) throws Exception
	{
		DataStream obj = new DataStream();
		obj.WriteData();
	}
}

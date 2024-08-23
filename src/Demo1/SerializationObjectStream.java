package Demo1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SerializationObjectStream 
{
	public static void main(String[] args) throws Exception 
{
		ObjectStreamA aobj = new ObjectStreamA();
		ObjectStreamB bobj = new ObjectStreamB();
		
		System.out.println(aobj.a+" "+aobj.b);
		System.out.println(bobj.x+" "+bobj.y);
	
		System.out.println("Performing Serialization");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rutika Barhate\\Downloads\\Serialization.ser"));
		System.out.println("Connection Created");
		
		oos.writeObject(aobj);
		oos.writeObject(bobj);
		
		System.out.println("Serialization Done");
	
		System.out.println("De-Serialization Performing");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Rutika Barhate\\Downloads\\Serialization.ser"));
		System.out.println("Connection Created");
		
		ObjectStreamA aobj1 = (ObjectStreamA)ois.readObject();
		ObjectStreamB bobj1 = (ObjectStreamB)ois.readObject();
		
		System.out.println(aobj1.a+" "+aobj1.b);
		System.out.println(bobj1.x+" "+bobj1.y);
		
		oos.close();
		ois.close(); 
}
}

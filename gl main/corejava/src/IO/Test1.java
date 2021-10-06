package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream stream=new DataOutputStream(new FileOutputStream("c:\\welcome\\emp1.dat"));
		
		stream.writeInt(1001);
		stream.writeUTF("ram kumar");
		stream.writeFloat(6676.778f);
		
		stream.close();
		
		DataInputStream stream1 = new DataInputStream(new FileInputStream("c:\\welcome\\emp1.dat"));

		System.out.println("id "+stream1.readInt());
		System.out.println("name "+stream1.readUTF());
		System.out.println("salary "+stream1.readFloat());
		
		stream1.close();
		
	}
}

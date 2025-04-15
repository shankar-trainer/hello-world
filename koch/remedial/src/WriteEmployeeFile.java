import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Serialization
public class WriteEmployeeFile {

    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream= null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("emp.txt"));
            Employee employee1=new Employee();
            employee1.setId(10001);
            employee1.setName("suresh kumar");
            employee1.setSalary(20000);

            employee1.setState("andhra pradesh");
            objectOutputStream.writeObject(employee1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("object written to the file ");

    }
}

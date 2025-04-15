import java.io.*;

public class ReadEmployeeFile {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("emp.txt"));

        Object o = inputStream.readObject();
        Employee employee= (Employee) o;
        System.out.println("Employee Object value ");
        System.out.println("id "+employee.getId());
        System.out.println("name "+employee.getName());
        System.out.println("salary "+employee.getSalary());
        System.out.println("state "+employee.getState());

    }
}

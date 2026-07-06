public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setId(10001);
        employee1.setName("amit kumar");
        employee1.setSalary(20000);

        System.out.println("employee1 data ");

        System.out.println("\t id "+employee1.getId());
        System.out.println("\t name "+employee1.getName());
        System.out.println("\t salary "+employee1.getSalary());

        Employee employee[]=new Employee[4];// create array of employee

        int id[]={10003,10004,10001,10002};
        float salary[]={12000,9000,40000,60000};
        String name[]={"ram kumar","shyam kumar","amit kumar","suresh kumar"};

        for (int i = 0; i <employee.length ; i++) {
            employee[i]=new Employee();// create object of each element of employee array
            employee[i].setId(id[i]);
            employee[i].setName(name[i]);
            employee[i].setSalary(salary[i]);
        }
       for(Employee e:employee){
           System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
       }

    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        // sout
        System.out.println("Employee Data ");

        Employee employee = new Employee();

        Address address = new Address();
        address.setAddrId(1);
        address.setAddrLocation("chennai");
        address.setAddrState("tamil nadu");

        employee.setEmployeeId(100001);
        employee.setEmployeeName("suresh parsad");
        employee.setEmployeeSalary(35000);

        employee.setAddress(address);

        System.out.println("\t id " + employee.getEmployeeId());
        System.out.println("\t name " + employee.getEmployeeName());
        System.out.println("\t salary " + employee.getEmployeeSalary());
        System.out.println("\n\t Address\n ");

        Address address1 = employee.getAddress();
        System.out.println("\t addr id " + address1.getAddrId());
        System.out.println("\t addr id " + employee.getAddress().getAddrId());

        System.out.println("\t addr location " + address1.getAddrLocation());

        System.out.println("\t state   " + employee.getAddress().getAddrState());

    }
}


public class Employee {

  private int empId;
  private String empName;
  private float empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public Employee(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
}

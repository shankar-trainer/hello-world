// child class
public class Manager extends Person{

    // adding additional attribute
    private String location;
    private String companyName;
    private int age;
    private float pf;

    public String getLocation() {
        return location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAge() {
        return age;
    }

    public float getPf() {
        return pf;
    }

    public Manager(String location, String companyName, int age, float pf) {
        this.location = location;
        this.companyName = companyName;
        this.age = age;
        this.pf = pf;
    }

    @Override
    void personInfo() {
        super.personInfo();
        System.out.println("\tage is "+getAge());
        System.out.println("\tCompany Name is "+getCompanyName());
        System.out.println("\tlocation is "+getLocation());
        System.out.println("\tpf is "+getLocation());
        System.out.println("\tage is "+getAge());
        System.out.println("\tgross salary "+(personSalary-(personSalary*getPf()/100)));
    }

    public static void main(String[] args) {
        Manager manager=new Manager("delhi","coforge",35,5.5f);
        manager.personId=898989;
        manager.personName="suresh kumar";
        manager.personSalary=45000;
        manager.personInfo();
    }
}

public class Teacher  extends  Person{
    private float pf;
    private  float hra;
    private  String location;

    public Teacher(int personId, String personName, int personSalary, float pf, float hra, String location) {
        super(personId, personName, personSalary);
        this.pf = pf;
        this.hra = hra;
        this.location = location;
    }
    @Override
    public void personInfo() {
         super.personInfo();
        System.out.println("\t hra "+hra);
        System.out.println("\t pf "+pf);
        System.out.println("\t gross salary  "+(getPersonSalary()-(getPersonSalary()*pf)+(getPersonSalary()*hra)));
        System.out.println("\t location "+location);
    }
    public static void main(String[] args) {
        Teacher teacher=new Teacher(1,"lalan kumar",12000,0.05f,0.09f,"delhi");
        teacher.personInfo();
    }

}

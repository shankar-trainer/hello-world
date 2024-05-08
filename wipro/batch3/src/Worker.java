public class Worker {

    private int workerId;
    private String workerName;
    private float workerWages;
    // all above three are instance variable
    //each worker will be having separate copy of instance variable

    private static String company;
    // static/class variable

    int count=0;
    static int count1=0;

    public static String getCompany() {
        return company;
    }

    public int getWorkerId() {
        return workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public float getWorkerWages() {
        return workerWages;
    }

    // inside constructor initialize instance variable
    public Worker() {
        this.workerId = 988998;
        this.workerName = "shyam kumar";
        this.workerWages = 800;

        System.out.println("default constructor called ");
        count++;
        count1++;
    }

    //inside static block initialize class variable
    static {company="d k enterprises";
        System.out.println("static block called");
    }

    //inside static method other static members can be called directly(same class) but outside class with class name
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        System.out.println( "worker company "+company);// inside class
        System.out.println( "worker company "+Worker.company);// inside/outside  class
        //System.out.println( "worker id "+Worker.workerId);// error
        System.out.println( "worker id "+worker1.workerId);
        System.out.println( "worker name "+worker1.workerId);
        System.out.println( "worker wages "+worker1.workerId);

        System.out.println( "total object created "+count1);
        System.out.println( "worker1 count "+worker1.count);
        System.out.println( "worker2 count "+worker2.count);
        System.out.println( "worker3 count "+worker3.count);

        System.out.println( "worker1 count1 "+worker1.count1);
        System.out.println( "worker2 count1 "+worker2.count1);
        System.out.println( "worker3 count2 "+worker3.count1);
    }

}

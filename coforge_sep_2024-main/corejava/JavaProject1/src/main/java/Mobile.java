public class Mobile {

    long regNo;
    String model;
    float cost;

    public Mobile() {
        System.out.println("default constructor called ");
        this.regNo = 887878787;
        this.model = "samsung";
        this.cost = 55000;
    }
    void mobileInfo(){
        System.out.println("\n\treg no " + regNo);
        System.out.println("\tmodel " + model);
        System.out.println("\tcost " + cost);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        System.out.println("mobile info");
        mobile.mobileInfo();

        System.out.println("mobile1 info");
        mobile1.mobileInfo();
        System.out.println("mobile2 info");
        mobile2.mobileInfo();
    }
}

public class Kids {
    protected int id;
    protected String name;
    protected int age;

    // inside static we cannot use instance varibale directly
    //Non-static field 'id' cannot be referenced from a static context

    static void kidsInfo(Kids kid){
        System.out.println("this is kids information");
        //System.out.println(" id is "+id);  // error
        System.out.println(" id is "+kid.id);
        System.out.println(" name is "+kid.name);
        System.out.println(" age is "+kid.age);
    }
}

class MyKid extends  Kids {
    private String location;
    private String state;

    //@Override // error Static methods cannot be annotated with @Overridd
    // static method can not be overridden but it can be re written

    static void kidsInfo(MyKid kid) {
        System.out.println("this is kids information");
        //System.out.println(" id is "+id);  // error
        System.out.println(" id is "+kid.id);
        System.out.println(" name is "+kid.name);
        System.out.println(" age is "+kid.age);
        System.out.println(" location is "+kid.location);
        System.out.println(" state  is "+kid.state);
    }

    public static void main(String[] args) {
        MyKid myKid=new MyKid();
        myKid.id=989898;
        myKid.name="chunnu kumar";
        myKid.age=2;
        myKid.location="noida";
        myKid.state="up";

        System.out.println("\nsub class static method");
        MyKid.kidsInfo(myKid);
        System.out.println("\nsuper class static method");
        Kids.kidsInfo(myKid);


    }
}

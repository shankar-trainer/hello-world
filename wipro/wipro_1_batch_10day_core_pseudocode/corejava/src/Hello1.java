public class Hello1 {

    public static void main(String[] args) {

        int roll=989898; // int %d
        String name="rahul kumar";// string %s
        float marks=45;  // float, double %f
        char grade='c';    //char %c

/*
        System.out.println("roll is "+roll);
        System.out.println("name is "+name);
        System.out.println("marks is "+marks);
        System.out.println("grade is "+grade);
*/

        System.out.println("roll is "+roll+"\nname is "+name+"\nmarks is "+marks+"\ngrade is "+grade);
        System.out.printf("\nroll is %d\nname is %s\nmarks is %f\ngrade is %c",roll,name,marks,grade);
    }
}

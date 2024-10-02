public class Teacher {
    int id;
    String name;
  protected   void info(String s) {
        System.out.println("\t id   " + id);
        System.out.println("\t name   " + name);
    }
}

class HighSchoolTeacher extends Teacher {

    int age;
    String location;

    @Override
   public
   //protected
   //private  -- error
     void info(String s) {
        super.info("");
        System.out.println("\tage " + age);
        System.out.println("\tlocation  " + location);
    }

    public static void main(String[] args) {
        HighSchoolTeacher highSchoolTeacher = new HighSchoolTeacher();
        highSchoolTeacher.id = 10001;
        highSchoolTeacher.name = "pawan kumar";
        highSchoolTeacher.age = 34;
        highSchoolTeacher.location = "delhi";

        highSchoolTeacher.info("");
    }
}

/*
 lowest    private
           default
           protected
highest    public

 in overriding
      -- can not have weaker access modifier
      -- same method argument, and return type
 */
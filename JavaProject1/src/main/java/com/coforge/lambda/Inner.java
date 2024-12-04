package com.coforge.lambda;
class outer1{
  int roll;
  String name;

    // inner class like roll, name is a member of outer class
  // private
    class inner1{
         String country;
         String location;
        public inner1(String country, String location) {
            this.country = country;
            this.location = location;
        }
    }
}

public class Inner {

    public static void main(String[] args) {
        outer1 outer1=new outer1();
        outer1.roll=1001;
        outer1.name="suresh";

        outer1.inner1 inner1=outer1.new inner1("india","delhi");

        System.out.println("roll is "+outer1.roll);
        System.out.println("name is "+outer1.name);
        System.out.println("country is "+inner1.country);
        System.out.println("location is "+inner1.location);

    }
}

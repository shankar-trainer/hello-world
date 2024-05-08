package com.wipro.inheritance;

class Test1{
//private // cannot be inherited
// no access modifier means default
    int  display(String s){
        System.out.println( "this is Test1 display method ");
      return 0;
    }
}
public class Test2  extends Test1{
    // Override methods must have same or higher access modifier not weaker
    @Override
    //private // error weaker , lower than default
       // allowed are default(same) and higher protected, public
    //public
    protected int  display(String s1) {
        //super.display(" ");
        System.out.println("welcome to Test2 display method ");
        return 2;
    }

    public static void main(String[] args) {
        new Test2().display("");
    }
}
/*
private   -- weakest
default      |
protected    |
public       |
             V
 */

create project in intellij

remove src folder

rt .click on  main project 

Module one 
  new module -- one 
  rt.click on one -- module-info.java
  in this add 
  
  module one {
    exports one;
  }

 add follwing in one module src  
  package one;
   public class User {
    public int id=98989898;
    public String name="anand kumar";
   } 

Module two
  new module -- two 
  rt.click on two -- module-info.java
  in this add 
  module two {
    requires one;
  }

 add inside src 
  package two;
import one.User;
public class Main {
    public static void main(String[] args)
    {
        User user = new User();
        System.out.println(user.id);
        System.out.println(user.name);
    }
}
rt. click on module two

select Open Modukle Setting(F4)
 From project setting select Modules -- Dependencies
  click + sign add module one

Rum the main of module2 
    

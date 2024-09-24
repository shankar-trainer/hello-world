public class Greeting {
   protected String  display(String name){
       return  "Greeting to "+name;
   }
}

class Welcome extends  Greeting{

    @Override
   //public
    protected
 //   private
   //public
    String display(String name) {
        return "Welcome "+name;
    }
}
/*
 | private
 | default(nothing)
 | protected
 | public
 V
private methods not inherited, can not be overridden
in overridding access modifier can be same or greater not weaker
 */
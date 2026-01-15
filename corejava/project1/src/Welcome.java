public class Welcome {
   //private
   void hello(String s){
        System.out.println("hello "+s);
}
}

class Greeting extends Welcome {
    @Override
    //private  // error
    //protected
    public void hello(String s) {
        System.out.println("greeting " + s);
    }

    public static void main(String[] args) {
//        Greeting greeting = new Greeting();
        Welcome greeting = new Greeting();
        greeting.hello("mohan kumar");
    }
}
/* overridden methods cannot have weaker access modifier
public
protected
default
private
 */

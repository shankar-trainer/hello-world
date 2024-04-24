
public class Shape {
  void draw(){
      System.out.println("Draw shape");
  }
  void area(){
      System.out.println( "area of shape");
  }
}

class Rectangle extends  Shape{
     float  width;
     float  length;
    // Override can not have weaker access modifier ,can have same or higher access modifier
    @Override
 // private  // error
    //protected // work
    //public  // work
    void draw(){
        System.out.println("Draw Rectangle");
    }

    @Override
    void area() {
        System.out.println("Area of rectangle is "+(width*length));
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.length=888;
        rectangle.width=56;
        rectangle.area();
        rectangle.draw();
    }
}
/*
 private   -- lowest
 default
 protected
 public   -- highest


 */

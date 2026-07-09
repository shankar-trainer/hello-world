public class Test1 {
      void hello(String s){
        System.out.println("hello world");
    }
}

class Test22 extends  Test1{

    @Override
    public  void hello(String a ) {
        System.out.println("greeting to java");
        super.hello("");
    }

    public static void main(String[] args) {
        new Test22().hello("");
    }
}/*
private
default
protected
public
        */
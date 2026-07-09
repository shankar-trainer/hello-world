public class Z {
    int x=10;
}

class Y extends  Z{
    int x=100;
    void hello(){
        int x=1000;
        System.out.println(" local x "+x);
        System.out.println(" instance x "+this.x);
        System.out.println(" super x "+super.x);
    }

    public static void main(String[] args) {
        new Y().hello();
    }
}
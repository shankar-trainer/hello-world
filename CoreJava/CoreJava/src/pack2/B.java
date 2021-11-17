package pack2;
 
import pack1.A;
 
class B extends A
{
    public B()
    {
        super(10);     //calling super class's protected constructor
    }
    public static void main(String[] args) {
		new B();
	}
}


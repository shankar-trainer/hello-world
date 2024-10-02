public class TypeCast {

    public static void main(String[] args) {

        // casting for primitive data type
        int x=100;
        float p=x; // implicit casting (lower to higher)

       double d1=5555556566767.5656;

       int p1=(int)d1;// explicit casting(higher to lower)
        System.out.println(p1);//2147483647

        //reference casting
        Number n1=90;
        Float f1=887f;
        Integer d2=78;
        n1=f1;
        n1=d2;

    //    f1= (Float) d1;
       // d1=(int)f1;

    }
}
/*
   Number
     /   \
    Float Integer
 */
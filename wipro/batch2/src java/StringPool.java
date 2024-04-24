public class StringPool {

    public static void main(String[] args) {

        // String literal without new will be  created in String pool

        String var1 = "hello";  //Object in string pool
        String var2 = "hello";  //var 2 have same value , it will refer same object in string pool

        // two reference var1, var2 and single object in string pool

        String var3 = new String("hello"); // it will create new object outside string pool

        //3 references , 2 objects

        // == to check references
        //.equals to check content

        System.out.println(var1==var2);//true
        System.out.println(var1==var3);//false

        System.out.println(var1.equals(var2));//true
        System.out.println(var1.equals(var3));//true

    }
}

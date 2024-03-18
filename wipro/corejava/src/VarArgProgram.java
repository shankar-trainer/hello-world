public class VarArgProgram {

    static void display(int a, int b, int ...c){
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        for (int z:c)
        System.out.print(z+",");
    }

    public static void main(String... args) {
        int ar[]={1,2,3,4,5};
        display(99,88,77,66,55);
        display(99,88,ar);
    }
}

package deadlock.generics;

public class GenericMethod {
    //public static void display1(Integer a[])
    public static <A> void display1(A a[]) {
        for (A a1 : a)
            System.out.print(a1 + ", ");
        System.out.println();
    }


    public static void main(String[] args) {
        Integer ar[] = {1, 2, 3, 4, 5, 6};
        Float ar1[] = {2334.0F, 566.5f, 677.67f, 768787.67f};
        String names[] = {"amit", "suresh", "kamal"};
        display1(ar);
        display1(names);
        display1(ar1);

    }
}

public class WrapperPrg1 {

    public static void main(String[] args) {

        int x=90;
        Integer x1=new Integer(x);// primitive to wrapper (boxing)
        int i = x1.intValue();// wrapper to primitive (unboxing)

        // autoboxing -- boxing+unboxing

        Integer p=9000;// primtive to wrapper,
        p++;  // wrapper to primitive      autoboxing

        //parseXXX -- static method , accepts string and convert to primitive

        String amount="2000";
        int i1 = Integer.parseInt(amount);

        float v = Float.parseFloat("34567.89f");

        Double salary=566656.677;
        String string = salary.toString();
                          //valueOf -- static method , accepts string and converts to wrapper
        Double v1 = Double.valueOf(amount);

    }
}

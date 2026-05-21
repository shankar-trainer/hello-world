package solid.isp.correct;

public class SimplePrinter  implements  Printer{
    @Override
    public void printDocument() {
        System.out.println("print document ");
    }
}


class Main{
    public static void main(String[] args) {
         Printer printer=new SimplePrinter();
         printer.printDocument();
    }
}
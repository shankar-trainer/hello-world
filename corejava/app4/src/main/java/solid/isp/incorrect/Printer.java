package solid.isp.incorrect;
public interface Printer {
    void print();
    void fax();
    void scan();
}

class MyPrinter implements  Printer{
    @Override
    public void print() {
        System.out.println("printing work");
    }

    @Override
    public void fax() {
        System.out.println("fax work");
    }

    @Override
    public void scan() {
        System.out.println("scan work");
    }
}
class MyPrinterMain{
    public static void main(String[] args) {
        Printer printer=new MyPrinter() ;
        printer.print();
        printer.fax();
        printer.scan();
    }
}

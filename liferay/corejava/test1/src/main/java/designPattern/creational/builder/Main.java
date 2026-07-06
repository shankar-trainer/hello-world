package designPattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder("100 gb","8gb").setBluetoothEnabled(true).setGraphicCardEnabled(false).build();
        System.out.println(computer);
    }
}

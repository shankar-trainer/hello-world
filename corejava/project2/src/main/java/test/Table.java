package test;

class Table {
    // The synchronized keyword ensures thread safety
    public synchronized void printTable(int n) {
//    public  void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " printing: " + (n * i));
        }
    }
}

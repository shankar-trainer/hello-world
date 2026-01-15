package test;

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
        this.setName("Thread-1"); // Give the thread a name for clarity
    }

    public void run() {
        t.printTable(5); // Calls the synchronized method
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
        this.setName("Thread-2"); // Give the thread a name for clarity
    }

    public void run() {
        t.printTable(100); // Calls the synchronized method
    }
}

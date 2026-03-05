// 1. Define the Callback Interface

public interface Callback {
    void onComplete(String result);
}
// 2. Implement the Interface in the Caller Class
 class TaskCaller implements Callback {
    public void onComplete(String result) {
        System.out.println("Callback received: " + result);
        // Additional handling logic here
    }

    public void startTask() {
        Worker worker = new Worker();
        // Pass a reference to itself as the callback implementation
        worker.doWork(this);
    }
}

class Worker {
    public void doWork(Callback callback) {
        System.out.println("Worker is doing work...");
        // Simulate some work or event
        String taskResult = "Task Finished!";
        // Invoke the callback method on the caller's instance
        callback.onComplete(taskResult);
    }
}

class Main {
    public static void main(String[] args) {
        TaskCaller caller = new TaskCaller();
        caller.startTask();
    }
}



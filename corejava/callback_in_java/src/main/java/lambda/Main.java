package lambda;

interface DataCallback {
    void onComplete(String result);
}

class Worker {
    // 2. Accept the interface as a parameter
    void fetchData(DataCallback callback) {
        System.out.println("Fetching data...");
        // Simulate a task
        String data = "Success!";
        // 3. Invoke the callback
        callback.onComplete(data);
    }
}

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        // 4. Provide the implementation via a lambda
        worker.fetchData(result -> System.out.println("Received: " + result));
    }
}
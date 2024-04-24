public class Consumer {

    int id;
    String name;
    String type;
    String country;

    public Consumer() {
    }

    // multiple overloaded constructor , each with different arguments
    public Consumer(int id, String name) {
        this(id, name, "electricty consumer");
        //this() -- call the other constructor, must be first line
        this.id = id;
        this.name = name;
    }

    public Consumer(int id, String name, String type) {
        this("india");
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Consumer(String country) {
        this.country = country;
    }

    void consumerDetail() {
        System.out.println("\nconsumer details ");
        System.out.println("\tid:" + id);
        System.out.println("\tname:" + name);
        System.out.println("\ttype:" + type);
        System.out.println("\tcountry:" + country);
    }

    public static void main(String[] args) {
        Consumer consumer = new Consumer(10001, "amit kumar");
        consumer.consumerDetail();
        Consumer consumer1 = new Consumer(10002, "sumit kumar", "gas consumer");
        consumer1.consumerDetail();
    }
}

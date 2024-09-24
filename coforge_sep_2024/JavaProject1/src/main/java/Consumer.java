public class Consumer {
    private int consumerId;
    private  String  consumerName;
    private  String  consumerType;
    private  String  consumerLocation;

    public Consumer(int consumerId, String consumerName, String consumerType, String consumerLocation) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.consumerType = consumerType;
        this.consumerLocation = consumerLocation;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public String getConsumerType() {
        return consumerType;
    }

    public String getConsumerLocation() {
        return consumerLocation;
    }
}

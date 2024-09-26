
public class ConsumerMain {

	public static void main(String[] args) {
		Consumer consumer = new Consumer(87887, "ram pukar sharma", "new delhi", Day.Thursday);
		System.out.println("consumer Information");
		System.out.println("id " + consumer.getConsumerId());
		System.out.println("name " + consumer.getConsumerName());
		System.out.println("location " + consumer.getConsumerLocation());
		System.out.println("appointment day  " + consumer.getDay());
	}
}

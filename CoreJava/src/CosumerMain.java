
public class CosumerMain {

	public static void main(String[] args) {
		Consumer consumer[] = new Consumer[3];

		int consumertId[] = { 111, 222, 333, 444 };
		String consumerName[] = { "a kumar", "suresh kumar", "amresh kumar" };
		String consumerLocation[] = { "kelambakkam", "thoraipakkam", "gindi" };

		for (int x = 0; x < consumer.length; x++) {
			consumer[x] = new Consumer(consumertId[x], consumerName[x], consumerLocation[x]);
		}

		for (Consumer consumer2 : consumer) {
			System.out.println("\n"+consumer2.getConsumerInfo());
		}
	}
}


public class Train {

	private int trainNo;
	private String trainName;
	private String src;
	private String destination;
	
	public Train(int trainNo, String trainName, String src, String destination) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.src = src;
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Train Information "+
	           "\n\tTrain No  "+trainNo+
	           "\n\tTrain Name  "+trainName+
	           "\n\tTrain Source  "+src+
	           "\n\tTrain No "+destination;
	}
}

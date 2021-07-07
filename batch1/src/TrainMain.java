
public class TrainMain {

	public static void main(String[] args) {
		
		System.out.println(Train.getCountry());
      Train train1=new Train();
      Train train2=new Train();
     
     // System.out.println(train1.getTrainNo()+"  "+train1.getTrainName());
     
      Train.trainInfo(train1);
      Train.trainInfo(train2);
      
      System.out.println("no of object created "+Train.count);
	}
}

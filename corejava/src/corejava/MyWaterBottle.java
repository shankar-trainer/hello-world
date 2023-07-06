package corejava;

public class MyWaterBottle  extends WaterBottle{
   private String location;
   private String state;
	
	//@Override
      // re writing of static method
	public static void  bottleInfo(MyWaterBottle bottle) {
		 System.out.println("Bottle Information ");
		 System.out.println("\tId :"+bottle.getId());
		 System.out.println("\tType :"+bottle.getType());
		 System.out.println("\tcost :"+bottle.getCost());
		 
		 System.out.println("\tlocation "+bottle.location);
		 System.out.println("\tstate "+bottle.state);
	}
	
	public static void main(String[] args) {
		MyWaterBottle bottle=new MyWaterBottle();
		bottle.location="noida";
		bottle.state="up";
		MyWaterBottle.bottleInfo(bottle);
	}
}


public class FurnitureMain {

	public static void main(String[] args) {
		Furniture furniture=new Furniture(); // create object initialize id,name, cost with zero
		Furniture furniture2=new Furniture(1002,"table",6700); // create object initialize id,name, cost with zero
		Furniture furniture3=new Furniture(1003,"bed",50000); // create object initialize id,name, cost with zero
		//one reference variable and one object 
		
		System.out.println("furniture1 ");
		System.out.println(furniture.getId());
		System.out.println(furniture.getName());
		System.out.println(furniture.getCost());
		
		
		System.out.println("\nfurniture2 ");
		System.out.println(furniture2.getId());
		System.out.println(furniture2.getName());
		System.out.println(furniture2.getCost());
		
		
		System.out.println("\nfurniture3 ");
		System.out.println(furniture3.getId());
		System.out.println(furniture3.getName());
		System.out.println(furniture3.getCost());
		
		furniture2.totalCost(furniture);
		furniture2.totalCost(furniture2);
		furniture2.totalCost(furniture3);
		
		System.out.println("total cost is "+furniture2.total);
		
		
	}
}

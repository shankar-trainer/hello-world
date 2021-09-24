package pack2;

public class Ref_TypeCast {

	public static void main(String[] args) {
		System.out.println("primitive data type casting");
		int p=778787;
		float x=p; // implicit casting (widening)
		
		int d1=(int) x; // explicit casting (narrowing)
		
		System.out.println("reference casting");
		System.out.println("reference casting follows inheritance");
		
		Integer z=98989;
	//	Float y=z;// error 
		
		Float j=8787878.6767f;
		//Integer k=j; //error 
		
		Number  n1=7676;
		Float n2=(Float) n1;
		
		Float n4=7667676.55f;
		Number n3=n4;
		
		
		
		
		
	}
}

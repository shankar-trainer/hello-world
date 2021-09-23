
 public   class Animal{
//private  // private cannot be inherited
String name;
		 String color;
		 
		 void sound(){
			 System.out.println("Animal Sound ");
		 }
	}	

//public
class Dog  extends Animal {
	int weight;
	String type;
	
	void dogInfo() {
		System.out.println("dog information ");
		 
		 System.out.println("name of dog is "+name);
		 System.out.println("color  of dog is "+color);
		 System.out.println("weight  of dog is "+weight);
		 System.out.println("color  of dog is "+type);
	}
	
    public static void main(String[] args) {
		 Dog dog=new Dog();
		 dog.name="tiger";
		 dog.color="white";
		 dog.weight=55;
		 dog.type="alcesian";
		 
		 dog.sound();
		 dog.dogInfo();
	}	  
  }
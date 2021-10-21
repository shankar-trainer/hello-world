package corejava;
public class Animal {
   void sound(){
	 System.out.println("animal sound");   
   }	
}
class Dog extends Animal{
	@Override
	void sound() {
	System.out.println("Dog sound");
	}
}
class Cow extends Animal{
	@Override
	void sound() {
	System.out.println("cow sound");
	}
}
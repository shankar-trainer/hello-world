class FunctionProgram{

  static void hello(){
  System.out.println("hello world");
}

  static void  addition(int a, int b){
   //System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
   System.out.printf("\nAddition of %d and %d is %d", a,b,(a+b));  
}

  static int  subtraction(int a, int b){
    return a-b;
   }

  static int  multiplication(int a, int b){
    return a*b;
   }

 public static void main(String args[]){
 hello();
 hello();
  int x=10;
  int y=20;
addition(x,y);
 x=44;
 y=33;
addition(x,y);
int result=subtraction(x,y);
   System.out.printf("\nSubtraction of %d and %d is %d", x,y,result);  

java.util.Scanner sc=new java.util.Scanner(System.in);

System.out.println("\nEnter two number for multiplication");
x=sc.nextInt();
y=sc.nextInt();
result=multiplication(x,y);
   System.out.printf("\nMultiplication of %d and %d is %d", x,y,result);  

 
 }

}
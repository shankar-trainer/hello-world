
 class Employee{

  static void empInfo(int empId,String empName,String empLocation,float empSalary,float empPf){
   System.out.println("********* Employee Information ************");
   System.out.println("\tId is "+empId);
   System.out.println("\tName is "+empName);
   System.out.println("\tLocation is "+empLocation);
   System.out.println("\tSalary is "+empSalary);
   System.out.println("\tPF is "+empPf);
   System.out.println("\tGross Salary  is "+(empSalary-(empSalary*empPf/100)));
  }
   public static void main(String arrs[]){
      int id; 
     String name; 
     String location;
     float salary; 
    float pf;
   java.util.Scanner sc=new java.util.Scanner(System.in);
   
  System.out.println("\tEnter Id"); 
  id=sc.nextInt();
  sc.nextLine();
  System.out.println("\tEnter Name"); 
  name=sc.nextLine();
  System.out.println("\tEnter Location"); 
  location=sc.next();
  System.out.println("\tEnter Salary"); 
  salary=sc.nextFloat();

  System.out.println("\tEnter PF"); 
  pf=sc.nextFloat();
  empInfo(id,name,location,salary,pf);

  }
}
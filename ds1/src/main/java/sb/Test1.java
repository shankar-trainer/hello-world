
class Test1{

	

 static class Node{



   int data;

   Node next;



   Node(int x){

   data=x;

   }

  }



 Node start;



    void pushAtStart(int x){

   Node node=new Node(x);

   node.next=start;

   start=node;

 }



 void pushAtlast(int x){

    Node node=new Node(x);

   

   if(start==null){

   start=node;

   return;

   }

   else {

  

     Node p=start;

    while(p.next!=null){

    p=p.next;

    }

    p.next=node;

  }

 }



 void display(){

  

 Node current=start;

 while(current!=null){

  System.out.print(current.data+",");

  current=current.next;

 }

  

 }



 public static void main(String[] args) {

 Test1 test1=new Test1();

 System.out.println("pushAtStart 1");



 test1.pushAtStart(1);

 test1.pushAtStart(2);



 test1.pushAtStart(3);

 test1.pushAtStart(4);



 test1.display();

  

 System.out.println("pushAtStart 2");

  

 test1.pushAtStart(5);

 test1.pushAtStart(6);

 test1.pushAtStart(7);

 test1.display();



 System.out.println("pushAtlast 1");



 test1.pushAtlast(91);

 test1.pushAtlast(92);

 test1.pushAtlast(93);

 test1.display();

 }

}


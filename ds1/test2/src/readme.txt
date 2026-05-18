class Example1{
  Node start;
   void prg1(){
      System.out.println("Using program1");
      Node node=new Node(1);
      start=node;
      System.out.println(node.data);
    // node=node.next;
     /*
     cannot assign field "next" because "<local1>" is null
     at Example1.prg1(Node.java:20)
     */
      node.next=new Node(2);
      node=node.next;
      System.out.println(node.data);
      System.out.println("using start...");
      System.out.println(start.data);
      System.out.println(start.next.data);
   }
   void prg2(){
      System.out.println("Using program2");
      Node node=new Node(1);
      start=node;
      System.out.println(node.data);
    // node=node.next;
     /*
     cannot assign field "next" because "<local1>" is null
     at Example1.prg1(Node.java:20)
     */

      node.next=new Node(2);
      node=node.next;
      System.out.println(node.data);
      System.out.println("using start...");
      System.out.println(start.data);
      System.out.println(start.next.data);
   }



   void display(){
      System.out.println("---------- display -------------");
    while(start!=null){
      System.out.println(start.data);
      start=start.next;
    }
   }

  public static void main(String[] args) {
      Example1 example1=new Example1();
      example1.prg1();
      example1.prg2();
      example1.display();
  }
}
//https://github.com/tabassum-khan/Data-Structures-and-Algorithms/tree/master/linkedList

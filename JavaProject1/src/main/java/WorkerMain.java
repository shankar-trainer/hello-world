public class WorkerMain {

    public static void main(String[] args) {
        java.util.Scanner scanner=new java.util.Scanner(System.in);

        Worker worker[]=new Worker[3]; // array creation
         float wages[]=new float[worker.length];

        for (int i = 0; i < worker.length ; i++) {
            worker[i]=new Worker();// object creation of each element
            System.out.println("Enter Each worker id name and wages");
            worker[i].id=scanner.nextInt();
            scanner.nextLine();
            worker[i].name=scanner.nextLine();
            worker[i].wages=scanner.nextFloat();
            wages[i]=worker[i].wages;
        }

        for (Worker w:worker)
            w.workerDetail();

        float[] floats = Worker.highLowWages(wages);
        float[] floats1 = Worker.totalAvgWages(wages);

        System.out.println("highest wages "+floats[0]);
        System.out.println("lowest wages "+floats[1]);
        System.out.println("\ntotal wages "+floats1[0]);
        System.out.println("\naverage wages "+floats1[1]);

    }
}
/*
 get the highest and lowest wages of the labour -- single method return array
 get the total wages and avg wages of the labour -- single method return array
 add above method in Worker.java and call in main method
 */
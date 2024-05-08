public class WorkerMain {
    public static void main(String[] args) {
        //System.out.println( "worker company "+company);// error  inside class
        //System.out.println( "worker company "+Worker.company);// error , private
        System.out.println("worker company " + Worker.getCompany());

        Worker worker1 = new Worker();

        //System.out.println( "worker id "+worker1.workerId);// error private
        System.out.println("worker id " + worker1.getWorkerId());
        System.out.println("worker name " + worker1.getWorkerName());
        System.out.println("worker wages " + worker1.getWorkerWages());


        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println("max of 20,3 is :  " + Math.max(20, 3));


    }
}

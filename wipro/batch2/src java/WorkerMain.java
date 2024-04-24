public class WorkerMain {
    public static void main(String[] args) {

        Worker worker = new Worker();
        //worker.id=0;
        //worker.name="";
        //worker.wages=0;

        worker.setId(677667);
        worker.setName("amit kumar");
        worker.setWages(600);

        System.out.println("Worker Information ");
        System.out.println("\tId " + worker.getId());
        System.out.println("\tName " + worker.getName());
        System.out.println("\tWages " + worker.getWages());

    }
}

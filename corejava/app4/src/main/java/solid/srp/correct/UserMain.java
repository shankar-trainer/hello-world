package solid.srp.correct;

public class UserMain {
    public static void main(String[] args) {

        try {
            User user=new User(1009,"surendra kumar",78000.00f);

            UserFileManager manager=new UserFileManager();
            manager.writeDataToFile(user);

            System.out.println("user data added to the file");

            System.out.println("User data ");
            System.out.println("\tId "+user.getUserId());
            System.out.println("\tName "+user.getUserName());
            System.out.println("\tSalary "+user.getSalary());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

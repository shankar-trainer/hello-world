public class CollegeMain {
    public static void main(String[] args) {
        College college1=new College(10001,"kiet ",30000);

        college1.fundExpense(1000);
        college1.fundExpense(5000);
        college1.fundExpense(3000);

        System.out.println(college1.getFund());
    }
}

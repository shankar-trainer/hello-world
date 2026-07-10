interface Addition{
     float sum(float a, float b);

}

public class VarExample {
 int roll;
// var name;// not allowed

    public static void main(String[] args) {
        var name="ram kumar";
        var salary=2000.0f;

        for (var i = 0; i <10 ; i++) {
            System.out.print(i+", ");
        }
        Addition addition1=(x,y)->x+y;
        Addition addition=(var x,var y)->x+y;
    }
}

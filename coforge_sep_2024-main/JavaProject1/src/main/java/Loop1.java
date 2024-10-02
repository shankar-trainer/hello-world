public class Loop1 {
    public static void main(String[] args) {

        int count=1;

        while(count<=10){
            System.out.println(count );
            count=count+1;
        }

        // pre increment ,incremented and  assigned
        // ++p
        int p=100;
        System.out.println(p);
        System.out.println(++p);

        // post increment ,incremented but  assigned later
        // k++
        int k=200;
        System.out.println(k);// 200
        System.out.println(k++);//200
        System.out.println(k); //201


    }
}


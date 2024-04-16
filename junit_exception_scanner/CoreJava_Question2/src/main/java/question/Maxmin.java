package question;

public class Maxmin {

    public static void main(String[] args) {

        int ar[]={1,22,4,55,6,77};
        int max=0,min=0;

        for (int i = 0; i <ar.length ; i++) {
        if(i==0)
            max=min=ar[i];
        else if(ar[i]>=max)
            max=ar[i];
        else if(ar[i]<=ar[i])
            max=ar[i];
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}

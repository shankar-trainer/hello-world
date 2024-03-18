public class LinearSearch {

    static int  search(int ar[], int s){
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==s)
                return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[]={1,2,33,4,55,6,7,8,9,10};
        int pos=search(ar,3);
        if(pos>=0)
            System.out.println("found at "+pos);
        else
            System.out.println("not found");
        pos=search(ar,55);
        if(pos>=0)
            System.out.println("found at "+pos);
        else
            System.out.println("not found");


    }

}

public class Brute_Force_Selection_Sort1 {
    static int [] sort(int ar[]){
        int small,pos,tmp;
        for (int i = 0; i < ar.length ; i++) {
            small=ar[i];
            pos=i;
            for (int j = i+1; j <ar.length ; j++) {
                if(ar[j]<small)
                {
                    small=ar[j];
                    pos=j;
                }
            }
            tmp=ar[i];
            ar[i]=ar[pos];
            ar[pos]=tmp;
        }
        return  ar;
    }
    public static void main(String[] args) {

        int ar[]={11,2,45,1,20};

        System.out.println("sorted array ");
        ar=sort(ar);
        for(int a:ar)
            System.out.print(a+",");
    }
}

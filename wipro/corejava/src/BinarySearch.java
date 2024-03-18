public class BinarySearch {
    static  int search(int ar[],int s){
        int mid;
        int low=0;
        int high=ar.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(ar[mid]==s)
                return  mid;
            else if(ar[mid]<s)
                low=mid+1;
            else
                high=mid-1;
        }
        return  -1;
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

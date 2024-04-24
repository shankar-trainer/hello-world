public class Power {
    static int calculate_power(int base, int exponent){
        int res=1;
        int c=1;
        while(c<=exponent){
            res=res*base;
              c++;
        }
        return  res;
    }

    public static void main(String[] args) {
        System.out.println("power of  base 2  with exponent 3 is "+calculate_power(2,3));
        System.out.println("power of  base 3  with exponent 3 is "+calculate_power(3,3));
    }

}

/*


Take the base and exponent and using method calculate_power display the result

static int calculate_power(int base, int exponent)

 */
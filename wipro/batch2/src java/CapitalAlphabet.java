public class CapitalAlphabet {
    public static void main(String[] args) {

        int x=65;

        while(x<91) {
            System.out.print((char) x+",  ");
          if(x%5==0)
              System.out.println();
            x++;
        }

        char mychar='A';
        while(mychar!='[')
            System.out.print((mychar++)+", ");
    }
}

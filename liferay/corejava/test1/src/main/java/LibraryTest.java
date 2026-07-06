public class LibraryTest {

    public static void main(String[] args) {

        Library library[]=new Library[3];

        int id[]={10009,10002,10004};
        String  nm[]={"kids library","health library","literature library"};

        String loc[]={
                "chennai","madurai",
                "kanchipuram"
        };

        for (int i = 0; i <library.length; i++) {
            library[i]=new Library(id[i],nm[i],loc[i]);
        }

        for(Library lib:library)
            lib.getLibraryInfo();

//        System.out.println(library[0].c);
        System.out.println(Library.c);
        System.out.println("Country  is "+Library.getCountry());
        System.out.println("Country  is "+library[2].getCountry());

        Library.setCountry("china");

        System.out.println("Country  is "+Library.getCountry());
        System.out.println("Country  is "+library[2].getCountry());

    }

}

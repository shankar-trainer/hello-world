public class Library {

    private int libraryId;
    private  String  libraryName;
    private  String  libraryLocation;
    private static  String country;// class variable
    static int c=0;

    static{
        country="india";
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Library.country = country;
    }

    public Library(int libraryId, String libraryName, String libraryLocation) {
        c++;
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.libraryLocation = libraryLocation;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getLibraryLocation() {
        return libraryLocation;
    }
    public void getLibraryInfo(){
        System.out.println("\nlibrary data ");
        System.out.println("\t   id  :"+getLibraryId());
        System.out.println("\t   name  :"+getLibraryName());
        System.out.println("\t   location  :"+getLibraryLocation());
    }
}

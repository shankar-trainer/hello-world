// parent, super class
public class Library {
    protected long libraryId;
    protected String libraryName;
    protected String libraryLocation;

    public void libraryInfo(){
        System.out.println("library data ");
        System.out.println("\t id "+libraryId);
        System.out.println("\t name "+libraryName);
        System.out.println("\t location "+libraryLocation);
    }
}

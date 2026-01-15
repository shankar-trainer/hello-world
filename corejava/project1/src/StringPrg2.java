public class StringPrg2 {
    public static void main(String[] args) {
        String var1="hello world";
        String var2="hello world";
        String var3="Hello World";

        System.out.println(var1.equals(var2));
        System.out.println(var1.equals(var2));
        System.out.println(var1.equals(var3));
        System.out.println(var1.equalsIgnoreCase(var3));

        String email="cts_shyam@gmail.com";

        System.out.println(email.startsWith("cts"));
        System.out.println(email.endsWith(".com"));
        int pos=email.indexOf("@");
        if(pos>=0)
            System.out.println("email is valid ");
          else   System.out.println("email is invalid ");

        String   var="we are learning java. we will learn java 8 also";
        System.out.println(var.indexOf("java"));
        System.out.println(var.lastIndexOf("java"));

        String[] s = var.split(" ");
        for (String p:s)
            System.out.print(p+", ");

        var="in-course@we$will-learn-react#@spring-boot";

        s = var.split("-");
        System.out.println("split with - ");
        for (String p:s)
            System.out.print(p+", ");

        s = var.split("-|@|#|$");
        System.out.println("\nsplit with - @ # $");
        for (String p:s)
            System.out.print(p+", ");

        System.out.println("\n hello world ".length());
        System.out.println(" hello world ".trim().length());

        String location="";
        System.out.println(location.isEmpty());

        location="  ";
        System.out.println(location.isBlank());
        System.out.println(location.isEmpty());


    }
}

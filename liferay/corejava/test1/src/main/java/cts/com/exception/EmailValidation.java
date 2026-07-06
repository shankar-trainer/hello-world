package cts.com.exception;

import java.sql.SQLException;

public class EmailValidation {

    private String email;

    public void validate() throws Throwable {
        email="cts_ramgmail.com";
        if(!email.startsWith("cts")){
//            throw  new Exception("invalid email not starts with cts");
            throw  new Throwable("invalid email not starts with cts");
        }

        else if(!email.endsWith(".com")){
            throw  new Exception("invalid email not ends  with .com");
        }
        else if(email.indexOf("@")<=0){
            try {
                throw new Exception("invalid email not @ sign ");
            }
            catch (Exception e){
                System.out.println("exception message  at validate  method "+e.getMessage());
                throw e;// rethrowing exception
            }
        }
        else {
            System.out.println(email+" is valid");
        }

    }

    public static void main(String[] args) {
        System.out.println("program starts");
        try {
            new EmailValidation().validate();
        } catch (Throwable e) {
            System.out.println("exception message  at main  method "+e.getMessage());
//        e.printStackTrace();
        }
        System.out.println("program ends ");

    }
}

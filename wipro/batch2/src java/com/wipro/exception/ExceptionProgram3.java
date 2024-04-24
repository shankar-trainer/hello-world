package com.wipro.exception;

public class ExceptionProgram3 {
    public static void main(String[] args) {
        System.out.println("program starts ");
        int ar[] = {1, 2, 3, 4, 5};
        //String s=null;
        String s = "null";

        try {
            System.out.println(ar[5]);
            System.out.println(s.length());
            System.out.println(10 / 0);
        }
        catch (NullPointerException|ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
        /*catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }*/
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("program ends ");
    }
}

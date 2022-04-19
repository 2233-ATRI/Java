import java.util.Scanner;
public class date {
    public static void main(String[] args) {


        java.util.Date date = new java.util.Date();
        System.out.println("elapsed time since jan 1 1970 is " + date.getTime() + "milliseconds");
        System.out.println(date.toString());
    }
}
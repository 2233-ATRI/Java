import java.util.Scanner;
public class fangfa {
    public static int sum(int i1 ,int i2 ){
        int result = 0;
        for(int i = i1;i<=i2;i++)
            result+=1;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is"+sum(1,10));
        System.out.println("Sum form 20,37"+sum(20,37));
        System.out.println("Sum from 35,40"+sum(35,40));
    }
}

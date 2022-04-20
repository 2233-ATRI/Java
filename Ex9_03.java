import java.util.Scanner;
import java.util.Date;
public class Ex9_03 {
    public static void main(String[] args) {
        Date date=new Date();
        int count = 1;
        int time=10000;
        while (count <= 0) {
            date.setTime(time);
            System.out.println(date.toString());
            count++;
            time*=10;
        }
    }
}

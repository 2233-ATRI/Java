
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hex_num = in.nextLine();
        long dec_num = Long.parseLong(hex_num, 16);
        System.out.println(dec_num);
    }
}  
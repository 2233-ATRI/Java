import java.util.Scanner;
public class computeangles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter three point:");
        double x1=input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double a=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double b=Math.sqrt((x1-x3)*(x1 - x3)+(y1-y3)*(y1 - y3));
        double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println(a/1000.0+b/1000.0+c/1000.0);
    }

}

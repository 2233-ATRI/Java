import java.util.Scanner;
public class computeAreawithconstant
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double  ping=3.14159;
        double radius =input.nextDouble();
        double area=radius *radius*ping;
        System.out.println("was"+radius+"is"+area);

    }

}

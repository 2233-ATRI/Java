import java.util.Scanner;
public class ordertwocities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("System in");
        String city1=input.nextLine();
        System.out.print("next city");
        String city2 = input.nextLine();
        if(city1.compareTo(city2)<0)
            System.out.println("orther"+city1+" "+city2);
        else {
            System.out.println("order are"+city2 + " "+city1);
        }
    }
}

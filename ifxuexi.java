import java.util.Scanner;
public class ifxuexi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int face=input.nextInt();
        int area;
        if(face<=0){
            area=face+1;
            System.out.println("face="+area+face+(area+face));
        }
    }

}

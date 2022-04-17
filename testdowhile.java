import  java.util.Scanner;
public class testdowhile {
    public static void main(String[] args){
        int data;
        int sums=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("enter an intege(the input ends if it is 0):");
            data = input.nextInt();
            sums+=data;

        }while(data!=0);
        System.out.println("the sums is"+sums);
    }
}

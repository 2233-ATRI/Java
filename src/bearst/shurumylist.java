import java.util.Scanner;
public class shurumylist {
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        double[] mylist=new double[10];
        System.out.print("enter"+mylist.length+"vlaues: ");
        for(int i = 0;i < mylist.length; i++){
            mylist[i]=input.nextInt();
        }
        for (int i = 0; i < mylist.length; i++) {
            System.out.print("the end is "+mylist[i] );
        }
    }
}

import java.util.Scanner;
public class guessnumber {
    public static void main(String[] args){
        int number=(int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.print("between 0and 100");
        int guess =-1;
        while(guess!=number){
            System.out.print("\nguess");
            guess = input.nextInt();
            if(guess==number)
                System.out.print("yes"+number);
            else if(guess > number){
                System.out.print("too high");
            }else {
                System.out.print("too low");
            }
        }
    }
}

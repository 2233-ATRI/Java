import java.util.Scanner;
public class lotteryusingstring {
    public static void main(String[] args) {
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("two digits");
        String guess = input.nextLine();
        char lotterydigit1 = lottery.charAt(0);
        char lotterydigit2 = lottery.charAt(1);
        char guessdigit1 = guess.charAt(0);
        char guessdigit2 = guess.charAt(1);
        System.out.print("number is" + lottery);
        if (guess.equals(lottery))
            System.out.println("win 10000");
        else if (guessdigit2 == lotterydigit1 && guessdigit1 == lotterydigit2)
            System.out.println("win 2000");
        else
            System.out.println("no match");


    }
}
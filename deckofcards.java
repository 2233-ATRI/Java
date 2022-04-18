import java.util.Scanner;
public class deckofcards {
    public static void main(String[] args) {
        int[] deck=new int[52];
        String[] suits={"s","h","c"};
        String[] ranks ={"a","2","3","4","4"};
        for(int i = 0; i < deck.length;i++){
            deck[i]=i;
        }
        for(int i = 0; i < deck.length;i++){
            int index=(int)(Math.random()* deck.length);
            int temp=deck[index];
            deck[index] = temp;
        }
        for(int i = 0; i < 4;i++){
            String suits =suits[deck[i]/13];
            String rank=ranks[deck[i] % 13];
            System.out.println("card number"+deck[i] + ":"+rank+"of"+suits);
        }
    }
}

import java.util.Scanner;
public class testvoidmethod {
    public static void main(String[] args){
        System.out.println("the grade is "+getGrade(78.5));
        System.out.println("the grade is "+getGrade(59.5));
    }
    public static char getGrade(double score){
        if(score>=90.0)
            return 'A';
        else if(score>=80.0)
            return 'B';
        else if(score>=70.0)
            return 'C';
        else
            return 'F';
    }
}

import java.util.Scanner;
public class testsum {
    public static void main(String[] args){
        float sum=0;
        for(float i=0.01f;i<=1.0f;i=i+0.01f)
            sum+=1;
        System.out.println("the sum is"+sum);

    }
}


import java.util.Scanner;
/*可变长参数列表*/
public class seven_5 {

    public static void main(String[] args) {
        /*java将可变长的参数当成数组对待,可以将一个数组或数目可变的参数传递给可变参数。当数目可变的参数调用方法时,java会创建一个数组
         * 并把参数传给它，但是这样不代表数组的大小是可以改变的，一旦数组的大小确定，那么久会有一个空间来存储它，大小不会改变的*/
        printMax(34,3,3,2,56,5);
        printMax(new double[] {1,2,3});//数组的声明且初始化;
    }
    public static void printMax(double...numbers) {//找出其中最大的数;
        /*可变参数方法声明如:函数名(类型名...参数名)*/
        if(numbers.length==0) {
            System.out.println("No argument passed");
            return ;
        }
        double result=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]>result)
                result=numbers[i];
        }
        System.out.println("The max value is " + result);
    }

}
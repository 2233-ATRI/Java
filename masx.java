import java.util.Scanner;
public class masx {
    public static int max(int nums1,int nums2) {
        int result;
        if(nums1>nums2)
            result=nums1;
        else
            result=nums2;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b = input.nextInt();
        int k=max(a,b);
        System.out.println("the max of"+a+"and"+b+"is"+k);
    }
}

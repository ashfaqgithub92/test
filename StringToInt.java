import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number=scn.next();
        int num=number.length();

        int i=Integer.parseInt(number);

        System.out.println("Entered number is :"+i);
        System.out.println("Number length is:"+num);
        scn.close();
    }
}

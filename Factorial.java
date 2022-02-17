import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int number=scn.nextInt();
        int temp=number;
        int fact=1;

        while (number!=0) {
            fact=fact*number;
            number=number-1;
        }

        System.out.println("Factorial of "+temp+" is "+fact);

        scn.close();
    }
}

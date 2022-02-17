import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number to find it's an Armstrong number:");
        System.out.println();

        int number=scn.nextInt();

        int temp1=number;
        int temp2=number;

        int length=0; int reminder=0; int mul=1;

        int arm=0;


 //To find the length of a number
        while (temp1!=0) {
            temp1=temp1/10;
            length=length+1;
        }

//To multiply length times with reminder
        while (temp2!=0) {
            reminder=temp2%10;
            mul=1;
            for (int i = 1; i <=length; i++) {
                mul=mul*reminder;
            }

            arm=mul+arm;
            temp2=temp2/10;

        }
        
        System.out.println();
        if (arm==number) {
            System.out.println("The given number "+number+" is an Armstrong number!!");
        }
        else
        System.out.println("The number is not armstrong");

        scn.close();

    }
}

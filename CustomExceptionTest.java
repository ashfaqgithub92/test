import java.util.Scanner;

public class CustomExceptionTest {
    public static void age(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Under Age applying for a loan");
        }
        else{
            System.out.println("Your loan applied successfully");
        }
    }
    public static void main(String[] args) throws InvalidAgeException{
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter your age");
       int age=scn.nextInt();
       CustomExceptionTest.age(age);
       scn.close();
    }
    
}

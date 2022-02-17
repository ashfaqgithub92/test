import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

      
        System.out.println("Enter the array size");

        int size=scn.nextInt();

        int[] array1=new int[size], array2=new int[size];
        int buffer;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value for first array");
            array1[i]=scn.nextInt();

            System.out.println("Enter the value for second array");
            array2[i]=scn.nextInt();
        }

        for (int j = 0; j < size; j++) {
            buffer=array1[j];
            array1[j]=array2[j];
            array2[j]=buffer;
        }

        System.out.println("Array1 values"+ Arrays.toString(array1));

        System.out.println("Array2 values"+ Arrays.toString(array2));

        scn.close();

    }
}

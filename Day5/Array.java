import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int []arr = new int[size];
        Integer []arr1 = new Integer[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Values in the array: ");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

        Arrays.copyOf(arr, size);

        System.out.println("\nValues in the array1: ");
        for(int a:arr1)
        {
            System.out.print(a+" ");
        }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);           // Split by colon
        int A = Integer.parseInt(sc.next());   
        String parts = sc.nextLine();// Parse first integer
        int B = Integer.parseInt(parts.substring(3));   // Parse second integer
        System.out.println(A + B); 
    }
}
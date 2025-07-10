import java.io.IOException;
import java.util.Scanner;

public class SIOExample {
    public static void main(String[] args) throws IOException{
        int a;
        float b;
        char c, d;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        sc.nextLine();
        c = sc.nextLine().charAt(0);
        b = Float.parseFloat(sc.nextLine());
        d = sc.nextLine().charAt(0);

        System.out.println(a+" "+c+" "+b+" "+d);
    }
}

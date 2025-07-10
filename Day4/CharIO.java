import java.util.Scanner;

public class CharIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b;

        a = sc.nextLine().charAt(0);
        b = sc.nextLine().charAt(0);

        System.out.println(a+" "+b);

        sc.close();
    }
}

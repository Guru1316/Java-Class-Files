import java.util.Scanner;
import java.io.IOException;

public class UserMain {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String id, name, address, phoneNumber;

        System.out.println("Enter Size: ");
        int size = Integer.valueOf(sc.nextLine());

        User []arr = new User[size];

        User u;

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter User "+(i+1)+" Details : ");

            System.out.print("Enter User ID: ");
            id = sc.nextLine();

            System.out.print("Enter User Name: ");
            name = sc.nextLine();

            System.out.print("Enter User Address: ");
            address = sc.nextLine();

            System.out.print("Enter User Phone Number: ");
            phoneNumber = sc.nextLine();
            
            u = new User(id, name, address, phoneNumber);
            arr[i] = u;
        }

        System.out.println("\nUser Details: ");

        int i = 1;
        for(User a:arr)
        {
            System.out.println("User "+i+": ");
            System.out.println(a);
            i++;
        }
    }
}

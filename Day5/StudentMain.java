import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int size = Integer.parseInt(sc.nextLine());
        Student []arr = new Student[size];

        Integer id;
        String name;
        Student s;

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+(i+1)+" Student Data: ");
            System.out.print("ID: ");
            id = Integer.valueOf(sc.nextLine());
            System.out.print("Name: ");
            name = sc.nextLine();
            s = new Student(id,name);
            arr[i] = s;
        }

        System.out.println("\nStudent Details: ");
        int i = 1;
        for(Student a:arr)
        {
            System.out.println("Student "+i+": ");
            System.out.println(a);
            i++;
        }

    }
}

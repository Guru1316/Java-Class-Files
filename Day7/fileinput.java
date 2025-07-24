import java.io.*;
import java.util.Scanner;
public class fileinput{
    public static void main(String[] args) {
        File file =new File("Day7.txt");
        int countl = 0, countw = 0, countc = 0;
        try{
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String str=sc.nextLine();
                countl++;
                countw += str.split(" ").length;
                countc += str.length();
                System.out.println(str);
            }
            System.out.println("Line Count "+countl);
            System.out.println("Word Count "+countw);
            System.out.println("Char Count "+countc);
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
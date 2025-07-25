import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class fileoutput {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        try{
        FileWriter fw = new FileWriter("Day8.txt",false);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(a);
        pw.println("Welcome to java programming");
        pw.println("Writing to File");
        pw.println("II CSE A - File Writer");
        pw.close();
        bw.close();
        fw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

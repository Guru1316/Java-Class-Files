import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Precision {
    public static void main(String[] args) throws IOException{
        float a;
        Float b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Float.parseFloat(br.readLine());
        b = Float.parseFloat(br.readLine());

        System.out.println(a+" "+b);

        System.out.printf("%.2f %.2f",a,b);

        br.close();
    }
}
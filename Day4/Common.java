import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Common {
    public static void main(String[] args) throws IOException{
        int a;
        float b;
        char c, d;
        String s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        c = br.readLine().charAt(0);
        b = Float.parseFloat(br.readLine());
        d = br.readLine().charAt(0);
        s = br.readLine();

        System.out.println(a+" "+c+" "+b+" "+d+" "+s);

        br.close();
    }
}
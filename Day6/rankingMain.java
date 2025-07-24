import java.util.Scanner;

public class rankingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ranking[] rk = new ranking[n];

        String details;

        for(int i=0;i<n;i++)
        {
            details = sc.nextLine();
            String [] d = details.split(" ");
            int avg = Integer.parseInt(d[2])+Integer.parseInt(d[3])+Integer.parseInt(d[4]);
            rk[i] = new ranking(avg, d[1], Integer.parseInt(d[0]));
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(rk[j].getAvgscore()<rk[j+1].getAvgscore())
                {
                    ranking temp = rk[j];
                    rk[j] = rk[j+1];
                    rk[j+1] = temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(rk[i].getRollNo()+" "+rk[i].getName()+" "+(i+1));
        }
    }
}
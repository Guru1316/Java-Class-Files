public class Main {
    public static void main(String[] args) {
        int n = 2;
        First[] fir = new First[n];
        Second[] sec = new Second[n];
        Thread[] thr = new Thread[n+n];
        int j = 0;
        for(int i=0;i<n;i++)
        {
            fir[i] = new First();
            fir[i].setName("First-");
            thr[j++] = fir[i];
        }
        for(int i=0;i<n;i++)
        {
            sec[i] = new Second();
            thr[j++] = new Thread(sec[i], "Second-");
        }

        for(int i=0;i<n+n;i++)
        {
            thr[i].start();
        }

        for (int i = 0; i < n + n; i++) {
            try 
            {
                thr[i].join(); 
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }

        System.out.println("All Threads Started");
    }
}
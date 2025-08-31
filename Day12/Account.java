public class Account{
    private String name;
    private String acc_no;
    private double balance;

    public Account(String name, String acc_no, double balance)
    {
        this.name = name;
        this.acc_no = name;
        this.balance = balance;
    }

    public Account(double balance)
    {
        this.balance = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
public class ICICI extends Bank{
    Account acc;
    int serviceCharge = 5;
    public ICICI(Account acc)
    {
        super("ICICI");
        this.acc = acc;
    }
    @Override
    public boolean withdraw(double amt)
    {
        if(acc.getBalance()<amt)
        {
            System.out.println("Insufficient Balance");
            return false;
        }
        else
        {
            acc.setBalance(acc.getBalance()-amt-serviceCharge);
            return true;
        }
    }
    @Override
    public void deposit(double amt)
    {
        acc.setBalance(acc.getBalance()+amt-serviceCharge);
    }
}

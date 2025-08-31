public class SBI extends Bank{
    Account acc;
    int serviceCharge = 3;
    public SBI(Account acc)
    {
        super("SBI");
        this.acc = acc;
    }
    public SBI(String name, Account acc) {
        super(name);
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

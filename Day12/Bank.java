public abstract class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public abstract void deposit(double amt);
    public abstract boolean withdraw(double amt);


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

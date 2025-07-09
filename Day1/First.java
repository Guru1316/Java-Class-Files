class One
{
    public void display()
    {
        System.out.println("Class One");
    }
}

class Two
{
    public void display()
    {
        System.out.println("Class Two");
    }
}

public class First
{
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        o.display();
        t.display();
    }
}
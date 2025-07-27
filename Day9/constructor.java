class A{
    A()
    {
        System.out.println("Hi from Default Constructor of Class A");
    }
    public A(int num){
        System.out.println("Value in A: "+num);
    }
    public void display()
    {
        System.out.println("Display from A");
    }
}

class B extends A{
    B(int num)
    {
        super(num);
        System.out.println("Value in B: "+num);
    }
}

public class constructor {
    public static void main(String[] args) {
        B b = new B(10);
        b.display();
    }
}

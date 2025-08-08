class A{
    static Integer num1 = 10;
    Integer num2 = 69;
    static{
        System.out.println("Hi From Static Block");
    }
    public A(){
        System.out.println("Hi From Constructor A");
    }
    public static void method1(){
        System.out.println("Hi From Method1 "+num1++);
    }
    public void method2(){
        System.out.println("Hi From Method2 "+num1+" "+num2);
    }
}

class B{
    public B()
    {
        System.out.println("Hi From Consructor B");
    }
    public static void display() {
        System.out.println("Hi From Display Method From B");
    }
    public static void method2(){
        System.out.println("Hi From Method2 ");
    }
}

public class StaticClassExample {
    public static void main(String[] args) {
        A.method1();
        System.out.println("Creating Object For A");
        A a = new A();
        a.method2();
        B.display();
    }
}

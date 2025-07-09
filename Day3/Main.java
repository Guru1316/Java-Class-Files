public class Main {
    public static void main(String[] args)
    {
        Student.collegeName = "SECE";
        Student s1 = new Student(1,"Dev");
        Student s2 = new Student(2,"Aadithya");
        s1.display();
        s2.display();
    }
}
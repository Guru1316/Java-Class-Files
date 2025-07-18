public class Student {
    Integer id;
    String name;

    public Student() {
        
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "ID: "+id+" Name: "+name;
    }
}
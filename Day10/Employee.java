public class Employee {
    int e_id;
    String e_name;
    EmployeeRole role;
    int e_salary;

    public Employee(int e_id, String e_name, int e_salary, EmployeeRole role) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_salary = e_salary;
        this.role = role;
    } 
}

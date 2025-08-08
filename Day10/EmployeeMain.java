import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeRole [] roles = new EmployeeRole[3];
        roles[0] = new EmployeeRole(1, "Manager");
        roles[1] = new EmployeeRole(2, "Team Leader");
        roles[2] = new EmployeeRole(3, "Team Member");
        System.out.println("Enter the number of employees: ");
        int n = Integer.parseInt(sc.nextLine());
        Employee[] employees = new Employee[n];
        String name;
        int e_id, r_id, salary;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Employee"+(i+1)+" name: ");
            name = sc.nextLine();
            System.out.println("Enter Employee"+(i+1)+" id: ");
            e_id = sc.nextInt();
            System.out.println("Enter Employee"+(i+1)+" role_id: ");
            r_id = sc.nextInt();
            System.out.println("Enter Employee"+(i+1)+" salary: ");
            salary = sc.nextInt();
            sc.nextLine();
            for(int j=0;j<3;j++)
            {
                if(r_id==roles[j].r_id)
                {
                    employees[i] = new Employee(e_id, name, salary, roles[j]);
                    break;
                }
            }
        }
        while (true) 
        { 
           System.out.println("1) Manager");
           System.out.println("2) Team Leader");
           System.out.println("3) Team Member");
           System.out.println("4) Exit") ;
           System.out.println("Enter role for getting employee details: ");
           String role = sc.nextLine();
           if(role.equals("Exit"))
           {
             System.out.println("Exiting...");
             return;
           }
           System.out.println("Employee details in "+role+":");
           for(Employee emp:employees)
           {
               if(emp.role.r_name.equals(role))
               {
                   System.out.println(emp.e_id+" "+emp.e_name+" "+emp.role.r_id+" "+emp.role.r_name+" "+emp.e_salary);
               }
           } 
        }
    }    
}

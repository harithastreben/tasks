// New Task Write a Java program to create a class called Employee with methods called work() and getSalary().
//  Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee() created
public class Employee {
    private int salary;
    public Employee(int salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("developer");

    }
    public int getSalary(){
        return salary;
    }
}
class HRmanager extends Employee{
    
     public HRmanager(int salary){
        super(salary);

     }
    public void work(){
        System.out.println("hr works");

    }
    public void addEmployee(){
        System.out.println("added employee");

    }
}


class task7{

    public static void main(String[] args) {

        Employee emp=new Employee(70000);
        System.out.println(emp.getSalary());
        emp.work();

        HRmanager hr=new HRmanager(89000);
        hr.work();
        hr.addEmployee();
        // System.out.println(hr.getSalary());

    }
}
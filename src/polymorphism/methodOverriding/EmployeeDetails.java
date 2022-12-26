package polymorphism.methodOverriding;

public class EmployeeDetails extends Employee {

    public void display(int employeeId, String employeeName) {
        System.out.println("The Employee from subClass :" + employeeId);
        System.out.println("The Employee from subClass :" + employeeName);
    }

    public int display(int employeeId) {
        return employeeId;
    }
}

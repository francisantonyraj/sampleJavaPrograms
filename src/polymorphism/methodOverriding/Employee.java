package polymorphism.methodOverriding;

public class Employee {

    public void display(int employeeId, String employeeName) {
        System.out.println("The Employee from parent :" + employeeId);
        System.out.println("The Employee from parent :" + employeeName);
    }

    public int display(int employeeId) {
        return employeeId;
    }
}

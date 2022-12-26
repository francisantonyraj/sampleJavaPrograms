package polymorphism.methodOverriding;

public class MainClass {

    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.display(101, "Sam");
        System.out.println(employeeDetails.display(103));

        Employee employee = new Employee();
        employee.display(103);
        employee.display(104, "Raj");
    }
}

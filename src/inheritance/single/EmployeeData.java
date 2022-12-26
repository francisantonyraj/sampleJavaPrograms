package inheritance.single;

public class EmployeeData extends Employee {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(100);
        employee.setName("Ram");
        employee.setLocation("Bangalore");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getName());
        System.out.println(employee.getLocation());
    }
}

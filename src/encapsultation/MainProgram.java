package encapsultation;

public class MainProgram {

    public static void main(String[] args) {
        Employee employee = new Employee();
//        Employee employee = new Employee(100, "Ram","Bangalore");

//        System.out.println(employee.getEmployeeId());
//        System.out.println(employee.getEmployeeName());
//        System.out.println(employee.getEmployeeLocation());

        employee.setEmployeeId(102);
        employee.setEmployeeName("sam");
        employee.setEmployeeLocation("Delhi");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeLocation());


    }
}

package encapsultation;

//model - POJO
public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeLocation;

//    public Employee(int employeeId, String employeeName, String employeeLocation){
//        this.employeeId=employeeId;
//        this.employeeName=employeeName;
//        this.employeeLocation=employeeLocation;
//    }
//
//    public Employee(){
//
//    }
    //Getter - Setter
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

}

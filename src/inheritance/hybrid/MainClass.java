package inheritance.hybrid;

public class MainClass {

    public static void main(String[] args) {
        Department department = new Department();
        department.displayNoOfDepartment();

        Staff staff = new Staff();
        staff.displayNoOfStaff();

        StudentEducationDetails studentEducationDetails = new StudentEducationDetails();
        studentEducationDetails.displayNoOfStudent();
        studentEducationDetails.displaySubjects();
        studentEducationDetails.displayAddress();

    }
}

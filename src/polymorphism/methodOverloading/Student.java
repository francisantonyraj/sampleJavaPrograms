package polymorphism.methodOverloading;


public class Student {

    static void studentData(int studentId) {
        System.out.println("The student id is :" + studentId);
    }

    static void studentData(int studentId, String studentName) {
        System.out.println("The student id is :" + studentId);
        System.out.println("The student id is :" + studentName);
    }

    static void studentData(int studentId, String studentName, String studentLocation) {
        System.out.println("The student id is :" + studentId);
        System.out.println("The student id is :" + studentName);
        System.out.println("The student id is :" + studentLocation);
    }

    static String studentData() {
        return "Bangalore";
    }

    public static void main(String[] args) {
        studentData(101);
        studentData(102, "Sam");
        studentData(102, "Sam", "Bangalore");
        System.out.println("Location :" + studentData());
    }
}

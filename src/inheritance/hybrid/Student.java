package inheritance.hybrid;

public class Student extends Institution {

    public String[] locations = {"Ecity", "Bommanahalli", "Hebal"};
    public String[] numberOfSubjects = {"English", "Maths", "Social", "Science"};

    public void displayNoOfStudent() {
        System.out.println("Number of Student :" + studentNames.length);
    }
}

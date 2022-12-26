package interfaces;

public class MainClass {

    public static void main(String[] args) {
        DogA dogA = new DogA();
        DogB dogB = new DogB();

        dogA.color="Black";

        dogA.sleep("doga");
        dogB.run("dogb");
        dogA.colorOfTheDog("doga");
        dogB.colorOfTheDog("doga");
    }
}

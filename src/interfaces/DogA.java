package interfaces;

public class DogA implements Animal{

    public String color;

    @Override
    public void sleep(String animalName) {
        System.out.println(animalName + " is sleeping");
    }

    @Override
    public void run(String animalName) {
        System.out.println(animalName + " is ready to run");
    }

    @Override
    public void colorOfTheDog(String animalName) {
        System.out.println(animalName + " color is " + color);
    }
}

package superKeyword;

public class AnimalDefault {
    AnimalDefault(){
        System.out.println("Animal is created");
    }
}
class DogDef extends AnimalDefault{
    DogDef(){
        System.out.println("Dog is created");
    }
}
class MainDefault{
    public static void main(String[] args) {
        DogDef dogDef = new DogDef();
    }
}
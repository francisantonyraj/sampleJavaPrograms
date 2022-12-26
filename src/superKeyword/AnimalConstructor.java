package superKeyword;

public class AnimalConstructor { //parent class
    AnimalConstructor() {
        System.out.println("Animal is created");
    }

    AnimalConstructor(String abc) {
        System.out.println("Animal is created" + abc);
    }

}

class DogCons extends AnimalConstructor { //child class
    DogCons() {
        System.out.println("Dog is created");
    }

    DogCons(String str) {
        super();
        System.out.println("2Dog is " + str);
    }
}

class MainCons {
    public static void main(String[] args) {

//        DogCons dogCons = new DogCons();
//        DogCons dogCons1 = new DogCons("eating");
        String xyz = null;
        String str = xyz.toUpperCase();
        System.out.println(str);
        int [] abc = new int[2];
        abc[3]=8;
    }
}
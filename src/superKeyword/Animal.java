package superKeyword;

public class Animal { //class A
    String color = "white";
}

class Dog extends Animal { //class B
     String color = "black";

     public void print(){
         System.out.println(color);
         System.out.println(super.color);
     }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();

//        Animal animal = new Animal();
//        System.out.println(animal.color);
    }
}
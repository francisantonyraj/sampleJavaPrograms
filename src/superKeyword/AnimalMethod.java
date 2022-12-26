package superKeyword;

 class AnimalMethod { //parent
    void eat(){
        System.out.println("Eating");
    }
}

class Lion extends AnimalMethod{ //child extends parent
    void eat(){
        System.out.println("eating fish");
    }
    void sleep(){
        System.out.println("sleeping");
    }
    void work(){
        super.eat(); // call parent class eat()
        eat(); //call child class eat()
        sleep();
    }
}

class MainMethod{
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.work();
    }
}

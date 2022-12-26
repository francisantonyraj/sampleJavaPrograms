package inheritance.multilevel;

//parent class
class Calculator { // Calculator(Class A)
    public float add(float a, float b) {
        return a + b;
    }

    public float multiplication(float a, float b) {
        return a - b;
    }

    public float division(float a, float b) {
        return a / b;
    }

    public float subtraction(float a, float b) {
        return a - b;
    }
}

//subclass
class AdvanceCalculator extends Calculator {   //AdvanceCalculator (Class B)
    public float mod(float a, float b) {
        return a % b;
    }
}

//subclass
class Areas extends AdvanceCalculator { // Areas (Class C)
    public float square(float a) {
        return a * a;
    }
}

public class BaseClass {  // Main class
    public static void main(String[] args) {
        Areas areas = new Areas();
        System.out.println(areas.add(1,2));
        System.out.println(areas.subtraction(1,2));
        System.out.println(areas.multiplication(1,2));
        System.out.println(areas.division(1,2));
        System.out.println(areas.mod(1,2));
        System.out.println(areas.square(2));
        

    }
}

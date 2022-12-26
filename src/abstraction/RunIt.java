package abstraction;

public class RunIt {

    public static void main(String[] args) {
        Car car = new Car();
        MotorCycle motorCycle = new MotorCycle();
        car.moveBackward("Maruthi");
        motorCycle.moveBackward("Bajaj");
        motorCycle.moveForward("Hero");
        car.turnRight("Tata");
    }
}

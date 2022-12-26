package abstraction;

public class Car extends Vehicle{

    @Override
    public void moveForward(String vehicleName) {
        System.out.println(vehicleName + " moving forward");
    }

    @Override
    public void moveBackward(String vehicleName) {
        System.out.println(vehicleName + " moving backward" + " for 10m");
    }

    @Override
    public void turnLeft(String vehicleName) {
        System.out.println(vehicleName + " turning left");
    }

    @Override
    public void turnRight(String vehicleName) {
        System.out.println(vehicleName + " turning right");
    }

    @Override
    public void engineStart(String vehicleName) {
        System.out.println(vehicleName + " start the engine");
    }
}

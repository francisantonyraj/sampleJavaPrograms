package abstraction;

public class Bus extends Vehicle{
    @Override
    public void moveForward(String vehicleName) {
        System.out.println(vehicleName + " moving forward");
    }

    @Override
    public void moveBackward(String vehicleName) {
        System.out.println(vehicleName + " moving forward");
    }

    @Override
    public void turnLeft(String vehicleName) {
        System.out.println(vehicleName + " moving forward");
    }

    @Override
    public void turnRight(String vehicleName) {
        System.out.println(vehicleName + " moving forward");
    }

    @Override
    public void engineStart(String vehicleName) {
        System.out.println(vehicleName + " start the engine");
    }
}

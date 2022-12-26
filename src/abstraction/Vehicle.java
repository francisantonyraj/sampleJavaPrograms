package abstraction;

public abstract class Vehicle {

    public abstract void moveForward(String vehicleName);

    public abstract void moveBackward(String vehicleName);

    public abstract void turnLeft(String vehicleName);

    public abstract void turnRight(String vehicleName);

    public abstract void engineStart(String vehicleName);

    public void display() {
        System.out.println("From vehicle");
    }
}

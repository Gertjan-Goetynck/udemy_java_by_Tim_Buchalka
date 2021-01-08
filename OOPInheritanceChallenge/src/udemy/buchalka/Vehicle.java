package udemy.buchalka;

public class Vehicle {
    private int passengers;
    private String size;
    private String name;

    private int currentVelocity;
    private int currentSpeed;

    public Vehicle(String name, String size) {
        this(1, name, size);
    }

    public Vehicle(int passengers, String name, String size) {
        this.passengers = passengers;
        this.name = name;
        this.size = size;

        this.currentVelocity=1;
        this.currentSpeed=1;
    }

    public void move(int speed){
        System.out.println("The vehicle has moved "+speed);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}

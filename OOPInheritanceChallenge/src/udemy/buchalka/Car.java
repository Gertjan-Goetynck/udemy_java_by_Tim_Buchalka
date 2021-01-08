package udemy.buchalka;

public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private String engine;

    public Car(int passengers, int doors, int wheels, String engine,String name, String size) {
        super(passengers, name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.engine = engine;
    }

    @Override
    public void move(int speed) {
        System.out.println("The car has moved");
        super.move(speed);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}

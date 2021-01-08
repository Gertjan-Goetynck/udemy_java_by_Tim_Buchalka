package udemy.buchalka;

public class Tesla extends Car{
    private String AI;
    private String battery;

    public Tesla(int passengers, int doors, int wheels, String engine, String AI, String battery, String name, String size) {
        super(passengers, doors, wheels, engine,name ,size );
        this.AI = AI;
        this.battery = battery;
    }

    public void useGPS(){
        System.out.println("Has used the gps");
    }

    public String getAI() {
        return AI;
    }

    public void setAI(String AI) {
        this.AI = AI;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}

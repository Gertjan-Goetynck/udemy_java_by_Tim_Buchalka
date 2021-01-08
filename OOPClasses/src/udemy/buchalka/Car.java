package udemy.buchalka;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("comodore")){
            this.model = model;
        } else{
            this.model = "Unknown";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors(){
        return this.doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
}

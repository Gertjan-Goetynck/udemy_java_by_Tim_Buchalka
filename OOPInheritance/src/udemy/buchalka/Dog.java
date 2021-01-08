package udemy.buchalka;

public class Dog extends Animal{

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight, int legs, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew(){
        System.out.println("Dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Movelegs got called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

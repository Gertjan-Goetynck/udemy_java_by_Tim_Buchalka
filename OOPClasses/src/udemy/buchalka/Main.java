package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();
	    porsche.setDoors(20);
        porsche.setModel("Carreara");
	    holden.setDoors(4);
        System.out.println(porsche.getModel());
        System.out.println(holden.getDoors());
    }
}

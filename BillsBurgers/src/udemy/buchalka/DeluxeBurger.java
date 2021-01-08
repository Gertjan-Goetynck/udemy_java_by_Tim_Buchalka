package udemy.buchalka;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe","Bacon",15.10,"Whole bread");
        super.addHamburgerAddition1("Chips",2);
        super.addHamburgerAddition2("Drink",2);
    }
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
package udemy.buchalka;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;



    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;

        System.out.println(this.name+" hamburger on a "+this.breadRollType+" roll with "+this.meat+". price is "+String.format("%.2f",this.price));
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added "+name+" for an extra "+String.format("%.2f",this.price));
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added "+name+" for an extra "+String.format("%.2f",this.price));

    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added "+name+" for an extra "+String.format("%.2f",this.price));

    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added "+name+" for an extra "+String.format("%.2f",this.price));

    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        totalPrice+=this.addition1Price;

        totalPrice+=this.addition2Price;

        totalPrice+=this.addition3Price;

        totalPrice+=this.addition4Price;

        return totalPrice;
    }


}
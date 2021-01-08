package udemy.buchalka;

public class VipCustomer {
    private String name;
    private double credit;
    private String emailAddress;

    public VipCustomer() {
        this("John Dhoe",9000,"Jhon@Dhoe.com");
    }

    public VipCustomer(String name, double credit) {
        this(name,credit,"test@test.com");
    }

    public VipCustomer(String name, double credit, String emailAddress) {
        this.name = name;
        this.credit = credit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

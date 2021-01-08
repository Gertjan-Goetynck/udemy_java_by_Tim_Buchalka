package udemy.buchalka;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhonenumber;

    public Account() {
        this("56789",2.50,"Default name","John@Dhoe.com","123456789");
        System.out.println("Default constructor called");
    }

    public Account(String customerName, String customerEmail, String customerPhonenumber) {
        this("99999",100.55,customerName,customerEmail,customerPhonenumber);
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhonenumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhonenumber = customerPhonenumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("You have deposited "+amount+" The new account balance is "+this.balance);
    }

    public void withdrawFunds(double amount){
        if((this.balance - amount) <0){
            System.out.println("Your funds of "+this.balance+ " are insufficient to withdraw " +amount+".");
        }else{
            this.balance -=amount;
            System.out.println("You have withdrawn "+amount+" The new account balance is "+this.balance);
        }
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customer_email) {
        customerEmail = customer_email;
    }

    public void setCustomerPhonenumber(String customerPhonenumber) {
        this.customerPhonenumber = customerPhonenumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhonenumber() {
        return customerPhonenumber;
    }

}

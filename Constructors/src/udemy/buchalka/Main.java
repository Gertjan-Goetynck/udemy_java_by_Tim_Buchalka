package udemy.buchalka;

public class Main {

    public static void main(String[] args) {
	   	Account myAccount = new Account();
	    myAccount.setCustomerPhonenumber("0485 16 92 95");
	    myAccount.depositFunds(5000);
	    myAccount.withdrawFunds(500);

	    Account seccondAccount = new Account("Gertjan Goetynck","Gertjan@goetynck.com","123456789");

	    VipCustomer vip = new VipCustomer("Gertjan",123);
		System.out.println(vip.getCredit());
    }
}

package DAY_17;

public class UserLogic_ATM_Bank {

	public static void main(String[] args) {
		
	   Bank obj = new Bank();
	   ATM obj1 = obj.atm();
	   
	   obj1.deposit();
	   obj1.checkBal();
	   
	}
}

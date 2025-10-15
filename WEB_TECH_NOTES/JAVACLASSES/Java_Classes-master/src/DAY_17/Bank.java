package DAY_17;

public class Bank {

	private class SBI implements ATM{
		
		public void deposit() {
			System.out.println("deposit 200 rs");
		}
		 
		public void checkBal() {
			System.out.println("your bal is 200 rs");
		}
	}
	
	// helper methods 
//	helper methods is a public method that create the object of 
// concrete implementing subclass and returns the 
// address in the upCaste interface type.
	public ATM atm() {
		return new SBI();
	}
	
	
}

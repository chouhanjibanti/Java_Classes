package DAY_06;

public class StackOverFlowErrorExample {

	int i = 10;// global non static variable
   static StackOverFlowErrorExample obj = new StackOverFlowErrorExample (); // static global obj
	
	public static void main(String[] args) {
		 
		StackOverFlowErrorExample obj = new StackOverFlowErrorExample ();// local and non static 
		int i = 50;// local and non static 
		
		
		
	}
}

//  primitive var being local and global( static and no  static)
// we can declare non primitive variable as local and global (static and non static variable)


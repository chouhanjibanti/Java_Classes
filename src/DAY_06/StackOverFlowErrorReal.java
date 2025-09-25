package DAY_06;

public class StackOverFlowErrorReal {
	
	
	int i = 10;// primitive global variiable
	  StackOverFlowErrorReal obj = new StackOverFlowErrorReal();
	
	public static void main(String[] args) {
	
	  StackOverFlowErrorReal obj = new StackOverFlowErrorReal();
	
	}// local and non static variable

}


// A non primitive variable of class can be local variable in the same class or it 
// can be global static variable in the same class but can not non static global variable in the same class 
// otherwise we get stackoverflow error (the problem created during the runtime where jvm can not execute the statement.)
package DAY_01;

public class Variables {
	
	String instituteName = "debugshala";// NPD and global scope

	public static void main(String[] args) {
		
		int i = 10; // PDT & Local scope
		i = 20;
				
//		int a ;// declaration
//		int a = 10;// initialization
		
		
	}
	
	double d = 10.5;// PDT and Global Scope 
}

// Variable :- variable are use to store the values and we need to follow two instructions
//1. variable declaration
//2. variable initialization


// classification of variables :- 

// we have two set of classification of variables.
//1. Based on the DT

//   -> Primitive Variable
//   -> Non Primitive Variable


//2. Based on scope 
//    -> Local Variable
//    -> Global Variable


// local variable :- Any variable declared within the block(method block , conditional block , looping block , try-catch , finally etc
// Global Variable :- Any variable declared outside the method block but within the class are known as global variable.


//================================================================


// we can not create  two local variabale with the same name .
// we can reinitilize the local variable but value will get new value.








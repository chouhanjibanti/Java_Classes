package DAY_05;

public class JVMLifeCycle {


	static int i = 10;
	
	public static void main(String[] args) {
		
		System.out.println("FM");
		int i = 50;
		System.out.println(i);
		
		System.out.println(i);
		System.out.println(JVMLifeCycle.i);
	}
}


//loading process oif the class

//1.  class loader create the class static area with name similar class name .
// 2. load all the static member with the default values.
// 3. executes all the static initilizer one by one from top to bottom.



//===================================================

//non  static member :- 
// any global member declared without static keyword as known as non static member.
//if we want to execute them we need to create a memory block for non static member known as instance or object. and alter they must be called explicitlity.



//Object or instance :- it is a block of memory created to store the non static
//member of a class during the runtime and it can be created using the new operator and class constructor.


//Synatax :-   className objRefVar = new className();
// JVMLifeCycle demo = new JVMLifeCycle();








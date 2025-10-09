package DAY_13;

public class A_B_UserLogic {

	public static void main(String[] args) {
		
		
//		A obj = new A();// obj of superclass and reference of super class
//		 System.out.println(obj.i);
//		 System.out.println(obj.j);
//		 obj.staticMethod();
//		 obj.nonStatic();
		 
//		 B obj1 = new B();
//		 System.out.println(obj1.i);
//		 System.out.println(obj1.j);
//		 obj1.staticMethod();
//		 obj1.nonStatic();
		
		
//	  A obj2 = new B();
//	  System.out.println(obj2.i);
//	  System.out.println(obj2.j);
//	  obj2.staticMethod();
//	  obj2.nonStatic();
		
	// downCasting :-  converting a superclass references back into a subclasstype
//	  B obj3 = (B) new A();
	  // we can not convert this to this 
	  // classCastExcpetion
		
		
		
		
	// upCasting and downCasting 
//		A obj1 =new B();// upcasting
//		B obj2 =((B)(obj1));// downcasting 
//
//		System.out.println(obj2.i);
//		System.out.println(obj2.j);
//		System.out.println(obj2.toString());
		
		
		// classCastException
		B obj =  (B) new A();
		System.out.println(obj.i);
		System.out.println(obj.j);
		obj.staticMethod();
		obj.nonStatic();
		
		
	}
}

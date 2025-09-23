package DAY_05;

public class thisKeyword {
	
	static int i = 10;
	int j = 20;
	
	public void run() {
		   System.out.println(this);
		   System.out.println(i);
		   System.out.println(j);
		   System.out.println(this.i);
		   System.out.println(this.j);
	}

	public static void main(String[] args) {
		  System.out.println("first method");
		  
		  thisKeyword obj1 = new thisKeyword();
		    obj1.run();
		    System.out.println(obj1);
		   obj1.vedant();
		   thisKeyword.vedant();
		   vedant();
		   
		    
		     
	}
	
	public static void vedant() {
		System.out.println("hy");
	}
}

// this keyword :- this is keyword that stores the address of the current object . 
// using this keyword we can access the static and non static member.
// within the non static context [NSM]

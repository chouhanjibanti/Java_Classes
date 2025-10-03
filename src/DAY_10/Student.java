package DAY_10;

public  class Student {

	String name;
	double tp;
	double twp;
	double ug;
	String id;
	String email;
	String password;
	
	public Student(String name, double tp, double twp) {
		super();
		this.name = name;
		this.tp = tp;
		this.twp = twp;
	}

	public Student(String name, double tp, double twp, double ug, String id) {
	    this(name, tp ,twp );
		this.ug = ug;
		this.id = id;
	}
	
	
	public Student(String name, double tp, double twp, double ug, String id,String email, String password) {
		this(name,tp,twp,ug,id);
		this.email = email;
		this.password = password;
	}

	// behaiour // method
	public void display(){
		System.out.println(name + " "+ tp + " " + twp+ " "+ ug+ " "+ id );
	}
}

package DAY_17;

abstract public interface I1 {

	int i =10;
	abstract public void run();
	
	
	public static void main(String[] args) {
		int i = 100;
		System.out.println("hy interface");
		System.out.println(i);
		System.out.println(I1.i);
	}
}

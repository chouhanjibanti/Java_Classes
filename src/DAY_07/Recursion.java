// find the factorial of the number 5.
package DAY_07;

public class Recursion {

	
	public static void main(String[] args) {
		
		int fact = fact(5);
		System.out.println(fact);
		
	}
	public static int fact(int n) {
		 if(n==0) {
			 return 1;
		 }else {
			 return n*fact(n-1);
		 }
	}
}
// The process of performing the same operation to get a required 
// output by calling method again and again known as recursion.




// Write a program to find the product of number 1 to 10 using recursion .

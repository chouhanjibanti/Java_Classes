// Write a program to find the product of number 1 to 10 using recursion .

package DAY_07;

public class Recursion1 {
	
	public static void main(String[] args) {
		
		int pro = pro(1);
		System.out.println(pro);
		
	}

	private static int pro(int num) {
	     if (num==10) {
			 return 10;
		} else {
           return num*pro(num+1);
		}
	}

}

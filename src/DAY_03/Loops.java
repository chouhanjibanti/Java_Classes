package DAY_03;

public class Loops {

	public static void main(String[] args) {
//		for loop
		// print the sum of the number from 1 to 30.
		
//		int sum = 0;
//		for(int i=1;i<=30;i++) {
//			 sum +=i;
//		}
//		System.out.println(sum);
		
		
//		while loop 
		// Extract the digit from the number where number 5678.
		
//		int num = 5678;
//		while(num>0) {
//			int digit =num%10; // 5678 -> 8  // 
//			System.out.println(digit); // 8
//		   num =num/10; // 567
//		}
		
		
//		int a = 10;
//		int b = 20;
//		int c =0 ;
//		c = a;
//		a= b;
//		b = c;
//		System.out.println(a);
//		System.out.println(b);
		
		
//		int a = 10;
//		int b = 20;
//		a = a+b; // a=30
//		b = a-b; // 10
//		a = a-b; // 20
//		System.out.println(a);
//		System.out.println(b);
		
		
//		int year = 1900;
//		if(((year%4==0) && (year%100!=0)) || (year%400==0)){
//			 System.out.println(year +" year is leap year");
//		}else {
//			 System.out.println(year +" year is not leap year");
//		}
		
		
		// fabonacci series
		// 0 1 1 2  3 5 8 13 21 34
//		int a = 0;
//		int b = 1;
//		int num = 10;
//		for(int i=0;i<num;i++) {
//			System.out.println(a);
//			int temp = a+b;
//			 a  = b;
//			 b = temp;
//		}
		
		
		
//		perfect number 
//		6 -> 1+2+3 => 6
//		28 -> 1+2+4+7+14= 28
		
//		int num = 7;
//		int sum = 0;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				sum = sum +i;
//			}
//		}	
//		if (num==sum) {
//			 System.out.println(num+" is perfect number");
//		} else {
//             System.out.println(num+" is not perfect number");
//		}
		
		
		
//		reverse the number
//		int num = 5678; // 8765
//		int rev =0;
//		while(num>0) {
//			int digit = num%10;
////			System.out.println(digit);
//			rev = (rev*10)+digit;
//			num = num/10;
//		}
//		System.out.println(rev);
		
		
		
		// nested loop 
		
//		for(init;con;incr) {
//			// code to execute
//			for(init;con;incr) {
//				// code to execute
//			}
//		}
		
// * * * * *
// * * * *
// * * *		
// * *
// *
		
		
		int star = 6;
		for(int i=0;i<5;i++) {
			star--;
		   for(int j=0;j<star;j++) {
			   System.out.print("* ");
		   }
		   System.out.println();
		}
		
	}
}
// Loops :- 
//1 . while loop
//2. for loop
//3. do-while loop
//4. for each loop (advance for loop)



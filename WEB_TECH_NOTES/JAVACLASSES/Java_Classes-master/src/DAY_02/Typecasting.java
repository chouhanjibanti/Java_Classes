package DAY_02;

public class Typecasting {

	public static void main(String[] args) {
		
		double d = 35.50f;
		System.out.println(d);
		
		double d1 = 'o';
		System.out.println(d1);
		
		int a = 'a';
		System.out.println(a);
		
//		==================================
		
		int a1 = (int)98.90;
		System.out.println(a1);
		
		
		long l1 = 45678;
		System.out.println(l1);
		
		long l3 = (long)34.5f;
		System.out.println(l3);
		
		
//		int a3 = true; // CTE

		
		
	}
}

// Typecasting :- 
// Primitive TC
// Non primitive TC

//Primitive TC: - the process the converting the value of one primitive DT to another primitive DT.
// we have two types of TC
// 1. Auto widening  :- the process the converting the value from lesser DT to Larger DT. is known as widening.During the process there is no poss of data lossing the value.
//hence compiler automatically add the type caste operator.


//2.  Explicit Narrowing :- the process the converting the value from larger DT to smaller DT. is known as narrowing.During the process there is  poss of data lossing the value.
// hence type caste operator will not add automatically but developer must explicitly declare.


// byte[1] -> short[2]
//             |
//            char[2]  ->  int[4]  ->  long[8]-> float[4] -> double[8]
              


// 2. Explicit Narrowing 
## Scanner Class

java.util.scanner :-

The non static methods of scanner class present in java.util package can be use to receive the different type of inputs into java program.

1. string		-> next()
				-> nextLine()
				
2. character	-> next().charAt(0)

3. integer		-> nextByte()
				-> nextShort()
				-> nextLong()
				-> nextInt()
				
4. floating		-> nextFloat()
				-> nextDouble()
				
5. boolean 		-> nextBoolean()



# Types of Inheritance

1. Single Level Inheritance :-
	Inheritance with respect to one level is known as Single level Inheritance.
	
2. Multilevel Inheritance :- Inheritance with respect to different level is known as Multilevel Inheritance.

3. Multiple Inheritance :- A subclass having multiple superclass is known as Multiple inheritance.

4. Hybrid Inheritance :- It is a combination of any two inheritance is known as Hybrid Inheritance.

5. Hierarchical Inheritance :- One super class having multiple sub classes is known as Hierarchical Inheritance.


# Example of Subclass
```
1. Singlelevel :-
	
		Object
		  |
		Mango
```

# Example of Multilevel
```
2. Multilevel :-

		Object
		  |
		Vehicle
		  |
		 Car
		  |
		 Bike
```

#Example of Multiple Inheritance
```
3. Multiple :-
	
	P		A		B
	  \		|	   /
	   \		|     /
	    \	|    /
	     \	|   /
	      \	|  /
	      Tiger
```

# Example of hierarchical Inheritance

```
	App S/W
	 /	 |	\
	/	 |	 \
  Video Audio Games
```

--------------------------------------------------------------------

# Note :-
Diamond Problem or Constructor Chaining Problem.

In case of Multiple Inheritance using the Class. The super() of the subclass constructor gets confused to compile time bind with super class constructor. This ambiguity or confusion arises for a compiler is known as Constructor chaining or Diamond Problem.

Hence we use the Concept of Interface to achieve multiple inheritance.


# Non Primitive Type Casting :-

The process of converting the datatype of the references between the classes exhibit inheritance known as Non Primitive TypeCasting.

There are Two Types - 

1. Auto UpCasting
2. Explicit DownCasting

Auto UpCasting - 

1. The process of converting the references from subclass type to the superclass known as upCasting.
2. During the process typeCaste operator will be added automatically by (javac) compiler, hence it is Auto upCasting.
3. Using the upCasted reference variable we can access super class members or superMost class member but not subclass member.


Explicit DownCasting -

1. The process of converting the references from superclass type to the subclass known as downCasting.
2. using the downCasted reference variable we can access super class member or superMost class member and subclass member.


Note :- 
1. between two classes we will us the extends keyword.
2. between two interfaces we will us the extends keyword.
3. between one class and one interface  we will us the implements keyword.



Object creation :- 

1. A obj = new A();
2. B Obj = new B();
3. A obj = new B();
4. B obj = new A(); // ClassCastException 


Note:- In java direct downCasting is not allowed since their is possibliity 
of getting classCastExcpetion.


classCastExcpetion:- Whenever we perform downCasting  and try to access the subclass member which are not present within the object created known as classCastException hence in java we need to perform downCasting only after upCasting.












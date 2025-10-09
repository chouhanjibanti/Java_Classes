Is-A Relationship :- [Inheritance]

1. The process of aquaring the non static properties and behaviour of super class into the subclass object by using the extends keyword is known as
inheritance. 
2. static member do not exihibit inheritance since they can have single copy of memory block. 



Object        1.   Object     1. Object  [SuperMost class]
 |                   |             |                  -> extends
superclass           A             A   [super Class]
 |                                 |                  -> extends
 subclass                          B   [Sub class]
 
 
 Object       Object obj = new Object();
  |
 Vehicle     Vehicle obj1 = new Vehicle();
  |
 Bike         Bike obj2 = new Bike();
 
 
 Is-A Relationship [inheritance] :- 
 
 we will always create the object of the child class.
 
 UserLogic -> Main -> Child [Bike]
 
 
 
Note :- 
 1. Every java program automatically exihibit inheritance by extending supermost class known as object class.
 2) Object class consisting of 11 non static methods and 1 no argument constructor where 11 non static methods automatically get inherited into any class.
 3) javac automatically extends any program with Object class if a developer do not add extends keyword.

class A{             class A extends Obejct{
  // javac     ->      p1(){ 
}                          // default constructor 
                           }
                         }
 
 
super() :- It is a first default statement within the constructor added by the compiler when developer do not add this() which is use to call the constructor of the super class.

============================================
 
 Job of new Operator :- 
 
 when we create an object of subclass[child class]
 
 1. new operator/keyword create a subclass object.
 
 2. It load all the non static members of object class , super class and finally subclass.
 
 3. Executes non static initilizer of supermost , super class or finally subclass.
 
 4. new operator calls the subclass constructor which intern call super class constructor and finally super most class constructor.
 
 5. Once object is created address is returned .
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
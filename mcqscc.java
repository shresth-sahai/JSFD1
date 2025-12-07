// public class mcqscc {
//     1. What does the super() keyword do inside a child class constructor?

// a) Calls a static method of parent
// b) Calls the parent class constructor
// c) Calls a method of child class
// d) Creates an object of parent class

// 2. Where must super() be placed in the constructor?

// a) Anywhere in the constructor
// b) After the first line
// c) It must be the first statement
// d) No rule exists

// 3. If the parent class does NOT have a default constructor, the child must:

// a) Write its own default constructor
// b) Not extend the parent
// c) Call super() without arguments
// d) Call super() with arguments

// 4. What happens if you do not explicitly write super() in the child constructor?

// a) Java adds this() automatically
// b) Java adds super() automatically
// c) Code will not compile
// d) Parent constructor will not run

// 5. Which constructor is called FIRST during object creation?

// a) Child class constructor
// b) Parent class constructor
// c) Child parameterized constructor
// d) JVM runtime constructor

// 6. Which of the following is TRUE about constructor chaining?

// a) Only this() can be used for chaining
// b) Only super() can be used for chaining
// c) this() and super() can both be used, but not together
// d) this() and super() can appear in the same constructor

// 7. What is the output order when creating a child object?

// a) Child → Parent
// b) Parent → Child
// c) Child constructor only
// d) Depends on JVM

// 8. What will happen if a class has ONLY a parameterized constructor and no default constructor?

// a) Child class must call super() with argument
// b) Java will automatically create a default constructor
// c) Child class will compile without issue
// d) Parent class constructor is skipped

// 9. Which keyword is used to call a parent class method when child has overridden it?

// a) this
// b) parent
// c) super
// d) parentMethod

// 10. What happens if both parent and child have parameterized constructors?

// a) Child cannot extend the parent
// b) Child MUST call super(arguments)
// c) JVM picks a random constructor
// d) The parent constructor doesn't execute
// }


// Create a class Bank with:

// static variable bankName = "HDFC"

// static method changeBank(String)

// instance variables: name, balance

// constructor to initialize instance variables

// instance method showAccountDetails()

// Task:

// In main:

// Create 2 Bank objects

// Change bank name using static method

// Show both objects' details

// Observe static variable effect.




// Create an abstract class Animal with:

// Constructor → print "Animal created"

// abstract method sound()

// final method sleep() → print "Animal sleeping"

// Create subclass Dog:

// Constructor → print "Dog created"

// Implement sound() → "Dog barks"

// Try overriding sleep() (should be commented due to error)

// Task:

// In main:

// Create object of Dog (using reference of Animal)

// Show constructor order

// Call sound() and sleep()
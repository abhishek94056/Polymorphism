Q. What is the meaning of the word Polymorphism?
A. The Polymorphism is the ability to take up many forms.

Q. What is the meaning of the word Polymorphism in Java?
A. In Java, we can have many versions/forms of methods
Method overloading and Method overriding

Q. What are the types of Polymorphism?
A. Compile time Polymorphism & Runtime Polymorphism.

Note: 
1. The compile time Polymorphism is also called as early binding. It is also known as method overloading or static polymorphism.

2. The runtime Polymorphism is also called as late binding. It is also known as method overriding or dynamic polymorphism.

Q. What is method overloading?
A. overload = doing something beyond the limits

8 people = 6 people + 2 people
overload = normal + extra

Method overload -> Normal Task + Extra Task

Q. Why to overload a method?
Q. What is the use of method overloading?
A. To achieve some functionality in different ways.

Example 1:
//Normal Task = To print Hello
	public void show() {
		System.out.println("Hello!");
	}
	
	//Extra Task = To say Hi to the name
	public void show(String name) {
		System.out.println("Hi, " + name);
	}

Example 2:
public void login(long phoneNo) {
		System.out.println("Login using phone number");
	}


	public void login(String username, String password) {
		System.out.println("Login using email id and password");
	}
	
	public void login(String googleAccount) {
		System.out.println("Login using Google account");
	}

The methods with same name but different parameters are overloaded.

Q. What is Constructor overloading?
A. Many constructors of same class with different parameters.
Example:

public class Job {
	
	public Job() {
		System.out.println("non-para cons");
	}
	
	public Job(int n) {
		System.out.println("para cons");
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Method overriding:
overriding = replacing old by new
Method overriding = replacing old definition by new definition
Example:
Parent class : greet() -> Pranam
Child class : greet() -> Namaste

Application of Method overriding:
Whenever we need to modify the original functionality to new one. we must override the existing methods.

Bullet points:

1. We must have inheritance in picture in order to override a method.

2. The methods with same name and same parameters in inherited classes are called overridden.

3. The final method can not be overridden.

4. The final method can be overloaded.

5. The constructor overriding is NOT possible.

The parent can hold reference of child. It means, we can call the constructor of child class to create child's object but we store it in parent. It is called as "Dynamic Dispatch".


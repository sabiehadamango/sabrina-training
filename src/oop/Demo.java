package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	
	}
}



public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Sabrina";
		person1.email = "sabrina@haha.com";
		person1.phone = "7990030826";
		
		// Abstraction
		person1.walk();
		
	
		Person person2 = new Person();
			
		person2.name = "Clara";
		person2.email = "clara@haha.com";
		person2.phone = "868694";
		
		person2.eat();
		
		
		
		/*
		// Person -
		String name = "Joe";
		String email = "joe@test.com";
		String phone = "0790987636";
		
		// Action, activity, behaviour
		System.out.println(name);

		// What about binding attributes and properties together?
	}

	// Enhance by adding functions to minimise code
	static void walking(String name) {
		System.out.println(name + " is walking");
		
		/* 
		 *
		 */
	}
}

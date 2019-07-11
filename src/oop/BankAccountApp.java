package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account 
		
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Roger Hue";
		//Encapsulation
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.getSsn("73646234");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "0192837";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		
		
		acc1.deposit(5000);
		
		
		System.out.println(acc1.toString());	
		/*
		
	
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		
		*/
		
	}

}

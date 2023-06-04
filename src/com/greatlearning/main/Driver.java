package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

public class Driver {

//	public static void main(String[] args) {
//		
//		try {
//			int i = 10; //...is defined by a constant
//			int y = 0; //... user input
//			System.out.println(i/y);
//			String str = null;
////			if(str!=null) {
//				System.out.println(str.length());
////			}
//			divideNumbers(i,y);
//		}
////		catch(ArithmeticException ae) {
////			System.out.println(ae.getMessage());
////			ae.printStackTrace();
////		}
//		catch(Throwable e) {
//			System.out.println("Non arithmetic exceptions");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			handleException();
//		}
////		int i =10;
////		System.out.println(i/0);
//		System.out.println("division successful");
//		
//	
//	}
//
//	private static void divideNumbers(int i, int y) throws UserException {
//		// TODO Auto-generated method stub
//		try {
//			System.out.println(i/y);
//		}catch(ArithmeticException e) {
//			throw new UserException("arithmetic exception, fallback to default");
//		}
//	}
//
//	private static void handleException() {
//		// TODO Auto-generated method stub
//		
//	}
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
//		System.out.println("Hi");
		Employee employee = new Employee("harshit","kumar");
		//Create an employee object.... hard code .. 
		//..print department options
		//get userinput
		//print userinput
		//ICredentials
		//(Technical, Admin, Human Resource, 
//		Legal
		displayMenu();
		int option = scanner.nextInt();
//		System.out.println(option);
		CredentialService credentialService = new CredentialService();
//		credentialService.generatePassword();
//		String emailAddress=null;
//		switch(option) {
//			case 1 : emailAddress = credentialService.generateEmailAddress(employee, "tech");
//		}
		String[] departments = {"tech","admin","hr","legal"};
		
		String	emailAddress = credentialService.generateEmailAddress(employee, departments[option-1]);
		
//		System.out.println(emailAddress);
		String password = credentialService.generatePassword();
//		System.out.println(password);
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		credentialService.showCredentials(employee);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}

}

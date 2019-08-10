package com.infy.exercise06;
class Loan {

	public double calculateEMI(double principal) {
		double simpleInterest = (principal * 8.5 * 5) / 100;
		return (simpleInterest + principal) / 5;
	}

}

class HomeLoan extends Loan {

	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 7.5 * 20) / 100;
		return additionalTax + (simpleInterest + principal) / 20;
	}

}

class VehicleLoan extends Loan {

	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 9.5 * 10) / 100;
		return additionalTax + (simpleInterest + principal) / 10;
	}

}

public class Exercise06 {

	public static void Run(String[] args) {
		
		System.out.println();
		System.out.println("-------------- Excercise 06 -------------------");
		System.out.println();
		
		Loan loan = null;
		
		loan = new HomeLoan(); //Runtime polymorphism
		double hLoan = loan.calculateEMI(2000000);
		
		loan = new VehicleLoan();
		double vLoan = loan.calculateEMI(100000);
		
		System.out.println("Home Loan emi per year..." + hLoan);
		System.out.println("Vehicle Loan emi per year..." + vLoan);

	}

}

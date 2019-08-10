package com.infy.exercise05;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
class Loan {
  int tenure;
  double principal;
  float interestRate;
  String accountNumber;
  public double calculateEMI(){
      double simpleInterest = (principal*interestRate*tenure)/100;
      double emi = (simpleInterest+principal)/tenure;
      return emi;
  }
}

public class Exercise05 extends Loan  {
	Exercise05(){
		tenure = 5; // reusing super class member variables
		principal = 20000;
		interestRate = 8.5f;
		accountNumber = "Acc12345";
	}

	public static void Run(String[] args) {
		
		System.out.println();
		System.out.println("-------------- Excercise 05 -------------------");
		System.out.println();
		
		Exercise05 hloan = new Exercise05();
		double amount = hloan.calculateEMI(); // sub class Object
												// invoking super class method
		System.out.println("emi per year..." + amount);
	}
}

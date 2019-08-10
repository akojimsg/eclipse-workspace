package com.infy.exercise09;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
class MumbaiOffice implements IBank {

	public String createAccount(Customer customer) {
		return "Acc12345";
	}

	public double issueVehicleLoan(String vehicleType, Customer customer) {
		if (vehicleType.equals("bike")) {
			return 100000;
		} else {
			return 500000;
		}
	}

	public double issueHouseLoan(Customer customer) {
		return 200000;
	}

	public double issueGoldLoan(Customer customer) {
		return 500000;
	}

}

public class Exercise09 {

	/**
	 * @param args
	 */
	public static void Run(String[] args) {

		System.out.println();
		System.out.println("-------------- Excercise 01 -------------------");
		System.out.println();
		
		IBank bank = new MumbaiOffice();
		Customer customer = new Customer();
		customer.setCustomerId("cust1001");
		customer.setName("Ajay");
		String accountNumber = bank.createAccount(customer);
		System.out.println("Account number is..." + accountNumber);
		double gloan = bank.issueGoldLoan(customer);
		System.out.println("Gold loan amount is..." + gloan);
		double hloan = bank.issueHouseLoan(customer);
		System.out.println("House loan amount is..." + hloan);
		double vloan = bank.issueVehicleLoan("Sedan", customer);
		System.out.println("Vehicle loan amount is..." + vloan);
		System.out.println("Caution money is..." + IBank.CAUTION_MONEY);
	}

}

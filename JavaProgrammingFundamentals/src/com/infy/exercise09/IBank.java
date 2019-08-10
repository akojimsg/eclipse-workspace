package com.infy.exercise09;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
public interface IBank {
	int CAUTION_MONEY = 2000;

	String createAccount(Customer customer);

	double issueVehicleLoan(String vehicletype, Customer customer);

	double issueHouseLoan(Customer customer);

	double issueGoldLoan(Customer customer);
}

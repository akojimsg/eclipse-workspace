package com.infy.exercise03;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
public class Exercise03 {

	/**
	 * @param args
	 */
	public static void Run(String[] args) {
		System.out.println();
		System.out.println("-------------- Excercise 03 -------------------");
		System.out.println();
		double balance = 6000, rateOfInterest = .10, interest = 0;
		double withdrawal = 500, deposit = 600;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int i : arr) { // enhanced for loop
			balance += deposit;
			balance -= withdrawal;
			interest = balance * rateOfInterest;
			balance += interest;

			System.out.println(String.format("The interest for the month %d is %f", i, interest));
		}

		System.out.println(String.format("The balance at the end of the year is %f", balance));

	}

}

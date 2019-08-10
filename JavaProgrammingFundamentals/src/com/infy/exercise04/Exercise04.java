package com.infy.exercise04;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
public class Exercise04 {
	private String bankName, area;
	private String phoneNumber;

	Exercise04() { // Default constructor
		bankName = "IBank";
		area = "Gandhi Nagar";
		phoneNumber = "9876543210";
	}

	Exercise04(String bname, String barea, String phoneNo) { // Parameterized constructor
		bankName = bname;
		area = barea;
		phoneNumber = phoneNo;
	}

	void displayBankDetails() {
		System.out.println("bank Name: " + bankName);
		System.out.println("Area of bank: " + area);
		System.out.println("Phone number of bank: " + phoneNumber);
	}

	public static void Run(String[] args) {
		System.out.println();
		System.out.println("-------------- Excercise 04 -------------------");
		System.out.println();
		Exercise04 bank1 = new Exercise04(); // call default constructor
		Exercise04 bank2 = new Exercise04("IBank", "Jaydev Nagar", "8876543219"); // call Parameterized constructor

		bank1.displayBankDetails();
		System.out.println("***********************");
		bank2.displayBankDetails();
	}
}

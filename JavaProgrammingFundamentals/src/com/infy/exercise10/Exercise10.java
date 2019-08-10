package com.infy.exercise10;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
public class Exercise10 {

	static boolean CheckPalindromeByDivision(int number, boolean debug) {

		int copy = number;
		int reverse = 0;

		while (number > 0) {

			reverse = (reverse * 10) + number % 10;
			number /= 10;

			if (debug) {
				System.out.println(String.format("Number: %d", number));
				System.out.println(String.format("copy: %d", copy));
				System.out.println(String.format("Reverse: %d", reverse));
			}
		}
		
		System.out.println(String.format("copy: %s", copy));
		System.out.println(String.format("Reverse: %s", reverse));
		return copy == reverse;
	}

	static boolean CheckPalindromeBySB(int number) {

		StringBuilder sb = new StringBuilder();
		sb.append(number);

		String copy = sb.toString();
		String reverse = sb.reverse().toString();

		System.out.println(String.format("copy: %s", copy));
		System.out.println(String.format("Reverse: %s", reverse));

		return copy.equals(reverse);
	}

	/**
	 * @param args
	 */
	public static void Run(String[] args) {
		
		System.out.println();
		System.out.println("-------------- Excercise 10 -------------------");
		System.out.println();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Testing by division method ...");
		System.out.println(
				Exercise10.CheckPalindromeByDivision(456707654, false) ? "Number is Palindrome" : "Number is not Palindrome");

		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Testing by string builder ...");
		System.out.println(Exercise10.CheckPalindromeBySB(456707654) ? "Number is Palindrome" : "Number is not Palindrome");

		System.out.println();
		System.out.println("------------------------------------------------");		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your rollno: ");
        int rollno=sc.nextInt();
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your fee: ");
        Double fee=sc.nextDouble();
        System.out.println("Rollno: "+rollno+", name: "+name+", fee: "+fee);
        sc.close();//release the resource
	}

}

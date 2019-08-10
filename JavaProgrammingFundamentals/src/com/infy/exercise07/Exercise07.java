package com.infy.exercise07;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
enum Day {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	private int value;

	private Day(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}

public class Exercise07 {

	/**
	 * @param args
	 */
	public static void Run(String[] args) {
		
		System.out.println();
		System.out.println("-------------- Excercise 07 -------------------");
		System.out.println();
		
		// printing all constants of an enum
		for (Day day : Day.values())
			System.out.println("Day:" + day.name() + " Value:" + day.getValue());
	}

}

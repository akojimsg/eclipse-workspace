/**
 * 
 */
package com.infy.jlf.exceptions;

/**
 * @author ezekiel.inalegwu
 *
 */
public class TryMathCube {
	public int cube(int n) {
		return n * n * n;
	}

	public static void Execute(String[] args) throws Exception {
		try {
			TryMathCube tc = new TryMathCube();
			int num = Integer.parseInt(args[0]);
			System.out.println(tc.cube(num));
		} catch (NumberFormatException e) {
			throw new Exception("you have entered an invalid number");
		}
	}
}

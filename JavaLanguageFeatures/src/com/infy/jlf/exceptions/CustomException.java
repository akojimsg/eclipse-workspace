/**
 * 
 */
package com.infy.jlf.exceptions;

/**
 * @author ezekiel.inalegwu
 *
 */
public class CustomException {
	
	static class MyOwnException extends Exception {

		private static final long serialVersionUID = 6600046480233741504L;

		public MyOwnException(String msg) {
			super(msg);
		}
	}

	/**
	 * 
	 */
	public CustomException() {
		// TODO Auto-generated constructor stub
	}
	
	static void testCode() throws MyOwnException {
		try {
			throw new MyOwnException("test exception");
		} catch (Exception ex) {
			System.out.println("Generic exception caught ");
		}
	}
	
	public static void Execute(String[] args) {
		try {
			testCode();
		} catch (MyOwnException ex) {
			System.out.println("custom exception handling");
		}
	}	

}

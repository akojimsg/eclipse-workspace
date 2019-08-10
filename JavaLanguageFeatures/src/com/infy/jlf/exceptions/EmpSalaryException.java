/**
 * 
 */
package com.infy.jlf.exceptions;

/**
 * @author ezekiel.inalegwu
 *
 */
public class EmpSalaryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2693652265639501341L;

	/**
	 * 
	 */
	public EmpSalaryException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public EmpSalaryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public EmpSalaryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EmpSalaryException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EmpSalaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

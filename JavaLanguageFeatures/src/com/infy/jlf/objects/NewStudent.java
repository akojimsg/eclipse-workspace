/**
 * 
 */
package com.infy.jlf.objects;

/**
 * @author ezekiel.inalegwu
 *
 */
public abstract class NewStudent {

	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	abstract void calculateFee();
}

package com.infy.exercise01;
/*************************************************************************************************************
 * Problem Description:
 * 
 * Infosys University is automating the process of registration of students and
 * displaying the details of the registered students along with their
 * residential status.
 * 
 * The residential status can be "H" for hostellers and "D" for day scholars. To
 * achieve the requirement, they created a class Student having getters and
 * setters in order to access the private member variables.
 * 
 * getxxx() and setxxx() methods are the getter and setter methods, where 'xxx'
 * is the member variable name.
 * 
 *************************************************************************************************************/
enum Grade {
	A,
	B,
	C,
	D,
	E
}

public class Student {

	private int studentId;
	private String name;
	private float qualifyingExammarks;
	private char residentialStatus;
	private int yearOfEngg;
	private Grade grade;
	private double scholarshipAmount;
	private float totalMarks;


	public Student(int studentId, String name, float qualifyingExammarks, char residentialStatus, int yearOfEngg) {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Creating new student object ...");

		this.studentId = studentId;
		this.name = name;
		this.qualifyingExammarks = qualifyingExammarks;
		this.residentialStatus = residentialStatus;
		this.yearOfEngg = yearOfEngg;

		System.out.println("Created new student object!");
	}

	public Student() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Created new student object!");
	}

	public void PrintStudentInfo() {

		System.out.println();
		System.out.println();
		System.out.println("Printing student information ...");
		System.out.println();
		System.out.println("******* Student information*********");
		System.out.println(String.format("Student Name        : %s", this.getName()));
		System.out.println(String.format("Student Id          : %d", this.getStudentId()));
		System.out.println(String.format("Qualifying Marks    : %f", this.getQualifyingExammarks()));
		System.out.println(String.format("Year of Engineering : %d", this.getYearOfEngg()));
		System.out.println(String.format("Residential Status  : %s\t",
				this.residentialStatus == 'H' ? "Hostellers" : "Day Scholar"));
		System.out.println();
		System.out.println("Printed student information!");
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the qualifyingExammarks
	 */
	public float getQualifyingExammarks() {
		return qualifyingExammarks;
	}

	/**
	 * @param qualifyingExammarks the qualifyingExammarks to set
	 */
	public void setQualifyingExammarks(float qualifyingExammarks) {
		this.qualifyingExammarks = qualifyingExammarks;
	}

	/**
	 * @return the residentialStatus
	 */
	public char getResidentialStatus() {
		return residentialStatus;
	}

	/**
	 * @param residentialStatus the residentialStatus to set
	 */
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	/**
	 * @return the yearOfEngg
	 */
	public int getYearOfEngg() {
		return yearOfEngg;
	}

	/**
	 * @param yearOfEngg the yearOfEngg to set
	 */
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	/**
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	/**
	 * @return the scholarshipAmount
	 */
	public double getScholarshipAmount() {
		return scholarshipAmount;
	}

	/**
	 * @param scholarshipAmount the scholarshipAmount to set
	 */
	public void setScholarshipAmount(double scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}

	/**
	 * @return the totalMarks
	 */
	public float getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public void CalculateGrade() {
		if (totalMarks >= 250)
			grade = Grade.A;
		else if (totalMarks >= 200 && totalMarks < 250)
			grade = Grade.B;
		else if (totalMarks >= 175 && totalMarks < 200)
			grade = Grade.C;
		else if (totalMarks >= 150 && totalMarks < 175)
			grade = Grade.D;
		else
			grade = Grade.E;
	}

	public void CalculateScholarshipAmount() {
		switch (grade) {
		case A:
			scholarshipAmount = 5000;
			break;
		case B:
			scholarshipAmount = 4000;
			break;
		case C:
			scholarshipAmount = 3000;
			break;
		case D:
			scholarshipAmount = 2000;
			break;
		default:
			scholarshipAmount = 0;
		}
	}
}

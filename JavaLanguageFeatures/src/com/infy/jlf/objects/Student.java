/**
 * 
 */
package com.infy.jlf.objects;

/**
 * @author ezekiel.inalegwu
 *
 */
enum Grade{ A, B, C; }

public class Student {

    private int studentId;
    private String studentName;
    private int rollNumber;
    private int totalMarks;
    private Grade grade;
    
    public Student(int studentId, String studentName)
    {
        this.studentId=this.rollNumber=studentId;
        this.studentName=studentName;
    }
    
    public Student(String studentName, int rollNumber)
    {
        this.studentId=this.rollNumber=rollNumber;
        this.studentName=studentName;
    }
    
    public int getStudentId() {
    	return studentId;
    }
    
    public String getStudentName() {
    	return studentName;
    }

	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}    
	
	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
		calculateGrade();
	}
	
	public void calculateGrade() {
		
		if(this.totalMarks >= 60) this.grade = Grade.A;
		
		else if(this.totalMarks > 40 && this.totalMarks < 60) this.grade = Grade.B;
		
		else this.grade = Grade.C;
		
	}
	
	private Grade getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return String.format("{name: %s, rollNumber: %d, totalMarks: %d, Grade: %s}", 
				studentName, 
				this.rollNumber,
				this.totalMarks,
				this.getGrade());
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return student.rollNumber == this.rollNumber;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.rollNumber;
	}
	
	void calculateFee() {}
}

package com.infy.exercise01;

public class Exercise01 {

	public static void Run(String[] args) {
		
		System.out.println();
		System.out.println("-------------- Excercise 01 -------------------");
		System.out.println();
		
		//Create an object of student class
		Student student01 = new Student(1001,"Jacob",80,'H',3);
		student01.PrintStudentInfo();
		
		Student student02 = new Student();
		
		//Use setters method to set the values
		student02.setStudentId(1002);
		student02.setName("Peter");
		student02.setQualifyingExammarks(83);
		student02.setResidentialStatus('D');
		student02.setYearOfEngg(2);
		
		student02.PrintStudentInfo();
		
		//Use getters method with proper escape sequence to display values
		System.out.println();
		System.out.println();
		System.out.println("Infosys university app runned succesfully!");
	}

}



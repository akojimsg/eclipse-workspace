package com.infy.jlf.exceptions;

public class ExceptionExercises {

	public static void Run(String[] args) throws Exception {
		
		System.out.println("Running try math cube ...");
		TryMathCube.Execute(args);
		
		System.out.println();
		System.out.println("Running custom exception ...");
		CustomException.Execute(args);
		
		System.out.println();
		System.out.println("Running employee service ...");
		EmployeeService.Execute(args);
	}

}

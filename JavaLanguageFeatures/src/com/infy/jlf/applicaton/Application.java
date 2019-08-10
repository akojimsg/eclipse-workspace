/**
 * 
 */
package com.infy.jlf.applicaton;

import java.io.IOException;
import java.util.Scanner;

import com.infy.jlf.collection.CollectionsDemo;
import com.infy.jlf.exceptions.ExceptionExercises;
import com.infy.jlf.generics.*;

/**
 * @author ezekiel.inalegwu
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		int selectedOption = 0;
		Scanner inputReader = new Scanner(System.in);

		do {
			
			Menu.Print();
			
			try {
				System.out.print("Select an application to execute: ");
				selectedOption = inputReader.nextInt();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				selectedOption = 0;
			}
			
			switch (selectedOption) {
			case 1:
				// Exception exercises
				try {
					ExceptionExercises.Run(args);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 2:
				// Generic exercises
				GenericsDemo.Run(args);
				break;

			case 3:
				// Generic exercises
				CollectionsDemo.Run(args);
				break;	
				
			case 4:
				// Test Regex 
				com.infy.jlf.objects.RegexTester.Run();
				break;	
				
			case 5:
				// Test Annotations 
				try {
					com.infy.jlf.annotation.AnnotationsTester.Run();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;					
				
			case 10:
				// Generic exercises
				selectedOption = -1;
				break;				
				
			default:
				System.out.println("Please select a valid option.");
				break;
			}
			
			if(0 > selectedOption) continue;
			
			System.out.println("Press <<Enter>> to continue ...");
			System.in.read();
			
		} while (selectedOption > 0);
		
		System.out.println();
		System.out.println("Program exited with -1");
		inputReader.close();

	}
}

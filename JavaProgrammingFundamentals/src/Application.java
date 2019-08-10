
/**
 * 
 */
import java.util.Calendar;

import com.infy.exercise01.*;
import com.infy.exercise02.Exercise02;
import com.infy.exercise03.Exercise03;
import com.infy.exercise04.Exercise04;
import com.infy.exercise05.Exercise05;
import com.infy.exercise06.Exercise06;
import com.infy.exercise07.Exercise07;
import com.infy.exercise08.Exercise08;
import com.infy.exercise09.Exercise09;
import com.infy.exercise10.Exercise10;

/**
 * @author ezekiel.inalegwu
 *
 */
public class Application {

	public static void runTryOutExercise(String[] args) {
		System.out.println();
		System.out.println("-------------- Tryout Exercise -------------------");
		System.out.println();
		RoomDetails client01 = new RoomDetails("John Doe", "Deluxe", 5, 1);

		System.out.println("*******************************************");
		System.out.println("");
		System.out.println(String.format("Build Id: %20d", client01.getBillId()));
		System.out.println(String.format("Customer Name: %20s", client01.getCustomerName()));
		System.out.println(String.format("No. of days of stay: %7d", client01.getNoOfDaysOfStay()));
		System.out.println(String.format("Total bill: %27f", client01.CalculateBill()));

		RoomDetails client02 = new RoomDetails("Mary Jane", "Standard", 7, 1);

		System.out.println("");
		System.out.println("*******************************************");
		System.out.println(String.format("Build Id: %20d", client02.getBillId()));
		System.out.println(String.format("Customer Name: %21s", client02.getCustomerName()));
		System.out.println(String.format("No. of days of stay: %7d", client02.getNoOfDaysOfStay()));
		System.out.println(String.format("Total bill: %27f", client02.CalculateBill()));
	}

	public static void runCalenderDemo(String[] args) {
		System.out.println();
		System.out.println("-------------- Calender Demo -------------------");
		System.out.println();

		Calendar cal = Calendar.getInstance();// Create Calendar
		System.out.println("Current Date is\t: " + cal.getTime() + "\n");// print current date
		cal.set(1992, 0, 1);// set the date to 1st Jan,1992
		System.out.println("Date after 1st modification\t: " + cal.getTime() + "\n");
		cal.add(Calendar.MONTH, 3);// add 3 months
		System.out.println("Date after adding 3 months\t: " + cal.getTime() + "\n");
		cal.add(Calendar.YEAR, -3);// subtract 3 years
		System.out.println("Date after subtracting 3 years\t: " + cal.getTime() + "\n");

		Calendar cal2 = Calendar.getInstance();
		int date = cal2.get(Calendar.DATE);
		int month = cal2.get(Calendar.MONTH) + 1;
		int year = cal2.get(Calendar.YEAR);
		int time = cal2.get(Calendar.HOUR_OF_DAY);
		System.out.print("today is..." + date + "/" + month + "/" + year);
		System.out.println(", " + time + "PM");
	}

	public static void runEnumExercise(String[] args) {
		System.out.println();
		System.out.println("-------------- Enum Exercise -------------------");
		System.out.println();
		
		Student s1 = new Student();
		s1.setStudentId(1000);
		s1.setName("john doe");
		s1.setTotalMarks(280);
		s1.CalculateGrade();
		s1.CalculateScholarshipAmount();

		System.out.println("               Student Details                ");
		System.out.println("**********************************************");
		System.out.println("Student Id: " + s1.getStudentId());
		System.out.println(String.format("Student Name: %s", s1.getName()));
		System.out.println(String.format("Student Grade: %s", s1.getGrade()));
		System.out.println(String.format("Scholarship Amount: %f", s1.getScholarshipAmount()));
		System.out.println("**********************************************");
	}

	/**
	 * @param args
	 */
	public static final void main(String args[]) {
		
		//String args[] = {"Some", "Random", "Arguments"};
		
		// Run tryout Exercise
		Application.runTryOutExercise(args);

		// Calender demo
		Application.runCalenderDemo(args);
		
		// Enum Exercise
		Application.runEnumExercise(args);
		
		// Exercise01
		Exercise01.Run(args);

		// Exercise02
		Exercise02.Run(args);

		// Exercise03
		Exercise03.Run(args);

		// Exercise04
		Exercise04.Run(args);

		// Exercise05
		Exercise05.Run(args);

		// Exercise06
		Exercise06.Run(args);

		// Exercise07
		Exercise07.Run(args);

		// Exercise08
		Exercise08.Run(args);

		// Exercise09
		Exercise09.Run(args);

		// Exercise10
		Exercise10.Run(args);
		
		//Interface exercise
		InterfaceExercise.Run(args);
	}

}

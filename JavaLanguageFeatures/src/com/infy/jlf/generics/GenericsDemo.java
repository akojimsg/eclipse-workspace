/**
 * 
 */
package com.infy.jlf.generics;

import com.infy.jlf.objects.Student;

/**
 * @author ezekiel.inalegwu
 *
 */
class SimpleGeneric<T extends Number> {
	private T obj;

	public SimpleGeneric(T obj) {
		this.obj = obj;
	}

	public void showObjectType() {
		System.out.println("Object type is " + obj.getClass().getName());
	}
}

class UserInterface {
	public static <E> void display(E[] list) { // generic method displaying the elements of an array
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i] + ", ");
	}

	public static void Execute(String[] args) {
		String cities[] = { "Bengaluru", "Chennai" };
		Integer codes[] = { 12, 14, 15 };
		UserInterface.display(codes);
		UserInterface.display(cities);

	}

}

class TestGenerics {

	// define printArray method
	public static <E> void printArray(E[] items) {
		for (int i = 0; i < items.length; i++)
			System.out.print(String.format("%s %s", items[i].toString(), i + 1 == items.length ? ";" : ", "));
		System.out.println();
	}

	public static void Execute(String[] args) {

		Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
		Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
		Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
		printArray(arrInteger);
		printArray(arrChar);
		printArray(arrDouble);

	}
}

public class GenericsDemo {

	static class Record<E> {
		private E record;

		public void display(E item) {
			System.out.println(item);
		}

		/**
		 * @return the record
		 */
		public E getRecord() {
			return record;
		}

	}

	/**
	 * 
	 */
	public GenericsDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void Run(String[] args) {
		Student s1 = new Student(101, "Robert");

		Record<Integer> integerRecord = new Record<Integer>(); // integerRecord can be used to display only integers
		integerRecord.display(12);
		// integerRecord.display(s1); will give an error as we are trying to add a
		// student class object

		Record<Student> studentRecord = new Record<>(); // studentRecord can be used to display only Students
		studentRecord.display(s1);
		// studentRecord.display(15); will give an error as we are trying to add an
		// integer

		SimpleGeneric<Double> genClass = new SimpleGeneric<Double>(45.02);
		genClass.showObjectType();

		UserInterface.Execute(args);

		TestGenerics.Execute(args);
		
		WildCardsDemo.Execute(args);
	}

}

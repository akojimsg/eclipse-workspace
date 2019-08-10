/**
 * 
 */
package com.infy.jlf.collection;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.infy.jlf.generics.StudentMarkComparator;
import com.infy.jlf.generics.StudentNameComparator;
import com.infy.jlf.objects.Student;

/**
 * @author ezekiel.inalegwu
 *
 */
public class SetInterface {

	/**
	 * 
	 */
	public SetInterface() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void Execute() {
		//  Creating a new Set object of type Integer
		Set<Integer> numberSet = new LinkedHashSet<>();
		 
		//  Adding elements to the set
		numberSet.add(12);
		numberSet.add(24);
		numberSet.add(12);
		 
		//  Displaying the Set
		System.out.println(numberSet);
		
		java.util.Random random = new java.util.Random();
		
		// Creating a new Set object of type Student
		Set<Student> studentSet = new HashSet<>();
		Set<Student> nameComparatorStudentTreeSet = new TreeSet<>(new StudentNameComparator().reversed());
		Set<Student> markComparatorStudentTreeSet = new TreeSet<>(new StudentMarkComparator());
		
		Student student1 = new Student("Adam",101);
		student1.setTotalMarks(random.nextInt(30) + 30);
		Student student2 = new Student("Jane",102);
		student2.setTotalMarks(random.nextInt(30) + 40);
		Student student3 = new Student("Ngozi",103);
		student3.setTotalMarks(random.nextInt(40) + 40);
		Student student4 = new Student("James",104);
		student4.setTotalMarks(random.nextInt(40) + 50);
		Student student5 = new Student("Linda",105);
		student5.setTotalMarks(random.nextInt(40) + 60);
		
		studentSet.add(student3);
		studentSet.add(student2);
		studentSet.add(student1);
		studentSet.add(student5);
		studentSet.add(student4);
		

		
		studentSet.forEach(student -> {
			nameComparatorStudentTreeSet.add(student);
			markComparatorStudentTreeSet.add(student);
		});
		
		
		System.out.println("Sorted by default");
		System.out.println(studentSet);
		System.out.println("Sorted by name");
		System.out.println(nameComparatorStudentTreeSet);
		System.out.println("Sorted by mark");
		System.out.println(markComparatorStudentTreeSet);		
	}

}

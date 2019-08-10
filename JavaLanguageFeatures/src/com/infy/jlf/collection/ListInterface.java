/**
 * 
 */
package com.infy.jlf.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.infy.jlf.generics.CourseIdComparator;
import com.infy.jlf.objects.Course;

/**
 * @author ezekiel.inalegwu
 *
 */
public class ListInterface {

	/**
	 * @param args
	 */
	public static void Execute(String[] args) {
		List<Course> linkedCourseList = new LinkedList<>();
		linkedCourseList.add(new Course("Java"));
		linkedCourseList.add(new Course("Hibernate"));
		linkedCourseList.add(new Course("AngularJS"));
		
		// Accesing the list of courses Using Iterator
		Iterator<Course> courseIterator = linkedCourseList.iterator();
		System.out.println("Using Iterator to access the list of courses");
		while (courseIterator.hasNext()) {
			Course c = courseIterator.next();
			System.out.println(c); // toString() method has been overridden in the Course class
		}
		
		// Accesing the list of courses Using for loop
		System.out.println("Using for loop to access the list of courses");
		for (int index = 0; index < linkedCourseList.size(); index++) {
			System.out.println(linkedCourseList.get(index));
		}

		// Accesing the list of courses Using enhanced for loop (for-each)
		System.out.println("Using enhanced for loop to access the list of courses");
		for (Course c : linkedCourseList) { // Can be read as: for each Course c in courseList
			System.out.println(c);
		}
		
		ArrayList<Course> arrayCourseList = new ArrayList<>();
		arrayCourseList.add(new Course(124, "AngularJS"));
		arrayCourseList.add(new Course(120, "Java"));
		arrayCourseList.add(new Course(121, "Hibernate"));

		Collections.sort(arrayCourseList, new CourseIdComparator());
		System.out.println(arrayCourseList);

	}

}

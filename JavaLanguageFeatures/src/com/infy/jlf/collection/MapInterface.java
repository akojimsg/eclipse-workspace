/**
 * 
 */
package com.infy.jlf.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.infy.jlf.objects.Course;
import com.infy.jlf.objects.Student;

/**
 * @author ezekiel.inalegwu
 *
 */
public class MapInterface {

	/**
	 * 
	 */
	public MapInterface() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void Execute() {
		Set<Course> courseSet1 = new HashSet<>();
		courseSet1.add(new Course("Java"));
		courseSet1.add(new Course("DBMS"));

		Set<Course> courseSet2 = new HashSet<>();
		courseSet2.add(new Course("PHP"));
		courseSet2.add(new Course("HTML"));
		courseSet2.add(new Course("CSS"));

		Map<Integer, Set<Course>> studentCourses = new HashMap<>();
		studentCourses.put(1001, courseSet1);
		studentCourses.put(1002, courseSet2);

		// Retrieving the set of Courses by studentID using get() method
		Set<Course> courseSet = studentCourses.get(1001);
		System.out.println("Retrieving the set of Courses by studentID: ");
		System.out.println(courseSet);

		// Iterating over the set of keys using for-each loop
		Set<Integer> setOfKeys = studentCourses.keySet();
		System.out.println("Iterating over the set of keys using for-each loop: ");
		for (Integer i : setOfKeys) {
			System.out.println(studentCourses.get(i));
		}
		// Iterating over the collection using values() method
		System.out.println("Iterating over the collection using values() method: ");
		for (Set<Course> courseSett : studentCourses.values()) {
			System.out.println(courseSett);
		}
		
		// Creating a new Set object of type Student
		Set<Student> studentSet = new HashSet<>();
		Student student3 = new Student("Linda",101);
		Student student1 = new Student("Adam",102);
		Student student2 = new Student("Mbapuun",103);
		Student student4 = new Student("Akosu",104);
		Student student5 = new Student("Nkem",105);
		
		java.util.Random random = new java.util.Random();
		
		studentSet.add(student3);
		studentSet.add(student2);
		studentSet.add(student1);
		studentSet.add(student4);
		studentSet.add(student5);
		
		Map<Integer, Student> studentGradeMap = new TreeMap<>();
		studentSet.forEach(student -> {
			student.setTotalMarks(random.nextInt(100));
			studentGradeMap.put(student.getRollNumber(), student);
		});

		System.out.println(studentGradeMap);
		
	}

}

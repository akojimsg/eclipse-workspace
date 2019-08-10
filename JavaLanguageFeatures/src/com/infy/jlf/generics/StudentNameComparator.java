/**
 * 
 */
package com.infy.jlf.generics;

import java.util.Comparator;

import com.infy.jlf.objects.Student;

/**
 * @author ezekiel.inalegwu
 *
 */
public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getStudentName().compareTo(o1.getStudentName());
	}

}

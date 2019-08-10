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
public class StudentMarkComparator implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {
		return (int) (o1.getTotalMarks() - o2.getTotalMarks());
	}

}

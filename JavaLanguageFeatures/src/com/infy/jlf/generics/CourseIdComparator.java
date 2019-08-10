package com.infy.jlf.generics;

import java.util.Comparator;

import com.infy.jlf.objects.Course;

public class CourseIdComparator implements Comparator<Course> {

	@Override
	public int compare(Course c1, Course c2) {
		return c1.courseId - c2.courseId;
	}
}

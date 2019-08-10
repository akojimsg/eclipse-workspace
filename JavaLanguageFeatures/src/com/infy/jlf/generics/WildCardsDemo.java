/**
 * 
 */
package com.infy.jlf.generics;

import java.util.ArrayList;
import java.util.List;

import com.infy.jlf.objects.*;

/**
 * @author ezekiel.inalegwu
 *
 */
public class WildCardsDemo {

	static class Record<E> {
		List<E> record = new ArrayList<>();

		@Override
		public String toString() {
			return "Record [record=" + record + "]";
		}

		public void add(E e) {
			record.add(e);
		}

		public void display(Record<? extends Student> record) {
			System.out.println("student record:" + record);
		}
	}

	/**
	 * 
	 */
	public WildCardsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void Execute(String args[]) {
		Record<Student> studentrecord = new Record<>();
		Student student = new Student(101, "Adam");

		Record<DayScholar> dayscholaarecord = new Record<>();
		DayScholar dayScholar = new DayScholar(102, "Robert", 10000f);

		studentrecord.add(student);
		studentrecord.display(studentrecord);

		dayscholaarecord.add(dayScholar);
		dayscholaarecord.display(dayscholaarecord);
	}

}

/**
 * 
 */
package com.infy.jlf.annotation;

import java.lang.reflect.Method;
import java.lang.annotation.*;
import com.infy.jlf.objects.*;

/**
 * @author ezekiel.inalegwu
 *
 */
public class AnnotationsTester {

	public static void Run() throws Exception {
        AssistantProfessor assistanceprofessor = new AssistantProfessor();
        double salary = assistanceprofessor.calculateSalary(4000,2000,1000,500);
        System.out.println(salary);	
        
        TestCustomAnnotation();
	}

	public static void TestCustomAnnotation() throws Exception {
		Student student = new DayScholar(1001, "Mary Jane", 2000);
		Class c = student.getClass();
		// Fetches the list of annotations of the class, DayScholar
		Annotation annotations[] = c.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			// Print the name of the annotation
			System.out.println(annotation.annotationType().getName());
			// Fetches the list of attributes of the annotation
			Method[] fields = annotation.annotationType().getDeclaredMethods();
			for (Method field : fields) {
				// Print the attribute name
				System.out.print(field.getName());
				// Fetch the value for the attribute
				Object value = field.invoke(annotation, (Object[]) null);
				System.out.println("\t" + value);
			}
		}
	}	
}

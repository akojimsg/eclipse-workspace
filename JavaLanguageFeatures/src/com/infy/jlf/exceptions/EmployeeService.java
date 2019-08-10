/**
 * 
 */
package com.infy.jlf.exceptions;

import com.infy.jlf.objects.Employee;

/**
 * @author ezekiel.inalegwu
 *
 */
public class EmployeeService {

	/**
	 * 
	 */
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void Execute(String[] args) {

		Employee e1 = new Employee("Joe Smith", 20, 5345);
		Employee e2 = new Employee("Lewis Jane", 21, 1345);
		Employee e3 = new Employee("Larry Page", 22, 245);
		Employee e4 = new Employee("Smith James", 23, 945);
		Employee e5 = new Employee("Elvis George", 25, 1425);
		EmployeeService empser = new EmployeeService();
		Employee[] emparray = { e1, e2, e3, e4, e5 };

		for (Employee employee : emparray) {
			// call check employee with appropriate exception handling code
			try {
				
				empser.checkEmployeeSalary(employee);
				
			}catch(EmpSalaryException e) {
				System.out.println(employee.getEmpName());
			}
		}

	}

	public void checkEmployeeSalary(Employee emp) throws EmpSalaryException {
		// Write the code here
		if (emp.getEmpSalary() < 1000) {
			throw new EmpSalaryException("Salary is below 1000");
		}
	}

}

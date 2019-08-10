/**
 * 
 */
package com.infy.jlf.objects;

/**
 * @author ezekiel.inalegwu
 *
 */
public class AssistantProfessor extends Professor {

    @Override
	public double calculateSalary(float basic,float DA,float HRA,float income_tax)
    {
        return (basic*0.7)+DA+HRA-income_tax;
    }
}

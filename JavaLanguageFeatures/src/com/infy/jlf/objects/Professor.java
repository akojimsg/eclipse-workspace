/**
 * 
 */
package com.infy.jlf.objects;

/**
 * @author ezekiel.inalegwu
 *
 */
public class Professor {

    String name;
    float basic;
 
    double calculateSalary(float basic,float DA,float HRA,float income_tax)
    {
        return basic+DA+HRA-income_tax;
    }

}

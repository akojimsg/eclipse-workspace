/**
 * 
 */
package com.infy.jlf.objects;

import com.infy.jlf.annotation.MethodInfo;

/**
 * @author ezekiel.inalegwu
 *
 */
public class DiamondCustomer extends Customer {

	@MethodInfo(author="John")
	@MethodInfo(author="Jane")
	@Override
	public void calculateAmount(int amount){
		System.out.println("the total amount");
		
	}
}

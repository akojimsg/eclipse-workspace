/**
 * 
 */
package com.infy.jlf.collection;

/**
 * @author ezekiel.inalegwu
 *
 */
public class CollectionsDemo {

	/**
	 * 
	 */
	public CollectionsDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void Run(String[] args) {
		// List Interface
		System.out.println();
		System.out.println("------- List Interface --------");
		ListInterface.Execute(args);

		// Set Interface
		System.out.println();
		System.out.println("------- Set Interface --------");
		SetInterface.Execute();

		// Map Interface
		System.out.println();
		System.out.println("------- Map Interface --------");
		MapInterface.Execute();

	}

}

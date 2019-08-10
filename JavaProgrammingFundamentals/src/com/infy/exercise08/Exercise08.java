package com.infy.exercise08;
/**
 * 
 */

/**
 * @author ezekiel.inalegwu
 *
 */
abstract class Branch {
	abstract public boolean validatePhotoProof(String proof);

	abstract public boolean validateAddressProof(String proof);

	public void openAccount(String photoProof, String addressProof, int amount) {
		if (amount >= 1000) {
			if (validateAddressProof(addressProof) && validatePhotoProof(photoProof)) {
				System.out.println("Account opened");
			} else {
				System.out.println("cannot open account");
			}
		} else {
			System.out.println("cannot open account");
		}
	}
}

class MumbaiBranch extends Branch {
	public boolean validatePhotoProof(String proof) {
		if (proof.equalsIgnoreCase("pan card")) {
			return true;
		}
		return false;
	}

	public boolean validateAddressProof(String proof) {
		if (proof.equalsIgnoreCase("ration card")) {
			return true;
		}
		return false;
	}
}

public class Exercise08 {

	/**
	 * @param args
	 */
	public static void Run(String[] args) {
		
		System.out.println();
		System.out.println("-------------- Excercise 08 -------------------");
		System.out.println();
		
		Branch mumbaiBranch = new MumbaiBranch();
		mumbaiBranch.openAccount("pan card", "ration card", 2000);
	}

}

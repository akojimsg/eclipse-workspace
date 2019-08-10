/**
 * 
 */
package com.infy.jlf.objects;

/**
 * @author ezekiel.inalegwu
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {

	public static boolean validateMobileNumber(String mobileNumber) {
		Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher mobileMatcher = regex.matcher(mobileNumber);
		return mobileMatcher.matches();
	}

	public static boolean validateSSNumber(String ssNumber) {
		Pattern regex = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
		Matcher ssnMatcher = regex.matcher(ssNumber);
		return ssnMatcher.matches();
	}	
	
	public static boolean validateEmailAddress(String emailAddress) {
		Pattern regex = Pattern.compile("([\\w]+[.\\-_]?[\\w]+)+@[\\w]+([.][a-z]+){2}");
		Matcher emailMatcher = regex.matcher(emailAddress);
		return emailMatcher.matches();
	}	
	
	/**
	 * @param args
	 */
	public static void Run() {
		
		String mobileNumber = "111-222-3333";
		String ssNumber = "123-85-3456";
		String emailAddress = "some_email.address@domain.tld.ex";
		
		System.out.println(String.format("Testing pattern %s for mobile Number: {Matched: %s}", 
				mobileNumber, RegexTester.validateMobileNumber(mobileNumber)));
		System.out.println(String.format("Testing pattern %s for mobile Number: {Matched: %s}", 
				ssNumber, RegexTester.validateMobileNumber(ssNumber)));
		
		System.out.println(String.format("Testing pattern %s for social security Number: {Matched: %s}", 
				ssNumber, RegexTester.validateSSNumber(ssNumber)));
		System.out.println(String.format("Testing pattern %s for social security Number: {Matched: %s}", 
				mobileNumber, RegexTester.validateSSNumber(mobileNumber)));
		
		System.out.println(String.format("Testing pattern %s for email Address: {Matched: %s}", 
				emailAddress, RegexTester.validateEmailAddress(emailAddress)));
		System.out.println(String.format("Testing pattern %s for email Address: {Matched: %s}", 
				emailAddress, RegexTester.validateEmailAddress(mobileNumber)));		
	}

}

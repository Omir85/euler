package org.omir.euler.utils.string;

public class StringUtils {

	public static boolean isPalindrome(int i) {
		String stringRepresentation = String.valueOf(i);
		return stringRepresentation.equals(reverse(stringRepresentation));
	}

	public static String reverse(String string) {
		StringBuilder inverter = new StringBuilder(string.length());
		for (int i = string.length() - 1; i >= 0; i--) {
			inverter.append(string.substring(i, i + 1));
		}
		return inverter.toString();
	}

}

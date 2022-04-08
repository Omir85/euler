package org.omir.euler.utils.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

	private StringUtils() {}
	
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

	public static List<String> split(String input, String separator) {
		List<String> list = new ArrayList<>();
		String[] split = input.split(separator);
		for (String element : split) {
			list.add(element);
		}
		return list;
	}

	public static List<String> split(String input) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			list.add(input.substring(i, i + 1));
		}
		return list;
	}

	public static List<String> trimOutShortStrings(List<String> list, int size) {
		List<String> trimmed = list.stream()
				.filter(s -> s.length() >= size)
				.collect(Collectors.toList());
		return trimmed;
	}

}

package org.omir.euler.utils.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
	
	public static List<Integer> castArrayToList(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		return list;
	}
	
}

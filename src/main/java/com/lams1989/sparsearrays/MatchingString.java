package com.lams1989.sparsearrays;

public class MatchingString {

	public static int[] matchingString(String[] strings, String[] queries) {
		int[] result = new int[queries.length];
		
		for (int i = 0; i < queries.length; i++) {
			int count = 0;
			
			for (int j = 0; j < strings.length; j++) {
				if (queries[i].equals(strings[j])) {
					count++;
				}

			}
			result[i] = count;
		}

		return result;

	}
}

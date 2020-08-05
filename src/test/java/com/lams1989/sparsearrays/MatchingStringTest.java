package com.lams1989.sparsearrays;

import junit.framework.TestCase;

public class MatchingStringTest extends TestCase {

	public void testMatchingString1() {
		String[] array = { "aba", "baba", "aba", "xzxb" };
		String[] querys = { "aba", "xzxb","ab" };
		int[] actual = MatchingString.matchingString(array, querys);
		int[] expected = { 2, 1, 0 };

		for (int j = 0; j < expected.length; j++) {
			assertEquals(expected[j], actual[j]);
		}

	}
}


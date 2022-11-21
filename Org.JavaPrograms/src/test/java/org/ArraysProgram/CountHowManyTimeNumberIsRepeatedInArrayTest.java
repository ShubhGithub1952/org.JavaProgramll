package org.ArraysProgram;

import java.util.LinkedHashSet;

public class CountHowManyTimeNumberIsRepeatedInArrayTest {
	public static void main(String[] args) {
		int [] a= {4,1,1,2,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(i);
		}
		
		for (Integer arr : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (arr==a[i]) {
					count++;
				}
			}
		}
	}
}

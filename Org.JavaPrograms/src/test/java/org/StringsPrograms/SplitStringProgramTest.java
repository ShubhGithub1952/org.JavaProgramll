package org.StringsPrograms;

public class SplitStringProgramTest {
	public static void main(String[] args) {
		String s="My Name is Shubham";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

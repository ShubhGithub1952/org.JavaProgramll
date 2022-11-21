package org.StringsPrograms;
/** 
 * String s= a3#f4&&
 * @author SHUBH
 *
 */
public class SegregationOfDataTypesFromStringTest {
	public static void main(String[] args) {
		String str="a/b$c2/3&";
		String alpha=" ";
		String integer=" ";
		String SpecialChar=" ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z') {
				alpha=alpha+str.charAt(i);
			}
			else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				integer=integer+str.charAt(i);
			}
			else {
				SpecialChar=SpecialChar+str.charAt(i);
			}
		}
		System.out.println(alpha+integer+SpecialChar);
		
	}
}

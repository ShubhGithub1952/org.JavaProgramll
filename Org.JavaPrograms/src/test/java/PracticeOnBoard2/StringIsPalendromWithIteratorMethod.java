package PracticeOnBoard2;

import java.util.ArrayList;
import java.util.Iterator;

public class StringIsPalendromWithIteratorMethod {
	public static void main(String [] args){

		String str1="MALAYALAMA";

		String str=str1.toLowerCase();

		ArrayList<Character> list = new ArrayList<Character>();

		for(int i=str.length()-1 ; i>=0;i--){
		
		list.add(str.charAt(i));
	       }
		Iterator<Character> it = list.iterator();
		 int count=0;
		while(it.hasNext()){
		for(int i=0 ; i< str.length() ; i++) {
		if (str.charAt(i)==it.next()){
			count++;
		}
	    }
		if(count==str.length()){
		System.out.println((str+" := is a Palendrom !"));
	     }
		else{System.out.println((str+" := isnot a Palendrom !"));}
	  }
	 }
}

package com.practice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String a = "MoTHer InLaw";
	 	String b = "Hitler Woman";
		
		System.out.println("Is "+a+ " and "+ b + " Anagram: " + (anagramCheck(a,b)==true? "Yes" : "No"));
	}

	private static boolean anagramCheck(String a, String b) {
		a = a.toLowerCase().replaceAll("\\s", "");
		b = b.toLowerCase().replaceAll("\\s", "");
		
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length!=c2.length) return false;
		
		return Arrays.equals(c1, c2);
	}

}

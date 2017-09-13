package com.practice;

public class Rotation {

	public static void main(String[] args) {
		String a = "apple";
		String b = "elppa";
		
		System.out.println("Is "+a+ " rotation of "+ b + " : " + (rotation(a,b)==true? "Yes" : "No"));

	}
	
	public static boolean rotation(String a, String b){
		char [] c1 = a.toCharArray();
		char [] c2 = b.toCharArray();
		int len;
		if(c1.length != c2.length){
			return false;
		}else{
		 	len = c1.length;
		}
		
		for (int i = 0; i<len; i++){
			if(c1[i]!=c2[--len]){
				return false;
			}
		}
		
		return true;
	}
}

package com.practice;

import java.util.Arrays;

public class FirstRepeatChar {

	public static void main(String[] args) {
		String a = "altyuikkill";
		char l = firstRepeatChar(a);
		System.out.println("First repeated character in a String: "+l);
	}

	private static char firstRepeatChar(String a) {
		char [] c = a.toCharArray();
		
		for(int i =0; i<c.length; i++ ){
			
			for(int j = i+1; j<c.length; j++){
				if(c[i] == c[j]) 
					return c[i];
			}
		}
		return 0;

	}
	
}

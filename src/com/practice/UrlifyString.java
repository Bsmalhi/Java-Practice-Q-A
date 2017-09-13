package com.practice;

import java.util.Arrays;
import java.util.Vector;

public class UrlifyString {

	public static void main(String[] args) {
		
		String sample = "Java is a programming Language";
		urlify(sample);
		
	}
	public static void urlify(String a){
		int len = a.length();
		String result = "";
		 String[] v = new String[len];
		v = a.split("");
		for (int i = 0; i<len; i++){
			if(v[i].equals(" ")){
				v[i] = "%20";
			}
		}

		for(String n: v){
			result += n;
		}
		
		System.out.println(result);
	}
}

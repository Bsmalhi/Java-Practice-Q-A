package com.practice;
import java.lang.*;
import java.util.Arrays;
import java.util.Vector;

public class StringFunctions {

	public static void main(String[] args) {
		
//		String l = "Solar";
//		char a = charAt(4, l);
//		System.out.println("CharAt is "+a);
//		char [] c = toCharArray(l);
//		for(char k: c){
//			System.out.print(k + " ");
//		}
//		System.out.println();
//		System.out.println("length of string: "+length(l));
//		String n = "System";
//		String con = concat(l,n);
//		System.out.println(con);
//		System.out.println(replace(con, 'S', 'n'));
//		String low = "getmeUpperCasenow";
//		System.out.println("To lowerCase:" +toLowerCase(low));
//		String  up= "getmeuppeRcasenow";
//		System.out.println("To upperCase: " +toUpperCase(up));
//		System.out.println("Substring: "+subString(up, 0, 4));
//		String s = "hel lolove";
//		System.out.println("trimmed: "+trim(s));
		String g = "hel,opp,paaa";
//		System.out.println("split: "+ Arrays.toString(g.split(" ")));
		System.out.println("split: "+ Arrays.toString(split(g, ',')));

		
	}

	public static char charAt(int index, String w){
		char[] c = w.toCharArray();
		return c[index];
	}
	
	public static char[] toCharArray(String l){
		int length = length(l);
		char[] c = new char[length];
		for (int i=0; i<length; i++){
			c[i] = charAt(i, l);
		}
		return c;
	}
	public static int length(String val){
		int count = 0;
		try{
		while(true){
			val.charAt(count);
			count++;
		}
		}catch(StringIndexOutOfBoundsException e){
			return count;
		}
	}
	public static String concat(String a, String b){
		return a + b;
	}
	
	public static String replace(String val, char o, char n){
		int length = length(val);
		char[] c = toCharArray(val);
		for(int i = 0; i<length; i++){
			if(c[i] == o){
				c[i] = n;
			}
		}
		String a = "";
		for(char letter: c) a += letter;
		return a;
	}

	public static String toLowerCase(String v){
		int length = length(v);
		String ns = "";
		for(int i =0; i<length; i++){
			char a = charAt(i, v);
			if(a >=65 && a<=90){
				ns += (char) (a + 32);
			}else{
				ns += a;
			}
		}
		return ns;
	}
	public static String toUpperCase(String v){
		int length = length(v);
		String ns = "";
		for(int i =0; i<length; i++){
			char a = charAt(i, v);
			if(a >=97 && a<=122){
				ns += (char) (a - 32);
			}else{
				ns += a;
			}
		}
		return ns;
	}
	
	public static String subString(String v, int begin, int end){
		char[] c = toCharArray(v);
		String n = "";
		for (int i=begin; i<end; i++) 
			n += c[i];
		return n;
	}
	
	public static String trim(String v){

		int length = length(v);
		int i = 0;
		char[] c = toCharArray(v);
		String n = "";
		while((i<length) && (c[i]<= ' ')){
			i++;
		}
		while((i<length)&&(c[length-1]<=' ')){
			length--;
		}
		if( i>0 && length< length(v))
		return subString(v, i,length);
		
		return v;
		
	}
	public static String[] split(String v, char seperator){
		Vector s = new Vector();
		char [] c = toCharArray(v);
//		String n = "";
		int start = 0;
		int i = 0;
		int length = length(v);
		while((i<length)){
		
			if(c[i]==seperator){
				s.add(subString(v, start, i));
				start = ++i;
			}
			i++;
		}
		s.add(subString(v, start, length));
		
		String [] arr = new String[s.size()];
		s.copyInto(arr);
		return arr;
	}
	
	
}

package com.love2code.arraymanipulations;

import java.util.Arrays;

public class Anagrams {

	private static String text1="tictok";
	private static String text2="tikodt";
	
	public static void main(String[] args) {
		boolean isAnagram=findAnagrams(text1, text2);
		System.out.println(isAnagram);
	}

	private static boolean findAnagrams(String text12, String text22) {
		if(text12.length()!=text22.length()) return false;
		char[] charArray1=text12.toCharArray();
		char[] charArray2=text22.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		for(int i=0; i<text12.length(); i++){
			
			if(charArray1[i]!=charArray2[i]) return false;
		}
		return true;
	}
}

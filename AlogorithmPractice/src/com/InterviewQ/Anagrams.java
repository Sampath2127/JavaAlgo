package com.InterviewQ;

import java.util.Arrays;

public class Anagrams {
	
	public boolean isAnagram(String str1, String str2){
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			str1=new String(ch1);
			str2=new String(ch2);
			return str1.equals(str2);
		
		
		
	}

	public static void main(String[] args) {

		Anagrams obj=new Anagrams();
		System.out.println("The given strings are anagrams :"+obj.isAnagram("cin", "cin") );
	}

}

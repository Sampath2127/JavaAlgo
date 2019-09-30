package com.InterviewQ;


public class ReturnFirstNames {

	public static void main(String[] args) {
		
		
		String[] str=new String[]{"Sam Koms", "Bhar Thots", "Julie Anderson"};
		String[] firstNames=ReturnFirstNames.returnFirstNameValue(str);
		for(String s:firstNames){
			System.out.println(s);
		}
	}

	private static String[] returnFirstNameValue(String[] str) {
		String[] firstNames=new String[str.length];
		for(int i=0; i<str.length; i++){
			firstNames[i]=str[i].split(" ")[0];
		}
		return firstNames;
	}

}

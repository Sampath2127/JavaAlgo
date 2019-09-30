package com.InterviewQ;

import java.util.HashMap;

public class Anagrams2 {
HashMap<Character, Integer> map=new HashMap<>();
	public boolean isAnagram(String first, String second){
		if(first.length()!=second.length()) return false;
		char c;
		int count=0;
		String str1=first.toLowerCase();
		String str2=second.toLowerCase();
		
		for(int i=0; i<str1.length(); i++){
			c=str1.charAt(i);
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c,1);
			}
		}
			for(char c1: str2.toCharArray()){
			if(map.containsKey(c1)){
				map.put(c1, map.get(c1)-1);
			}else{
				map.put(c1, 1);
			}
		}
		for(int val:map.values()){
			 count += Math.abs(val);
		}
	if(count==0) return true;
		
		return false;
	}
	public static void main(String[] args) {
		System.out.println(new Anagrams2().isAnagram("SAMpp", "Sammp"));
	}

}

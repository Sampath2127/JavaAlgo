package com.lovecoding.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	private static List<String> list=new ArrayList<>();
	
	public static void main(String[] args) {
		list.add("Adam");
		list.add("Joe");
		list.add("Gary");
		list.add("Adam");
		list.add("Joe");
		list.add("Gary");
		
		for(String s:list)
			System.out.println(s);
	}
	
}

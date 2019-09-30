package com.InterviewQ;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Temp {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		List<Integer> list=new ArrayList<Integer>();
		list.add(0, 100);
		list.add(0, list.get(0)+100);
		map.put(1,3);
		map.put(null,4);
		map.put(1,5);
		Random rand=new Random();
		//System.out.println(rand.nextInt(5));
		System.out.print(Long.MAX_VALUE);
	}

}

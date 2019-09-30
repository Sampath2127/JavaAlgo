package com.InterviewQ;

import java.util.Scanner;

public class AddUnderScores {

	public static void main(String[] args) {
			Scanner scr=new Scanner(System.in);
//			String str=scr.nextLine();
//			str=str.replaceAll(" ", "_");
//			System.out.println(str);
//			scr.close();
			int a,b,c;
			
			a=scr.nextInt();
			for(int i=0; i<2; i++){
			b=a++;
			System.out.println("Value of a after pre increment 'a' value "+a);
			c=++a;
			System.out.println("Value of b after assignig 'a' value "+b);
			System.out.println("Value of a after pre increment 'a' value "+a);
			System.out.println("Value of c after post increment 'a' value "+c);
			}
	}
		
}

package com.lovecoding.recursiveProblems;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TowerOfHanoi tOH=new TowerOfHanoi();
		tOH.move(5, 'A', 'C', 'B'); 
	}

	private void move(int numOfDiscs, char from, char to, char intermediate) {
	if(numOfDiscs==1)
		System.out.println("Moving Disc 1 from "+from+" to "+to+" using "+intermediate);
	else{
		move(numOfDiscs-1, from, intermediate, to);
		System.out.println("Moving Disc "+numOfDiscs+" from "+from+" to "+to+" using "+intermediate);
		move(numOfDiscs-1, intermediate, to, from);
	}
	}

}

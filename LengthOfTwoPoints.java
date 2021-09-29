package com.bridgelabz.linecomparison;
//UC1
public class LengthOfTwoPoints {
	public static void main(String[] args) {
		int x1=1,y1=1,x2=4,y2=4;
		double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of Two Points="+length);
	}
}

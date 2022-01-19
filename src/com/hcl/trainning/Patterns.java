package com.hcl.trainning;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// OddEvenPatern();
		OddEvenCharAsteriskPattern();

	}
	private static void OddEvenPatern() {
		int k =4;
		for(int i =1; i<= 5; i++) {
			int lastJCount =0;
			if(k == 0) lastJCount = -1;
			for(int j=0; j<k; j++) {
				System.out.print("*");
				lastJCount = j;
			}
			for(int a = lastJCount+1; a<5; a++) {
				if(i%2 == 0) System.out.print("E");
				else System.out.print("O");
			}
			k--;
			System.out.println();
		}
	}
	
	private static void OddEvenAsteriskPattern() {
		for(int i = 0; i < 5; i++) {
			int k = (i%2 == 0) ? 5 : 3;
			for(int j = 0; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void OddEvenCharAsteriskPattern() {
		for(int i = 0; i < 5; i++) {
			String outside = (i%2 == 0) ? "O" : "*";
			String inside = (i%2 == 0) ? "*" : "E";
			for(int j = 0; j <= 2; j++) {
				if(j%2 == 0) System.out.print(outside + outside);
				else System.out.print(inside + inside);
			}
			System.out.println();
		}
	}

}

package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		int user = 0;
		
		
		int[] num = {4, 7, 2, 9, 1};
		
		 user = findMaxDifference(num);
		
		 System.out.println(user);
	}
	
	public static int findMaxDifference (int[] num) {
		
		int max = 0;
		int test = 0;
		
		if(num.length > 2) {
		for(int i = 0; i < num.length ; i++) {
			
			//I just couldnt remember how to compare each without going out of bounds ran out of time and such and was overwhelmed/overloaded.
			test = num[i] - num[i];
			
			if(test > max) {
				max = test;
			}
		}
		}
		return max;
		
		
	}

}

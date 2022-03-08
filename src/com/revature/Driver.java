package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Integer> answer = new ArrayList<Integer>();
		List<Integer> fibarr = new ArrayList<Integer>();
		int lim = 4000000;
		fibarr = fibcreate(lim);
		int ans = 0;
		
		for (int i = 0; i < fibarr.size(); i++) {
			if ((fibarr.get(i) % 2) == 0) {
				answer.add(fibarr.get(i));
			}
		}
		
		for (int a : answer) {
			ans = ans + a;
		}
		
		System.out.println("The sum is: " + ans);
		
		

	}
	
	
	private static ArrayList<Integer> fibcreate(int num) {
		
		List<Integer> fin = new ArrayList<Integer>();
		
		int n1 = 1;
		int n2 = 2;
		int n3 = 0;
		
		fin.add(n1);
		fin.add(n2);
		
		for (int i = 2; i < num; i++) {
			n3 = fin.get(i-2) + fin.get(i-1);
			
			if (n3 <= num) {
				fin.add(n3);
			}
			
			if (n3 >= num) {
				i = num;
			}
		}
		/*
		for (int a : fin) {
			System.out.println(a);
		}*/
		
		return (ArrayList<Integer>) fin;
	}

}

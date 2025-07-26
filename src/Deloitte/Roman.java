package Deloitte;

import java.util.*;

import java.util.Scanner;

public class Roman {
	
//
//Write a Java method that converts a roman numeral("XIV") into its
//corresponding integer value (14)

	int Num(char rom) {
		
		if(rom == 'I') return 1;
		if(rom == 'V') return 5;
		if(rom == 'X') return 10;
		if(rom == 'L') return 50;
		if(rom == 'D') return 100;
		if(rom == 'M') return 1000;
		return -1;
	}
	
	int romInt(String str) {
		
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int s1=Num(str.charAt(i));  // 1 
			if(i+1<str.length()) {
				int s2=Num(str.charAt(i+1)); // 1
				if(s1>=s2) {
					sum=sum+s1;
				}
				else {
					sum=sum-s1;
				}
			}
			else {
				sum= sum+s1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
	
		
		
		String s="II";
		
		Roman obj= new Roman();
	int ans=	obj.romInt(s);
	System.out.println(ans); // 2
			
		
	}

}
